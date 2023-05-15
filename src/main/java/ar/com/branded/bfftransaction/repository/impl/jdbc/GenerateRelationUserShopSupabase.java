package ar.com.branded.bfftransaction.repository.impl.jdbc;

import ar.com.branded.bfftransaction.model.domain.Auth;
import ar.com.branded.bfftransaction.repository.GenerateRelationUserShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static ar.com.branded.bfftransaction.config.SqlSatements.UPDATE_RELATION_USER_TOKEN_SQL;

@Repository
public class GenerateRelationUserShopSupabase implements GenerateRelationUserShop {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public GenerateRelationUserShopSupabase(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void execute(Auth auth) {
        jdbcTemplate.update(
                UPDATE_RELATION_USER_TOKEN_SQL,
                UUID.fromString(auth.getProfile_id()),
                auth.getCode());
    }
}
