package collection.main;

import collection.myArrayList.MyArrayList;
import collection.students.Book;
import collection.students.Student;

public class Main {
     public static void main(String[] args) {
        MyArrayList<Student> students = new MyArrayList<>();

        Student alice = new Student("Alice Vandom");
        students.add(alice);
        Student david = new Student("David Stivenson");
        students.add(david);
        Student anne = new Student("Anne Scott");
        students.add(anne);
        Student emily = new Student("Emily Green");
        students.add(emily);
        Student rose = new Student("Rose Darcy");
        students.add(rose);

        alice.addBook(new Book("Ivanhoe", 478, 1819));
        alice.addBook(new Book("Wuthering Heights", 560, 1847));
        alice.addBook(new Book("Pride and Prejudice", 480, 1813));
        alice.addBook(new Book("Emma", 450, 1815));
        alice.addBook(new Book("Little Women", 640, 1868));
        
        david.addBook(new Book("Moby-Dick, or The Whale", 705, 1851));
        david.addBook(new Book("Fahrenheit 451", 320, 1953));
        david.addBook(new Book("White Fang", 420, 1906));
        david.addBook(new Book("The Call of the Wild", 464, 1903));
        david.addBook(new Book("Martin Eden", 448, 1909));

        anne.addBook(new Book("The Lord of the Rings", 1415, 1954));
        anne.addBook(new Book("The Silmarillion", 416, 1977));
        anne.addBook(new Book("The Idiot", 578, 1869));
        anne.addBook(new Book("Great Expectations", 642, 1861));
        anne.addBook(new Book("The Catcher in the Rye", 320, 1951));

        emily.addBook(new Book("The Tragedy of Hamlet, Prince of Denmark", 272, 1603));
        emily.addBook(new Book("Grokking Algorithms", 352, 2015));
        emily.addBook(new Book("The Goldfinch", 782, 2013));
        emily.addBook(new Book("The Martian", 560, 2011));
        emily.addBook(new Book("Harry Potter and the Philosopher's Stone", 432, 1997));
        emily.addBook(new Book("Brave New World", 658, 1932));

        rose.addBook(new Book("Mastering Bitcoin: Programming the Open Blockchain", 482, 2017));
        rose.addBook(new Book("Harry Potter and the Order of the Phoenix", 732, 2003));
        rose.addBook(new Book("The Sword in the Stone", 542, 1938));
        rose.addBook(new Book("La Divina Commedia", 464, 1321));
        rose.addBook(new Book("The Ethics of Liberty", 570, 1982));
        rose.addBook(new Book("The Lady of the Lake", 674, 1810));
        rose.addBook(new Book("Twilight", 680, 2005));
        rose.addBook(new Book("The Time Traveller’s Guide to Medieval England.", 572, 2014));


        students.stream().
        peek(System.out::println).
        flatMap(student -> student.getBooks().stream()).
        sorted((book1, book2) -> Integer.compare(book1.getNumberOfPages(), book2.getNumberOfPages())).
        distinct().
        filter(book -> book.getYearOfRelease() > 2000).
        limit(3).
        map(Book::getYearOfRelease).
        findAny().
        ifPresentOrElse(yearOfRelease -> System.out.println("Year of release: " + yearOfRelease), () -> System.out.println("The book doesn't exist!"));
    
    }
}
