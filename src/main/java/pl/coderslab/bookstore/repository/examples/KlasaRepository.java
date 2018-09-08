package pl.coderslab.bookstore.repository.examples;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.bookstore.entity.examples.Klasa;

public interface KlasaRepository
        extends JpaRepository<Klasa, Long> {
}
