package pl.coderslab.bookstore.dao;

import org.springframework.stereotype.Component;
import pl.coderslab.bookstore.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class PersonDao {
    @PersistenceContext
    EntityManager entityManager;
    public void save(Person entity) {
        entityManager.persist(entity);
    }
    public void update(Person entity) {
        entityManager.merge(entity);
    }
    public Person findById(long id) {
        return entityManager.find(Person.class, id);
    }
    public void delete(Person entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }
}