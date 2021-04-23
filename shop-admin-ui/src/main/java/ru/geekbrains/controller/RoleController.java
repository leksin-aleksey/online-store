package ru.geekbrains.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.persist.repo.RoleRepository;

@Controller
@RequestMapping("/role")
public class RoleController {

    private final RoleRepository roleRepository;

    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping("/{id}/edit")
    public String editCategory(Model model, @PathVariable("id") Long id){
        model.addAttribute("category", roleRepository.findById(id));
        return "role_form";
    }
}