package service;

import api.ProductService;
import entity.Product;

import java.util.ArrayList;
import java.util.List;
public class ProductServiceImpl implements ProductService {
    public List<Product> products;
    public ProductServiceImpl(){
        this.products = new ArrayList<Product>();
    }
    public ProductServiceImpl(List<Product> products){
        this.products = products;
    }
   @Override
    public List<Product> getAllProducts(){
        return products;
    }

    @Override
    public Integer getNumberOfProducts(){
        return products.size();
    }

    @Override
    public Product getProductById(Long id){
        for (Product p: products
             ) {
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }

    @Override
    public Product getProductByName(String name){
        for (Product p: products
        ) {
            if(p.getProductName()==name){
                return p;
            }
        }
        return null;
    }



    @Override
    public boolean ifProductNotEmptyByName(String name){
        for (Product p: products
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
    public boolean ifProductExistByName(String name){
        for(Product p: products){
            if(p.getProductName().equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean ifProductExistById(Long id){
        for (Product p: products
             ) {
            if(p.getId() == id){
                return true;
            }

        }
        return false;
    }

}
