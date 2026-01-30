package com.varshu.e_comWebsite.controllers;

import com.varshu.e_comWebsite.model.Product;
import com.varshu.e_comWebsite.service.ProductService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(service.getProducts(), HttpStatus.OK);
    }

    @GetMapping("/products/{prodId}")
    public ResponseEntity<Product> getProductsById(@PathVariable int prodId){
        Product product = service.getProductsById(prodId);

        if(product!=null)
            return new ResponseEntity<>(product, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod){
        service.addProducts(prod);
    }

    @PutMapping("/products")
    public void updateProducts(@RequestBody Product prod){
        service.updateProducts(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProductsById(@PathVariable int prodId){
        service.deleteProductsById(prodId);
    }
}
