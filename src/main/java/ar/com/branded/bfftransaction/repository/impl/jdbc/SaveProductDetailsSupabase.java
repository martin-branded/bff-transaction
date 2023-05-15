package ar.com.branded.bfftransaction.repository.impl.jdbc;

import ar.com.branded.bfftransaction.repository.SaveProductsDetails;
import ar.com.branded.bfftransaction.repository.model.jdbc.ProductDetailsTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
import java.util.List;

import static ar.com.branded.bfftransaction.config.SqlSatements.UPSERT_PRODUCTS_DETAILS_SQL;

@Repository
public class SaveProductDetailsSupabase implements SaveProductsDetails {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SaveProductDetailsSupabase(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional
    public void execute(List<ProductDetailsTable> productDetails) {
        jdbcTemplate.batchUpdate(
                UPSERT_PRODUCTS_DETAILS_SQL,
                productDetails,
                100,
                (PreparedStatement ps, ProductDetailsTable variant) -> {
                    ps.setInt(1, variant.getId());
                    ps.setInt(2, Integer.parseInt(variant.getProductId()));
                    ps.setString(3, variant.getPrice());
                    ps.setString(4, variant.getSize());
                    ps.setString(5, variant.getColor());
                    ps.setInt(6, variant.getStock());
                    ps.setString(7, variant.getWeight());
                    ps.setString(8, variant.getDepth());
                    ps.setString(9, variant.getWidth());
                    ps.setString(10, variant.getHeight());
                    ps.setString(11, variant.getPromotional_price());
                    ps.setString(12, variant.getImage_url());
                }
        );

    }
}
