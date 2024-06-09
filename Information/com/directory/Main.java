package com.directory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory(10); // Create a directory with an initial capacity of 10 entries
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Display an entry");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    createEntry(scanner, directory);
                    break;
                case 2:
                    editEntry(scanner, directory);
                    break;
                case 3:
                    displayEntry(scanner, directory);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void createEntry(Scanner scanner, Directory directory) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter telephone (with STD code): ");
        String telephone = scanner.nextLine();
        System.out.print("Enter mobile: ");
        String mobile = scanner.nextLine();
        System.out.print("Enter head of family: ");
        String headOfFamily = scanner.nextLine();
        System.out.print("Enter unique ID: ");
        String uniqueID = scanner.nextLine();

        directory.createEntry(name, address, telephone, mobile, headOfFamily, uniqueID);
    }

    private static void editEntry(Scanner scanner, Directory directory) {
        System.out.print("Enter unique ID of the entry to edit: ");
        String editID = scanner.nextLine();
        directory.editEntry(editID);
    }

    private static void displayEntry(Scanner scanner, Directory directory) {
        System.out.print("Enter unique ID of the entry to display: ");
        String displayID = scanner.nextLine();
        directory.displayEntry(displayID);
    }
}
