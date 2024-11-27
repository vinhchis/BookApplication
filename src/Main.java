import models.Book;
import models.Category;
import models.CategoryFactoryImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Category book1 = new CategoryFactoryImpl().newCategory("Harry Potter");


    }
}