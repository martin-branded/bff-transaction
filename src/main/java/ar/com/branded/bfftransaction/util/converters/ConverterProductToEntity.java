package ar.com.branded.bfftransaction.util.converters;

import ar.com.branded.bfftransaction.repository.model.jdbc.ProductDetailsTable;
import ar.com.branded.bfftransaction.repository.model.jdbc.ProductTable;
import ar.com.branded.bfftransaction.repository.model.jdbc.ProductsAndDetailsList;
import ar.com.branded.bfftransaction.repository.model.rest.Image;
import ar.com.branded.bfftransaction.repository.model.rest.Product;
import ar.com.branded.bfftransaction.repository.model.rest.Variant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverterProductToEntity {

    public static ProductsAndDetailsList execute(List<Product> products, String userId){
        ProductsAndDetailsList productsAndDetailsList = new ProductsAndDetailsList();
        List<ProductTable> productTableList = new ArrayList<>();
        List<ProductDetailsTable> productDetailsTableList = new ArrayList<>();

        products.forEach(product -> {
                    ProductTable productTable = new ProductTable();
                    String DEFAULT_IMAGE = product.getImages()[0].getSrc();
                    String DEFAULT_PRICE = product.getVariants()[0].getPrice();
                    Integer GENERAL_STOCK = Arrays
                            .stream(product.getVariants())
                            .toList()
                            .stream()
                            .map(Variant::getStock)
                            .reduce(Integer::sum).orElse(0);

                    productTable.setId(product.getId());
                    productTable.setName(product.getName().getEs());
                    productTable.setUser_id(userId);
                    productTable.setDescription(product.getDescription().getEs());
                    productTable.setPrice(DEFAULT_PRICE);
                    productTable.setImage_url(DEFAULT_IMAGE);
                    productTable.setStock(GENERAL_STOCK.toString());
                    productTableList.add(productTable);

                    Arrays.stream(product.getVariants()).toList().forEach(variant -> {
                        ProductDetailsTable productDetailsTable = new ProductDetailsTable();

                        List<Image> imageVariant = Arrays
                                .stream(product.getImages())
                                .filter( image -> image.getId().equals(variant.getImage_id()) )
                                .toList();

                        productDetailsTable.setId(variant.getId());
                        productDetailsTable.setProductId(product.getId().toString());
                        productDetailsTable.setPrice(variant.getPrice());
                        productDetailsTable.setStock(variant.getStock());
                        productDetailsTable.setWeight(variant.getWeight());
                        productDetailsTable.setDepth(variant.getDepth());
                        productDetailsTable.setWidth(variant.getWidth());
                        productDetailsTable.setHeight(variant.getHeight());
                        productDetailsTable.setPromotional_price(variant.getPromotional_price());
                        productDetailsTable.setImage_url(imageVariant.get(0).getSrc());

                        productDetailsTableList.add(productDetailsTable);
                    });
                });
        productsAndDetailsList.setProducts(productTableList);
        productsAndDetailsList.setProductDetails(productDetailsTableList);

        return productsAndDetailsList;
    }
}
