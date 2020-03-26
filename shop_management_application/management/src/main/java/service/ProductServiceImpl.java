package service;

import api.ProductService;
import dao.ProductDaoImpl;
import entity.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ProductServiceImpl implements ProductService {
//    public List<Product> products;
//    public ProductServiceImpl(){
//        this.products = new ArrayList<Product>();
//    }
//    public ProductServiceImpl(List<Product> products){
//        this.products = products;
//    }

    ProductDaoImpl productDao = new ProductDaoImpl();

    private static ProductServiceImpl instance = null;
    private ProductServiceImpl(){

    }
    public static ProductServiceImpl getInstance(){
        if(instance==null){
            instance = new ProductServiceImpl();
        }
        return instance;
    }



   @Override
    public List<Product> getAllProducts() throws IOException {
        return productDao.getAllProducts();
    }

    @Override
    public Integer getNumberOfProducts() throws IOException {
        return productDao.getAllProducts().size();
    }

    @Override
    public Product getProductById(Long id) throws IOException {
        for (Product p: productDao.getAllProducts()
             ) {
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }

    @Override
    public Product getProductByName(String name) throws IOException{
        for (Product p: productDao.getAllProducts()
        ) {
            if(p.getProductName()==name){
                return p;
            }
        }
        return null;
    }



    @Override
    public boolean ifProductNotEmptyByName(String name) throws IOException {
        for (Product p: productDao.getAllProducts()
             ) {
            if(p.getProductName().equals(name)){
                if(p.getProductCount()>0){
                    return true;
                }
                else{
                    return false;
                }
            }

        }
        return false;
    }

    @Override
    public boolean ifProductExistByName(String name) throws IOException {
        for(Product p: productDao.getAllProducts()){
            if(p.getProductName().equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean ifProductExistById(Long id) throws IOException {
        for (Product p: productDao.getAllProducts()
             ) {
            if(p.getId() == id){
                return true;
            }

        }
        return false;
    }

}
