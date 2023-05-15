package ar.com.branded.bfftransaction.repository.impl.jdbc;

import ar.com.branded.bfftransaction.repository.GetTokenByProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static ar.com.branded.bfftransaction.config.SqlSatements.SELECT_TOKEN_BY_PROFILE_SQL;

@Repository
public class GetTokenSupabase implements GetTokenByProfile {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public GetTokenSupabase(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String execute(String profileId) {
        RowMapper<String> rowMapper = (rs, rowNum) -> rs.getString("token_tiendanube");
        return jdbcTemplate.queryForObject(
                SELECT_TOKEN_BY_PROFILE_SQL,
                rowMapper,
                UUID.fromString(profileId)
        );
    }
}
