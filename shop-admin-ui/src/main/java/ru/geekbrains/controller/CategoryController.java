package ru.geekbrains.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.persist.repo.CategoryRepository;
import ru.geekbrains.persist.repo.RoleRepository;
import ru.geekbrains.repr.CategoryRepr;
import ru.geekbrains.repr.ProductRepr;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/category")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/all")
    public String allCategories(Model model){
        List<CategoryRepr> categoryReprs = categoryRepository.findAll()
                .stream()
                .map(CategoryRepr::new)
                .collect(Collectors.toList());
        model.addAttribute("categories", categoryReprs);
        return "categories";
    }

    @GetMapping("/{id}/edit")
    public String editCategory(Model model, @PathVariable("id") Long id){
        model.addAttribute("category", new CategoryRepr(categoryRepository.findById(id)
                .orElseThrow(IllegalStateException::new)));
        return "category_form";
    }
}
