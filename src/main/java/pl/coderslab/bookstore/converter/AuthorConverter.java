package pl.coderslab.bookstore.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.bookstore.dao.AuthorDao;
import pl.coderslab.bookstore.entity.Author;

public class AuthorConverter
        implements Converter<String, Author> {

    @Autowired
    private AuthorDao authorDao;

    @Override
    public Author convert(String source) {
        return this.authorDao.read(Long.parseLong(source));
    }
}
