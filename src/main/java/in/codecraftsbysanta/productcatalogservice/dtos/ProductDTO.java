package in.codecraftsbysanta.productcatalogservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private String imgUrl;
    private double price;
    private CategoryDTO category;
    private Boolean isPrime;
}
