package ar.com.branded.bfftransaction.repository;

import ar.com.branded.bfftransaction.repository.model.jdbc.ProductDetailsTable;

import java.util.List;

public interface SaveProductsDetails {
    void execute(List<ProductDetailsTable> productDetails);
}
