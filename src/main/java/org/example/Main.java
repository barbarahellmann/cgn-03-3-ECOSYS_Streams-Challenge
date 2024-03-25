// Step 1: Filter a list of numbers and only output the even numbers.
// Step 2: Use 'map' and double each number in the list.
// Step 3: Sort the list in ascending order.
// Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.
// Step 5: Use 'forEach' and output each processed number.
// Step 6: Collect the processed numbers into a new list using 'collect'.


package org.example;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        // List erstellen
        List<Integer> numbers = List.of(1, 4, 8, 4, 5, 6, 7, 8, 9);

        // Gerade Zahlen ausgeben
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

                System.out.println("Gerade Zahlen: " + evenNumbers);

        System.out.println("------------");


        // Jede Zahl verdoppeln
        List<Integer> doubleNumbers = numbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());

                 System.out.println("Zahlen verdoppelt: " + doubleNumbers);

        System.out.println("------------");


        // Zahlen aufsteigend sortieren
        List <Integer> sortedNumbers = numbers.stream()
                .sorted().toList();
                System.out.println("Zahlen sortiert: "+ sortedNumbers);


        System.out.println("------------");


        // Alle Zahlen zusammen addieren

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
                System.out.println("Summe aller Zahlen: " + sum);



        // Alle Zahlen zusammentragen die Addiert wurden
        List <Integer> newList = numbers.stream()
                .collect(Collectors.toList());

        System.out.println("------------");

        System.out.println("Alle Zahlen die addiert wurden: " + numbers + " = " + sum);

        System.out.println("------------");
    }
}