package api;

import entity.Product;

import java.io.IOException;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts() throws IOException;
    Integer getNumberOfProducts() throws IOException;
    Product getProductById(Long productId) throws IOException;
    Product getProductByName(String productName) throws IOException;
    boolean ifProductNotEmptyByName(String productName) throws IOException;
    boolean ifProductExistByName(String productName) throws IOException;
    boolean ifProductExistById(Long productId) throws IOException;

}
