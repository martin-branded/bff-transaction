package ar.com.branded.bfftransaction.repository;

import ar.com.branded.bfftransaction.repository.model.jdbc.ProductTable;

import java.util.List;

public interface SaveProducts {
    void execute(List<ProductTable> productList);
}
