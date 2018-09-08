package pl.coderslab.bookstore.repository.examples;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.bookstore.entity.examples.Nauczyciel;

public interface NauczycielRepository
        extends JpaRepository<Nauczyciel, Long> {
}
