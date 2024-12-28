package in.codecraftsbysanta.productcatalogservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private String name;
    private String description;
    private String imgUrl;
    private double price;

    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

    private Boolean isPrime;

    public Product() {
        setCreatedAt(new Date());
        setLastUpdatedAt(new Date());
        setState(State.ACTIVE);
    }

}
