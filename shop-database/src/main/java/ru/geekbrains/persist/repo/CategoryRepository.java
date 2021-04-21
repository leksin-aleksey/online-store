package ru.geekbrains.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.persist.model.Category;
import ru.geekbrains.persist.model.Role;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
