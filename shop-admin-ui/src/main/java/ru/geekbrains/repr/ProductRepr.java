package ru.geekbrains.repr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.geekbrains.persist.model.Product;


@Getter @Setter @AllArgsConstructor
public class ProductRepr {
    private long id;

    private String name;

    private String company;

    public ProductRepr(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.company = product.getCompany();
    }
}
