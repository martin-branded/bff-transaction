package ar.com.branded.bfftransaction.service.impl;

import ar.com.branded.bfftransaction.model.domain.Address;
import ar.com.branded.bfftransaction.model.domain.Order;
import ar.com.branded.bfftransaction.model.domain.PreOrder;
import ar.com.branded.bfftransaction.model.domain.User;
import ar.com.branded.bfftransaction.repository.GenerateOrderByUserAndAddress;
import ar.com.branded.bfftransaction.repository.GetAddressById;
import ar.com.branded.bfftransaction.repository.GetUserById;
import ar.com.branded.bfftransaction.repository.SaveOrder;
import ar.com.branded.bfftransaction.service.GenerateOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenerateOrderService implements GenerateOrder {

    private final GetAddressById getAddressById;
    private final GetUserById getUserById;
    private final GenerateOrderByUserAndAddress generateOrderByUserAndAddress;
    private final SaveOrder saveOrder;

    public GenerateOrderService(GetAddressById getAddressById, GetUserById getUserById, GenerateOrderByUserAndAddress generateOrderByUserAndAddress, SaveOrder saveOrder) {
        this.getAddressById = getAddressById;
        this.getUserById = getUserById;
        this.generateOrderByUserAndAddress = generateOrderByUserAndAddress;
        this.saveOrder = saveOrder;
    }

    @Override
    public void execute(String idUser, List<String> productId, String addresId) {
        Address address = getAddressById.execute(addresId);
        User user = getUserById.execute(idUser);
        PreOrder orderResponse = generateOrderByUserAndAddress.execute(user, address, productId);
        saveOrder.execute(orderResponse);
    }
}
