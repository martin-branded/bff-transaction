package ar.com.branded.bfftransaction.repository.impl.jdbc;

import ar.com.branded.bfftransaction.model.domain.Look;
import ar.com.branded.bfftransaction.repository.RetriverLooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.UUID;

import static ar.com.branded.bfftransaction.config.SqlSatements.RETRIVER_PAGEABLE_LOOK_SQL;

public class RetriverLooksSupabase implements RetriverLooks {

    private JdbcTemplate jdbcTemplate;
    @Autowired
    public RetriverLooksSupabase(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Look> execute(int page, int size) {
        return jdbcTemplate.query(RETRIVER_PAGEABLE_LOOK_SQL, lookRowMapper(), size, page * size);
    }

    private RowMapper<Look> lookRowMapper() {
        return (resultSet, rowNum) -> {
            Look look = new Look();
            UUID userId = (UUID) resultSet.getObject("user_id");
            look.setUserId(userId.toString());
            look.setPhoto(resultSet.getString("photo"));
            look.setTitle(resultSet.getString("title"));
            look.setCreatedAt(resultSet.getString("created_at"));
            Integer lookId = resultSet.getInt("look_id");
            look.setLookId(lookId.toString());
            return look;
        };
    }
}