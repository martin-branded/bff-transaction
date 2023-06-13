package ar.com.branded.bfftransaction.service;

import ar.com.branded.bfftransaction.model.domain.Order;

import java.util.List;

public interface GenerateOrder {

    void execute(String idUser, List<String> productId, String addresId);
}
