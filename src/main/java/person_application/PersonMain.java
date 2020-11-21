package person_application;

import java.util.*;

public class PersonMain {
    //comparing firstly the name, then the age
    public static void main(String... args) {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Student("Dezmeri", "Tunde", 26, 10));
        set.add(new Student("Pop", "Vlad", 25, 9));
        set.add(new Employee("Goron", "Andreea", 21));
        TreeSet<Person> sort = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.firstname.compareTo(o2.firstname);
            }
        });

        sort.addAll(set);
        System.out.println("Sorting According to name");
        for (Person person : sort) {
            System.out.println(person);
        }
        System.out.println();

        sort = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Sorting According to Age\n");
        sort.addAll(set);
        for (Person person : sort) {
            System.out.println(person);
        }
        System.out.println();

        //every person has different hobbies but they are practicing it in the same country
        Map<Person, List<Hobby>> firstPersonMap = new HashMap<>();
        Person firstPerson = new Person("Pop", "Anita", 25);
        Hobby firstHobby = new Hobby("Cicling", 1);
        Address firstAddress = new Address("Cluj-Napoca", "Anina", 10, 20);
        List<Address> addressList = new ArrayList<>();
        addressList.add(firstAddress);
        firstPerson.addHobby(firstHobby);
        firstPersonMap.put(firstPerson, firstPerson.hobbyList);
        firstPerson.displayPersonHobbies(firstPersonMap);
        System.out.println(firstAddress);
        Map<Person, List<Hobby>> secondPersonMap = new HashMap<>();
        Person secondPerson = new Person("Pop", "Alex", 25);
        Hobby secondHobby = new Hobby("Swimming", 2);
        Address secondAddress = new Address("Cluj-Napoca", "Ciresilor", 11, 12);
        List<Address> addressList2 = new ArrayList<>();
        addressList2.add(secondAddress);
        secondPerson.addHobby(secondHobby);
        secondPersonMap.put(secondPerson, secondPerson.hobbyList);
        secondPerson.displayPersonHobbies(secondPersonMap);
        System.out.println(secondAddress);
        System.out.println("List all countries where a hobby can be practiced:");
        //list all countries where a Hobby can be practiced
        for (Country country : Country.values()) {
            System.out.println(country);
        }
    }
}
