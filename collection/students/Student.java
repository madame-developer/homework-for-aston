package collection.students;

import collection.myArrayList.MyArrayList;

public class Student {

    private String nameOfStudent;

    private MyArrayList<Book> books = new MyArrayList<>();


    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setName(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

}










class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Alice Vandom");
        Student st2 = new Student("David Stivenson");
        Student st3 = new Student("Anne Scott");
        Student st4 = new Student("Emily Green");
        Student st5 = new Student("Rose Darcy");



    }
}
