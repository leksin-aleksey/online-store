package ru.geekbrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.persist.repo.ProductRepository;
import ru.geekbrains.repr.ProductRepr;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/all")
    public String allProducts(Model model){
        List<ProductRepr> productReprs = productRepository.findAll()
                .stream()
                .map(ProductRepr::new)
                .collect(Collectors.toList());
        model.addAttribute("products", productReprs);
        return "products";
    }
}
