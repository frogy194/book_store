package pl.coderslab.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.bookstore.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findOneByName(String name);
}
