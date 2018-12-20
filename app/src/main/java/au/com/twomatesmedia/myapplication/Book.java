package au.com.twomatesmedia.myapplication;

public class Book {

    String name;

    public Book(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return "Book{" + " " + this.hashCode() + " " +
                "name='" + name + '\'' +
                '}';
    }
}
