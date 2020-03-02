package api;

import entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Integer getNumberOfProducts();
    Product getProductById(Long id);
    Product getProductByName(String name);
    boolean ifProductNotEmptyByName(String name);
    boolean ifProductExistByName(String productName);
    boolean ifProductExistById(Long id);

}
