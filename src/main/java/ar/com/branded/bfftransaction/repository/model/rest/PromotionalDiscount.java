package ar.com.branded.bfftransaction.repository.model.rest;

import java.util.List;

public class PromotionalDiscount {
    private String id;
    private int store_id;
    private int order_id;
    private String created_at;
    private String total_discount_amount;
    private List<String> contents;
    private List<String> promotions_applied;
}
