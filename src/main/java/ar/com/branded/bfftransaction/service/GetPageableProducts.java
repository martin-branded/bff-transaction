package ar.com.branded.bfftransaction.service;

import ar.com.branded.bfftransaction.model.domain.Product;

import java.util.List;

public interface GetPageableProducts {
    List<Product> execute(int page, int size);
}
