package api;

import entity.Product;

import java.io.IOException;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts() throws IOException;
    Integer getNumberOfProducts() throws IOException;
    Product getProductByName(String productName) throws IOException;

    boolean ifProductNotEmptyByName(String productName);
    boolean ifProductExistByName(String productName);
    boolean ifProductExistById(Long productId);

    boolean saveProduct(Product product);
}
