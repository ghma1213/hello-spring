package hello.hellospring.dao;

import hello.hellospring.domain.Product;

public interface ProductDao {

    Product saveProduct(Product product);

    Product getProduct(String productId);

}
