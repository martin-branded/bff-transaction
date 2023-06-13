package ar.com.branded.bfftransaction.repository.model.rest;

import ar.com.branded.bfftransaction.model.domain.Address;

public class Shipping {
    private String cost;
    private Address shipping_address;

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Address getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(Address shipping_address) {
        this.shipping_address = shipping_address;
    }
}
