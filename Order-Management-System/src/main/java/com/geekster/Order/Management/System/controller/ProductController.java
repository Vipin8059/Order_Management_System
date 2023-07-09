package com.geekster.Order.Management.System.controller;

import com.geekster.Order.Management.System.model.Product;
import com.geekster.Order.Management.System.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("products")
    public String addProducts(@RequestBody List<Product> productList){
        return productService.addProducts(productList);
    }

    @GetMapping("products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @DeleteMapping("product")
    public String deleteProductById(@RequestParam Integer id){
        return productService.deleteProductById(id);
    }
}
