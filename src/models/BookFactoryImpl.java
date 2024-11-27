package models;

public class BookFactoryImpl implements BookFactory {
    @Override
    public Book newBook(String name) {
        final Book book = new Book();
        book.setName(name);
        return book;
    }
}
