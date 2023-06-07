package ar.com.branded.bfftransaction.repository.impl.jdbc;

import ar.com.branded.bfftransaction.model.domain.Product;
import ar.com.branded.bfftransaction.repository.RetriverProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.UUID;

import static ar.com.branded.bfftransaction.config.SqlSatements.RETRIVER_PAGEABLE_PRODUCT_SQL;

public class RetriverProductsSupabase implements RetriverProducts {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public RetriverProductsSupabase (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Product> execute(int page, int size) {
        return jdbcTemplate.query(RETRIVER_PAGEABLE_PRODUCT_SQL, productRowMapper(), size, page * size);
    }

    private RowMapper<Product> productRowMapper() {
        return (resultSet, rowNum) -> {
            Product product = new Product();
            UUID userId = (UUID) resultSet.getObject("user_id");
            product.setUserId(userId.toString());
            Integer productId = resultSet.getInt("product_id");
            product.setProductId(productId.toString());
            product.setName(resultSet.getString("name"));
            product.setCreatedAt(resultSet.getString("created_at"));
            product.setDescription(resultSet.getString("description"));
            product.setPrice(resultSet.getString("price"));
            product.setImageUrl(resultSet.getString("image_url"));
            Integer stock = resultSet.getInt("stock");
            product.setStock(stock.toString());
            product.setStatus(resultSet.getBoolean("status"));

            return product;
        };
    }
}
