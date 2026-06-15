package com.nagatejasreek.inventory_management.service;

import com.nagatejasreek.inventory_management.entity.Product;
import com.nagatejasreek.inventory_management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product addProduct(Product product){
        return repository.save(product);
    }

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public Product getProductById(Long id) {
    return repository.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product updatedProduct) {

    Product existingProduct = repository.findById(id).orElse(null);

    if(existingProduct != null) {
        existingProduct.setProductName(updatedProduct.getProductName());
        existingProduct.setCategory(updatedProduct.getCategory());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setQuantity(updatedProduct.getQuantity());
        existingProduct.setSupplier(updatedProduct.getSupplier());

        return repository.save(existingProduct);
    }

        return null;
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}