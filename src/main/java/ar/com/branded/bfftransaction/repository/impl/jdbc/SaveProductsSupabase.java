package ar.com.branded.bfftransaction.repository.impl.jdbc;

import ar.com.branded.bfftransaction.repository.SaveProducts;
import ar.com.branded.bfftransaction.repository.model.jdbc.ProductTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.UUID;

import static ar.com.branded.bfftransaction.config.SqlSatements.UPSERT_PRODUCTS_SQL;

@Repository
public class SaveProductsSupabase implements SaveProducts {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SaveProductsSupabase(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional
    public void execute(List<ProductTable> productList) {
        jdbcTemplate.batchUpdate(
                UPSERT_PRODUCTS_SQL,
                productList,
                100,
                (PreparedStatement ps, ProductTable product) ->{
                    ps.setInt(1, product.getId());
                    ps.setString(2, product.getName());
                    ps.setBoolean(3, true);
                    ps.setObject(4, UUID.fromString(product.getUser_id()));
                    ps.setString(5, product.getImage_url());
                    ps.setString(6, product.getPrice());
                    ps.setString(7, product.getDescription());
                    ps.setInt(8, Integer.parseInt(product.getStock()));
                });
    }
}
