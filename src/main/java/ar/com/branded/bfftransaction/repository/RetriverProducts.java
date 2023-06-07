package ar.com.branded.bfftransaction.repository;

import ar.com.branded.bfftransaction.model.domain.Product;

import java.util.List;

public interface RetriverProducts {
    List<Product> execute(int page, int size);
}

