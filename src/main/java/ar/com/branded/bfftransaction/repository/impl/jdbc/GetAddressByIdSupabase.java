package ar.com.branded.bfftransaction.repository.impl.jdbc;

import ar.com.branded.bfftransaction.model.domain.Address;
import ar.com.branded.bfftransaction.repository.GetAddressById;
import ar.com.branded.bfftransaction.repository.model.jdbc.AddressProfileTable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static ar.com.branded.bfftransaction.config.SqlSatements.SELECT_ADDRESS_BY_ID_SQL;

@Repository
public class GetAddressByIdSupabase implements GetAddressById {

    private final JdbcTemplate jdbcTemplate;

    public GetAddressByIdSupabase(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Address execute(String addressId) {
        return jdbcTemplate.queryForObject(
                        SELECT_ADDRESS_BY_ID_SQL,
                        addressProfileRowMapper(),
                        addressId
                        ).toDomain();
    }

    private RowMapper<AddressProfileTable> addressProfileRowMapper() {
        return (resultSet, rowNum) -> {
            AddressProfileTable addressProfileTable = new AddressProfileTable();
            addressProfileTable.setId(resultSet.getLong("id"));
            addressProfileTable.setProfileId((UUID) resultSet.getObject("profle_id"));
            addressProfileTable.setAddress(resultSet.getString("address"));
            addressProfileTable.setNumber(resultSet.getString("number"));
            addressProfileTable.setFloor(resultSet.getString("floor"));
            addressProfileTable.setLocality(resultSet.getString("locality"));
            addressProfileTable.setCity(resultSet.getString("city"));
            addressProfileTable.setProvince(resultSet.getString("province"));
            addressProfileTable.setZipcode(resultSet.getString("zipcode"));
            addressProfileTable.setCreatedAt(resultSet.getTimestamp("created_at"));
            return addressProfileTable;
        };
    }
}
