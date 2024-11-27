package models;

public class AuthorFactoryImpl implements AuthorFactory {
    @Override
    public Author newAuthor(String name) {
        final Author author = new Author();
        author.setName(name);
        return author;
    }
}
