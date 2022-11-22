package hello.hellospring.handler;

import hello.hellospring.domain.Product;

public interface ProductDataHandler {

    Product saveProductEntity(String productId, String productName, int productPrice, int productStock);

    Product getProductEntity(String productId);
}
