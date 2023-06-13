package ar.com.branded.bfftransaction.repository.impl.rest;

import ar.com.branded.bfftransaction.model.domain.Address;
import ar.com.branded.bfftransaction.model.domain.PreOrder;
import ar.com.branded.bfftransaction.model.domain.User;
import ar.com.branded.bfftransaction.repository.GenerateOrderByUserAndAddress;
import ar.com.branded.bfftransaction.repository.model.rest.DraftOrder;
import ar.com.branded.bfftransaction.repository.model.rest.OrderProduct;
import ar.com.branded.bfftransaction.repository.model.rest.OrderResponse;
import ar.com.branded.bfftransaction.repository.model.rest.Shipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GenerateOrderByUserAndAddressTiendaNube implements GenerateOrderByUserAndAddress {


    @Autowired
    private RestTemplate restTemplate;


    @Override
    public PreOrder execute(User user, Address address, List<String> productIds) {

        OrderResponse orderResponse = restTemplate.postForObject(
                "https://api.tiendanube.com/v1/pre_orders",
                toDraftOrder(user, address, productIds),
                OrderResponse.class
        );

        PreOrder preOrder = new PreOrder();
        if (orderResponse != null) {
            preOrder.setOrderUrl(orderResponse.getCheckout_url());
        }

        return preOrder;

    }

    private DraftOrder toDraftOrder(User user, Address address, List<String> productIds){
        DraftOrder draftOrder = new DraftOrder();
        draftOrder.setContact_name(user.getName());
        draftOrder.setContact_lastname(user.getLastName());
        draftOrder.setContact_email(user.getEmail());
        draftOrder.setContact_phone(user.getPhone());
        draftOrder.setPayment_status("unpaid");

        Address shippingAddress = new Address();
        shippingAddress.setAddress(address.getAddress());
        shippingAddress.setNumber(address.getNumber());
        shippingAddress.setFloor(address.getFloor());
        shippingAddress.setLocality(address.getLocality());
        shippingAddress.setCity(address.getCity());
        shippingAddress.setProvince(address.getProvince());
        shippingAddress.setZipcode(address.getZipcode());

        Shipping shipping = new Shipping();
        shipping.setShipping_address(shippingAddress);

        List<OrderProduct> orderProducts = new ArrayList<>();
        for (String productId : productIds) {
            OrderProduct orderProduct = new OrderProduct();
            orderProduct.setVariant_id(Integer.parseInt(productId));
            orderProduct.setQuantity(1);

            orderProducts.add(orderProduct);
        }
        draftOrder.setProducts(orderProducts);
        draftOrder.setShipping(shipping);

        return draftOrder;
    }
}
