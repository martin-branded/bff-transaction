package ar.com.branded.bfftransaction.repository.impl.jdbc;

import ar.com.branded.bfftransaction.model.domain.User;
import ar.com.branded.bfftransaction.repository.GetUserById;
import org.springframework.stereotype.Repository;

@Repository
public class GetUserByIdSupabase implements GetUserById {
    @Override
    public User execute(String userId) {
        return null;
    }
}
