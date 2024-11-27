package models;

public class Book {
    private int id;
    private String name;
    private long authorId;
    private long categoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
