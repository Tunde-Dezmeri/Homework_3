package person;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name = " + firstName + " " + lastName + "," + " Age= " + age;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return ((Integer) this.age).compareTo(o.age);
    }
}
