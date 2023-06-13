package ar.com.branded.bfftransaction.repository.model.rest;

public class OrderProduct {
    private int variant_id;
    private int quantity;

    public int getVariant_id() {
        return variant_id;
    }

    public void setVariant_id(int variant_id) {
        this.variant_id = variant_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
