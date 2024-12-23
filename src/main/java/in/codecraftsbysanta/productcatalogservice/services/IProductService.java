package in.codecraftsbysanta.productcatalogservice.services;

import in.codecraftsbysanta.productcatalogservice.models.Product;

public interface IProductService {
    Product getProductById(Long productId);
}
