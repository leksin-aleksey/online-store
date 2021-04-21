package ru.geekbrains.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.persist.model.Product;
import ru.geekbrains.persist.model.User;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
