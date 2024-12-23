package in.codecraftsbysanta.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    private String name;
    private String description;
    private String imgUrl;
    private double price;
    private Category category;
}
