package ru.geekbrains.repr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.geekbrains.persist.model.Category;

@Getter @Setter @AllArgsConstructor
public class CategoryRepr {
    private long id;

    private String name;

    private String description;

    public CategoryRepr(Category category){
        this.id = category.getId();
        this.name = category.getName();
        this.description = category.getDescription();
    }
}
