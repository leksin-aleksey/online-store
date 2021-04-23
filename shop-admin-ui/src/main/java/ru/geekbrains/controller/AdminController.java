package ru.geekbrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.persist.repo.CategoryRepository;
import ru.geekbrains.persist.repo.RoleRepository;

@Controller
@RequestMapping("/")
public class AdminController {

    private final RoleRepository roleRepository;
    private final CategoryRepository categoryRepository;

    public AdminController(RoleRepository roleRepository, CategoryRepository categoryRepository) {
        this.roleRepository = roleRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public String indexPage(Model model) {
        model.addAttribute("roles", roleRepository.findAll());
        model.addAttribute("categories", categoryRepository.findAll());
        return "index";
    }
}
