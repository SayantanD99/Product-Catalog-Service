package in.codecraftsbysanta.productcatalogservice.services;

import in.codecraftsbysanta.productcatalogservice.models.Product;
import in.codecraftsbysanta.productcatalogservice.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("sps")
public class StorageProductService implements IProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product getProductById(Long productId) {

        Optional<Product> productOptional = productRepo.findProductById(productId);
        if(productOptional.isEmpty())
            return null;
        return productOptional.get();
    }

    @Override
    public List<Product> getAllProducts() {

        return productRepo.findAll();

    }

    @Override
    public Product replaceProduct(Long productId, Product request) {

        return null;

    }

    @Override
    public Product save(Product product) {

        return productRepo.save(product);

    }
}