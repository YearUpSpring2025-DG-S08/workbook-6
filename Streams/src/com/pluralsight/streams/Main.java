package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        // step 2: prompt user for a name to search (first or last)
        System.out.println("Enter a name to search (first or last): ");
        String input = scanner.nextLine().toLowerCase().trim();

        // use a loop to find a match and create a new List of people whose name matches
        List<Person> filteredPeople = new ArrayList<>();
        for (Person individual : listOfPeople) {
            if (individual.getFirstName().toLowerCase().equals(input) || individual.getLastName().toLowerCase().equals(input)) {
                filteredPeople.add(individual);
            }
        }

        // display the names of the people on the list
        if (!filteredPeople.isEmpty()) {
            for (Person p : filteredPeople) {
                System.out.println(p);
            }
        } else {
            System.out.println("There are no matches found");
        }


        // step 3: calculate average age of people in the original list
        double totalAge = 0;
        // display the age of the oldest person in the list
        double oldest = listOfPeople.get(0).getAge();
        // display the age of the youngest person in the list
        double youngest = listOfPeople.get(0).getAge();

        for(Person person : listOfPeople){
            if(person.getAge() > oldest) oldest = person.getAge();
            if(person.getAge() < youngest) youngest = person.getAge();
            totalAge += person.getAge();
        }

        double averageAge = totalAge / listOfPeople.size();
        System.out.printf("Average Age: %.2f%n", averageAge);
        System.out.printf("Oldest Age: %.0f%n", oldest);
        System.out.printf("Youngest Age: %.0f", youngest);
    }
}