package ar.com.branded.bfftransaction.repository;

import ar.com.branded.bfftransaction.model.domain.Address;
import ar.com.branded.bfftransaction.model.domain.PreOrder;
import ar.com.branded.bfftransaction.model.domain.User;

import java.util.List;

public interface GenerateOrderByUserAndAddress {

    PreOrder execute(User user, Address order, List<String> productId);
}
