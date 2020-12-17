package person;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class Main {

    public static void main(String... args) {

        //task 1)
        Person firstPerson = new Person("Pop", "Maria", 21);
        Person secondPerson = new Person("Pop", "Medescu", 20);
        Person thirdPerson = new Person("Pop", "Adina", 25);
        Person fourthPerson = new Person("Pop", "Andrei", 30);
        Person fifthPerson = new Person("Pop", "Carmen", 19);

        //task 2)
        List<Person> personList = new ArrayList<>();
        personList.add(firstPerson);
        personList.add(secondPerson);
        personList.add(thirdPerson);
        personList.add(fourthPerson);
        personList.add(fifthPerson);

        List<Person> newList = personList.stream()
                .filter(person -> person.getLastName().startsWith("M") & person.getLastName().contains("a"))
                .collect(Collectors.toList());

        newList.forEach(System.out::println);

        //task 3)
        TreeSet<Person> set = new TreeSet<>();
        set.add(firstPerson);
        set.add(secondPerson);
        set.add(thirdPerson);
        set.add(fourthPerson);
        set.add(fifthPerson);

        //return Person with minimum age
        Person person = Collections.min(set, Comparator.comparing(s -> s.getAge()));
        System.out.println("The youngest person is : " + person.getLastName());

        //task 4)
        Set<String> stringSet = new HashSet<>();
        Random random = new Random();
        while (stringSet.size() != 5) {
            stringSet.add(String.valueOf((char) (65 + random.nextInt(26))));
        }
        System.out.println(stringSet);

        //take the elements from the set created above and return the value that's the largest lexicographically
        String max = Collections.max(stringSet);
        System.out.println(max);

        //task 7)
        //sorted the list in reverse alphabetical order
        List<String> sortedStringSet = stringSet.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedStringSet);

        //task 5)
        List<Integer> list = Stream.generate(new Random()::nextInt)
                .limit(11).collect(Collectors.toList());
        System.out.println(list);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //task 6)
        Map<String, Integer> books = new HashMap<>();
        books.put("Econometrics", 9);
        books.put("Financial Analysis", 10);
        books.put("Capital markets", 11);

        Map<String, Integer> result = books.entrySet()
                .stream()
                .filter(map -> map.getValue().intValue() >= 10)
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result: " + result);

        //task 8) Sorting the elements (people) of ArrayList by age in ascending order
        Collections.sort(personList);
        System.out.println(personList);

        //task9) Returning people whose age is matching 30
        List<Person> newListMatchingCond = personList.stream()
                .filter(people -> personList.stream()
                        .anyMatch(camp -> people.getAge() == 30
                        )
                )
                .collect(Collectors.toList());
        newListMatchingCond.forEach(System.out::println);

        //task 10-11)
        List<String> words = Arrays.asList("ABC", "ABCD", "ABCDE");
        Optional<String> shortestString = words.stream()
                .reduce((word1, word2) -> word1.length() < word2.length() ? word1 : word2);

        shortestString.ifPresent(System.out::println);

    }
}
