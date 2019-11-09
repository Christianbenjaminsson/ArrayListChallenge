package com.example;

import java.util.Scanner;

public class ArrayListChallenge {

    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0700000000");

    public static void main(String[] args) {

        boolean quit = false;

        startPhone();
        printActions();

        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions");
            int action = scan.nextInt();
            scan.nextLine();
            
            switch(action) {
                case 0:
                    System.out.println("\nShutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break
                case 6:
                    printActions();
                    break:
            }
        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scan.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scan.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if ( mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name= " + name + ", phone=" + phone);
        } else {
            System.out.println("can't add, " + name + " already on file");
        }
    }

    private static void updateContact() {

    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions: \nPress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact" +
                           "5 - query if an existing contact exists\n" +
                           "6 - to print list of available actions");
        System.out.print("Choose your action: ");
    }

}
