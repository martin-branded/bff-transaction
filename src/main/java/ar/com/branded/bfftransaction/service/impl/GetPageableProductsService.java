package ar.com.branded.bfftransaction.service.impl;

import ar.com.branded.bfftransaction.model.domain.Product;
import ar.com.branded.bfftransaction.repository.RetriverProducts;
import ar.com.branded.bfftransaction.service.GetPageableProducts;
import jakarta.annotation.Resource;

import java.util.List;

public class GetPageableProductsService implements GetPageableProducts {
    @Resource(name = "retriverProducts")
    private RetriverProducts retriverProducts;

    @Override
    public List<Product> execute(int page, int size) {
        return retriverProducts.execute(page, size);
    }
}
