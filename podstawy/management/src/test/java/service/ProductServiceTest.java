package service;

import api.ProductService;
import entity.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceTest {
    @Test
    public void getAllProductsTest(){
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1l, "buty", 12, 12, "green", 12));
        products.add(new Product(2l, "kuty", 12, 12, "green", 12));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        List<Product> productsFromTestClass = productService.getAllProducts();

        //expected
        Assert.assertEquals(products, productsFromTestClass);
    }

    @Test
    public void getNumberOfProducts(){
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1l, "buty", 12, 12, "green", 12));
        products.add(new Product(2l, "kuty", 12, 12, "green", 12));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        int numberOfProductsFromClass = productService.getNumberOfProducts();

        //expected
        Assert.assertEquals(numberOfProductsFromClass, 2);
    }

    @Test
    public void getProductByIdTest(){
        //is
        List<Product> products = new ArrayList<>();
        products.add(new Product(1l, "buty", 12, 12, "green", 12));

        Product kuty = new Product(2l, "kuty", 12, 12, "green", 12);

        products.add(kuty);

        //Then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        Product productFromClass = productService.getProductById(2l);

        //expected

        Assert.assertEquals(kuty, productFromClass);

    }

    @Test
    public void getProductByNameTest(){
        //is
        List<Product> products = new ArrayList<>();
        products.add(new Product(1l, "buty", 12, 12, "green", 12));

        Product kuty = new Product(2l, "kuty", 12, 12, "green", 12);

        products.add(kuty);

        //Then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        Product productFromClass = productService.getProductByName("kuty");

        //expected

        Assert.assertEquals(kuty, productFromClass);

    }


    @Test
    public void ifProductNotEmptyByNameTest(){
        //is
        List<Product> products = new ArrayList<>();
        products.add(new Product(1l, "buty", 12, 12, "green", 12));

        Product kuty = new Product(2l, "kuty", 12, 12, "green", 0);

        products.add(kuty);

        //Then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean productFromClassTrue = productService.ifProductNotEmptyByName("buty");
        boolean productFromClassFalse = productService.ifProductNotEmptyByName("kuty");

        //expected
        Assert.assertTrue(productFromClassTrue);
        Assert.assertFalse(productFromClassFalse);

    }

    @Test
    public void ifProductExistByNameTest(){
        //is
        List<Product> products = new ArrayList<>();
        products.add(new Product(1l, "buty", 12, 12, "green", 12));

        Product kuty = new Product(2l, "cuty", 12, 12, "green", 0);

        products.add(kuty);

        //Then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean productFromClassTrue = productService.ifProductExistByName("buty");
        boolean productFromClassFalse = productService.ifProductExistByName("kuty");

        //expected
        Assert.assertTrue(productFromClassTrue);
        Assert.assertFalse(productFromClassFalse);

    }

    @Test
    public void ifProductExistByIdTest(){
        //is
        List<Product> products = new ArrayList<>();
        products.add(new Product(1l, "buty", 12, 12, "green", 12));

        Product kuty = new Product(2l, "kuty", 12, 12, "green", 0);

        products.add(kuty);

        //Then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean productFromClassTrue = productService.ifProductExistById(1l);
        boolean productFromClassFalse = productService.ifProductExistById(3l);

        //expected
        Assert.assertTrue(productFromClassTrue);
        Assert.assertFalse(productFromClassFalse);

    }
}
