package ar.com.branded.bfftransaction.repository;

import ar.com.branded.bfftransaction.model.domain.Auth;
import ar.com.branded.bfftransaction.repository.model.rest.Product;

import java.util.List;

public interface GetAllProductsByAuth {

    List<Product> execute(Auth auth, String token);
}
