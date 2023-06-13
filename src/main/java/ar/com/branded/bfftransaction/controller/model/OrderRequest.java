package ar.com.branded.bfftransaction.controller.model;


import java.util.List;

public class OrderRequest {

    private String addressId;
    private List<String> productId;


    public List<String> getProductId() {
        return productId;
    }

    public void setProductId(List<String> productId) {
        this.productId = productId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

}
