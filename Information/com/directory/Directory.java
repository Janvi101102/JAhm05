package com.directory;

import java.util.Scanner;

public class Directory {
    private Person[] directory;
    private int size;

    public Directory(int initialCapacity) {
        this.directory = new Person[initialCapacity];
        this.size = 0;
    }

    public void createEntry(String name, String address, String telephone, String mobile, String headOfFamily, String uniqueID) {
        for (int i = 0; i < size; i++) {
            if (directory[i].getUniqueID().equals(uniqueID)) {
                System.out.println("Unique ID already exists.");
                return;
            }
        }

        if (size >= directory.length) {
            resize();
        }

        Person person = new Person(name, address, telephone, mobile, headOfFamily, uniqueID);
        directory[size] = person;
        size++;
        System.out.println("Entry created successfully.");
    }

    public void editEntry(String uniqueID) {
        Person personToEdit = null;
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (directory[i].getUniqueID().equals(uniqueID)) {
                personToEdit = directory[i];
                index = i;
                break;
            }
        }

        if (personToEdit == null) {
            System.out.println("Entry with Unique ID not found.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Editing entry for Unique ID: " + uniqueID);
        System.out.print("Enter new name (current: " + personToEdit.getName() + "): ");
        personToEdit.setName(scanner.nextLine());
        System.out.print("Enter new address (current: " + personToEdit.getAddress() + "): ");
        personToEdit.setAddress(scanner.nextLine());
        System.out.print("Enter new telephone (current: " + personToEdit.getTelephone() + "): ");
        personToEdit.setTelephone(scanner.nextLine());
        System.out.print("Enter new mobile (current: " + personToEdit.getMobile() + "): ");
        personToEdit.setMobile(scanner.nextLine());
        System.out.print("Enter new head of family (current: " + personToEdit.getHeadOfFamily() + "): ");
        personToEdit.setHeadOfFamily(scanner.nextLine());

        directory[index] = personToEdit;
        System.out.println("Entry updated successfully.");
    }

    public void displayEntry(String uniqueID) {
        for (int i = 0; i < size; i++) {
            if (directory[i].getUniqueID().equals(uniqueID)) {
                System.out.println(directory[i]);
                return;
            }
        }

        System.out.println("Entry with Unique ID not found.");
    }

    private void resize() {
        Person[] newDirectory = new Person[directory.length * 2];
        System.arraycopy(directory, 0, newDirectory, 0, directory.length);
        directory = newDirectory;
    }
}
