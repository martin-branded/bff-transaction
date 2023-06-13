package ar.com.branded.bfftransaction.repository;

import ar.com.branded.bfftransaction.model.domain.Address;

public interface GetAddressById {

    Address execute(String addressId);
}
