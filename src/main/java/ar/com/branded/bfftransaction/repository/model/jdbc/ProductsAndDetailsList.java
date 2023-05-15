package ar.com.branded.bfftransaction.repository.model.jdbc;

import java.util.List;

public class ProductsAndDetailsList {

    private List<ProductTable> products;
    private List<ProductDetailsTable> productDetails;

    public List<ProductTable> getProducts() {
        return products;
    }

    public void setProducts(List<ProductTable> products) {
        this.products = products;
    }

    public List<ProductDetailsTable> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(List<ProductDetailsTable> productDetails) {
        this.productDetails = productDetails;
    }
}
