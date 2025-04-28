package com.example.LinkedListDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add an element to the list");
            System.out.println("2. Remove the last element");
            System.out.println("3. Remove an element at a specific position");
            System.out.println("4. Display the list");
            System.out.println("5. Count the number of nodes");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    int value = scanner.nextInt();
                    list.append(value);
                    break;
                case 2:
                    list.removeLast();
                    System.out.println("Last element removed.");
                    break;
                case 3:
                    System.out.print("Enter the position to remove: ");
                    int position = scanner.nextInt();
                    list.removeAtPosition(position);
                    System.out.println("Element at position " + position + " removed.");
                    break;
                case 4:
                    System.out.println("Current Linked List:");
                    list.printList();
                    break;
                case 5:
                    System.out.println("Number of nodes: " + list.size());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("--------------------");
        } while (choice != 6);

        scanner.close();
    }
}