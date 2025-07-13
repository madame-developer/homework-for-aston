package collection.students;

import java.util.Objects;

public class Book {

    private String name;
    
    private int numberOfPages;

    private int yearOfRelease;


    public Book(String name, int numberOfPages, int yearOfRelease) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Book) {
            Book book = (Book) obj;

            if (yearOfRelease == book.yearOfRelease && numberOfPages == book.numberOfPages && Objects.equals(name, book.name)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name + ": " + numberOfPages + ", " + yearOfRelease;
    }
}
