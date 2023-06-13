package ar.com.branded.bfftransaction.repository;

import ar.com.branded.bfftransaction.model.domain.User;

public interface GetUserById {

    User execute(String userId);
}
