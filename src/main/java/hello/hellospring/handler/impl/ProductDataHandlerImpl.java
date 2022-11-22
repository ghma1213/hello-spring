package hello.hellospring.handler.impl;

import hello.hellospring.dao.ProductDao;
import hello.hellospring.domain.Product;
import hello.hellospring.handler.ProductDataHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {
    private final Logger LOGGER = LoggerFactory.getLogger(ProductDataHandlerImpl.class);

    ProductDao productDao;

    @Autowired
    public ProductDataHandlerImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product saveProductEntity(String productId, String productName, int productPrice,
                                     int productStock) {

        LOGGER.debug("[saveProductEntity] 매개변수를 통해 Entity 객체 생성");
        Product product = new Product(productId, productName, productPrice,
                productStock);

        LOGGER.info("[saveProductEntity] productDAO로 Product 정보 저장 요청. productId : {}", productId);
        return productDao.saveProduct(product);
    }

    @Override
    public Product getProductEntity(String productId) {
        LOGGER.info("[saveProductEntity] productDAO로 Product 정보 요청. productId : {}", productId);
        return productDao.getProduct(productId);
    }
}
