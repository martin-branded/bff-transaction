package ar.com.branded.bfftransaction.util.converters;

import ar.com.branded.bfftransaction.repository.model.jdbc.ProductDetailsTable;
import ar.com.branded.bfftransaction.repository.model.jdbc.ProductTable;
import ar.com.branded.bfftransaction.repository.model.jdbc.ProductsAndDetailsList;
import ar.com.branded.bfftransaction.repository.model.rest.Image;
import ar.com.branded.bfftransaction.repository.model.rest.Product;
import ar.com.branded.bfftransaction.repository.model.rest.Variant;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverterProductToEntity {

    public static ProductsAndDetailsList execute(List<Product> products, String userId) {
        ProductsAndDetailsList productsAndDetailsList = new ProductsAndDetailsList();
        List<ProductTable> productTableList = products.stream()
                .map(product -> convertProductToProductTable(product, userId))
                .collect(Collectors.toList());

        List<ProductDetailsTable> productDetailsTableList = products.stream()
                .flatMap(product -> Arrays.stream(product.getVariants())
                        .map(variant -> convertVariantToProductDetailsTable(product, variant)))
                .collect(Collectors.toList());

        productsAndDetailsList.setProducts(productTableList);
        productsAndDetailsList.setProductDetails(productDetailsTableList);

        return productsAndDetailsList;
    }

    private static ProductTable convertProductToProductTable(Product product, String userId) {
        String defaultImage = product.getImages()[0].getSrc();
        String defaultPrice = product.getVariants()[0].getPrice();
        Integer generalStock = Arrays.stream(product.getVariants())
                .mapToInt(Variant::getStock)
                .sum();

        ProductTable productTable = new ProductTable();
        productTable.setId(product.getId());
        productTable.setName(product.getName().getEs());
        productTable.setUser_id(userId);
        productTable.setDescription(product.getDescription().getEs());
        productTable.setPrice(defaultPrice);
        productTable.setImage_url(defaultImage);
        productTable.setStock(generalStock.toString());

        return productTable;
    }

    private static ProductDetailsTable convertVariantToProductDetailsTable(Product product, Variant variant) {
        List<Image> imageVariant = Arrays.stream(product.getImages())
                .filter(image -> image.getId().equals(variant.getImage_id()))
                .collect(Collectors.toList());

        ProductDetailsTable productDetailsTable = new ProductDetailsTable();
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

        return productDetailsTable;
    }
}
