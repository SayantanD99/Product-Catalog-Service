package in.codecraftsbysanta.productcatalogservice.controllers;

import in.codecraftsbysanta.productcatalogservice.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Iphone 14");
        List<Product> products = new ArrayList<>();
        products.add(product);
        return products;
    }

    @GetMapping("/products/{productID}")
    public Product findProductById(@PathVariable("productID") Long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("Iphone 14");
        return product;
    }

}
