package person_application;

public class Student extends Person {
    private int grade;

    public Student(String firstname, String lastname, int age, int grade) {
        super(firstname, lastname, age);
        this.grade = grade;
    }

}
