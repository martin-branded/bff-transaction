package ar.com.branded.bfftransaction.service.impl;

import ar.com.branded.bfftransaction.model.domain.Auth;
import ar.com.branded.bfftransaction.repository.*;
import ar.com.branded.bfftransaction.repository.model.jdbc.ProductsAndDetailsList;
import ar.com.branded.bfftransaction.repository.model.rest.Product;
import ar.com.branded.bfftransaction.service.GenerateUserShop;
import ar.com.branded.bfftransaction.util.converters.ConverterProductToEntity;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenerateUserShopService implements GenerateUserShop {
    Logger logger = LoggerFactory.getLogger(GenerateUserShopService.class);

    @Resource(name = "generateRelationUserShop")
    private GenerateRelationUserShop generateRelationUserShop;
    @Resource(name = "getProducts")
    private GetAllProductsByAuth getAllProductsByAuth;
    @Resource(name = "getToken")
    private GetTokenByProfile getTokenByProfile;
    @Resource(name = "saveProduct")
    private SaveProducts saveProducts;
    @Resource(name = "saveProductDetails")
    private SaveProductsDetails saveProductsDetails;


    @Override
    public void execute(Auth auth) {
        generateRelationUserShop.execute(auth);
        String token = getTokenByProfile.execute(auth.getProfile_id());
        logger.info(token);
        List<Product> productList = getAllProductsByAuth.execute(auth, token);
        logger.info(productList.toString());
        ProductsAndDetailsList productsAndDetailsList = ConverterProductToEntity.execute(productList, auth.getProfile_id());
        saveProducts.execute(productsAndDetailsList.getProducts());
        saveProductsDetails.execute(productsAndDetailsList.getProductDetails());
    }
}
