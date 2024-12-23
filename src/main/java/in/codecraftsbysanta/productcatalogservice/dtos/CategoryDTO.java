package in.codecraftsbysanta.productcatalogservice.dtos;

import in.codecraftsbysanta.productcatalogservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO {

    private Long id;
    private String name;
    private String description;

}
