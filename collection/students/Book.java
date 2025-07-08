package collection.students;

import java.util.Date;

public class Book {

    private String name;
    
    private int numberOfPages;

    private Date yearOfRelease;


    public Book(String name, int numberOfPages, Date yearOfRelease) {
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

    public int numberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Date yearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Date yearOfRelease) {
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

            if (this.getName().equals(book.getName())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
