package person_application;

import java.util.*;

public class Person implements Comparable<Person> {

    public String firstname;
    private String lastname;
    public int age;
    public final List<Hobby> hobbyList = new ArrayList<>();

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name = " + firstname + " " + lastname + "," + " Age= " + age;
    }

    public void addHobby(Hobby hobby) {
        hobbyList.add(hobby);
    }

    public void displayPersonHobbies(Map<Person, List<Hobby>> personMap) {
        for (Map.Entry<Person, List<Hobby>> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " practices " + entry.getValue());
        }
    }

    @Override
    public int compareTo(Person o) {
        return ((Integer) this.age).compareTo(o.age);
    }
    /* this will check for both name and age and if same the object is unique
    // @Override
    //public int compareTo(Person o)
    //{
    //int i = ((Integer) this.age).compareTo(o.age);
    //if (i == 0)
    //return this.firstname.compareTo(o.firstname);
    //else
    //return i;
    }*/
}

