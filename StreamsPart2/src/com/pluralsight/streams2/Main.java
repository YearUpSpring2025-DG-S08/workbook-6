package com.pluralsight.streams2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // step 1: create a list of 10 people
        ArrayList<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("Jared", "Lang", 24));
        listOfPeople.add(new Person("Loid", "Truffle", 65));
        listOfPeople.add(new Person("Hannah", "Knowles", 12));
        listOfPeople.add(new Person("Prune", "Walters", 37));
        listOfPeople.add(new Person("Tray", "Moscrow", 40));
        listOfPeople.add(new Person("Pansie", "Quiver", 20));
        listOfPeople.add(new Person("Moonie", "Fissure", 55));
        listOfPeople.add(new Person("Winter", "Velcro", 73));
        listOfPeople.add(new Person("Yunger", "Hoover", 33));
        listOfPeople.add(new Person("Mason", "Mord", 54));

        System.out.println("Enter a name to search (first or last): ");
        String input = scanner.nextLine().toLowerCase().trim();

        // use a loop to find a match and create a new List of people whose name matches
        // - the new list of names contains the correct results
        // exercise 2 - step 1: replace for loop with a stream and filter function
        List<Person> matchingNames = listOfPeople.stream()
                .filter(match -> match.getFirstName().toLowerCase().equals(input) || match.getLastName().toLowerCase().equals(input))
                .collect((Collectors.toList()));

        // handling edge cases if no matches found
        if(matchingNames.isEmpty()){
            System.out.println("There are no matches found");
        } else {
            matchingNames.forEach(System.out::println);
        }

        // exercise 2 - step 2: replace for loop in average age calculation with stream methods
        // mapToInt is similar to map, however mapToInt directly changes the result into an int
        // and allows the usage of numeric operations, in this case average
        double averageAge = listOfPeople.stream().mapToInt(Person::getAge).average().orElse(0);

        System.out.println("The average age of the list: " + averageAge);

        // exercise 2 - step 3: use stream methods to find the oldest and youngest person in the list
        int oldestAge = listOfPeople.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);

        int youngestAge = listOfPeople.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);

        System.out.println("The oldest age in the list: " + oldestAge);
        System.out.println("The youngest age in the list: " + youngestAge);

        
        // redoing the previous steps using the reduce function
//        int oldestAgeAgain = listOfPeople.stream()
//                .map(Person::getAge)
//                .reduce(0, (oldage, newage) -> (oldage > newage) ? oldage : newage);
//        
//        int youngestAgeAgain = listOfPeople.stream()
//                .map(Person::getAge)
//                .reduce(0, (oldage, newage) -> (oldage < newage) ? oldage : newage);
        
        // within the reduce function, the first integer will be 0
        // (the first comparator which is being saved in the oldade variable)
        // every new number in the stream will be saved in the newage variable
        // and subsequently comparing to every resulting oldage
        //


    }
}