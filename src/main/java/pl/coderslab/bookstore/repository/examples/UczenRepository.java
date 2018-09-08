package pl.coderslab.bookstore.repository.examples;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.bookstore.entity.examples.Uczen;

public interface UczenRepository
        extends JpaRepository<Uczen, Long> {
}
