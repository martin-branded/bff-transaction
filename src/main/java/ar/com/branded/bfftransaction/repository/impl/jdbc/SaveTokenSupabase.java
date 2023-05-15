package ar.com.branded.bfftransaction.repository.impl.jdbc;

import ar.com.branded.bfftransaction.repository.SaveToken;
import ar.com.branded.bfftransaction.repository.model.rest.TokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import static ar.com.branded.bfftransaction.config.SqlSatements.UPSERT_TOKEN_SQL;

@Repository
public class SaveTokenSupabase implements SaveToken {


    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public SaveTokenSupabase(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void execute(TokenResponse token) {
        jdbcTemplate.update(
                UPSERT_TOKEN_SQL,
                token.getAccess_token(),
                token.getUser_id());
    }
}
