package com.varshu.e_comWebsite.service;

import com.varshu.e_comWebsite.model.Product;
import com.varshu.e_comWebsite.repositories.ProductRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@Getter
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductsById(int prodId){
        return repo.findById(prodId).orElse(null);
    }

    public void addProducts(Product prod){
        repo.save(prod);
    }

    public void updateProducts(Product prod){
        repo.save(prod);
    }

    public void deleteProductsById(int prodId){
        repo.deleteById(prodId);
    }
}
