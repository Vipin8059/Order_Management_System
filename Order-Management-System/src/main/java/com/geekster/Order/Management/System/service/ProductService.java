package com.geekster.Order.Management.System.service;

import com.geekster.Order.Management.System.model.Product;
import com.geekster.Order.Management.System.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    public String addProducts(List<Product> productList) {
        productRepo.saveAll(productList);
        return "products added successfully"+productList;
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public String deleteProductById(Integer id) {
        Boolean checkProduct = productRepo.existsById(id);
        if(checkProduct==true){
            productRepo.deleteById(id);
            return "product deleted successfully";
        }
        return "product not found for id "+id;
    }
}
