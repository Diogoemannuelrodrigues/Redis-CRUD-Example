package br.com.poc.redis.controller;

import br.com.poc.redis.entity.Product;
import br.com.poc.redis.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public Product save(@RequestBody Product product){
        return repository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id){
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Integer id){
        return repository.deleteProduct(id);
    }

}
