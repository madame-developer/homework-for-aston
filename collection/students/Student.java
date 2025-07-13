package collection.students;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String nameOfStudent;

    private ArrayList<Book> books = new ArrayList<>();


    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setName(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    @Override
    public String toString() {
        return "Student: " + nameOfStudent + "\nBooks: " + books;
    }
}
