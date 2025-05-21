package com.pluralsight.streams;

import java.util.*;

public class program {
    public static void main(String[] args) {
        /*Koto Matsuzawa
Ine Moritani
Kino Nakahara
Shojiki Naiya
Tetsuji Komori
Masahisa Moriguchi
Kaoru Taue
Masa Tada
Tairi Sakai
Toshimi Inaba
      */
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ine", "Moritani", 25));
        people.add(new Person("Kino", "Nakahara", 38));
        people.add(new Person("Shojiki", "Naiya", 18));
        people.add(new Person("Tetsuji", "Komori", 21));
        people.add(new Person("Masahisa", "Moriguchi", 29));
        people.add(new Person("Kaoru", "Taue", 28));
        people.add(new Person("Tairi", "Sakai", 34));
        people.add(new Person("Masa", "Tada", 27));
        people.add(new Person("Toshimit", "Inaba", 25));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name or the last name");
        String input = scanner.nextLine().trim();

        List<Person> matchedName = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(input)||
                        person.getLastName().equalsIgnoreCase(input))
                .toList();
        matchedName.forEach(System.out::println);

        Double average = people.stream()
                .mapToInt(Person::getAge)
                .average() .getAsDouble();

        System.out.printf("Average age is %.2f" , average);


        int oldest = people.stream()
                .mapToInt(Person::getAge)
                .max().getAsInt();

        int youngest = people.stream()
                .mapToInt(Person::getAge)
                .min().getAsInt();


        System.out.println("\nOldest age: " + oldest );
        System.out.println("Youngest age: " + youngest  );

        scanner.close();

    }
}

