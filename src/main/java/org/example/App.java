
package se.inyat;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the contact name:");
        String name = scanner.next();

        System.out.println("Enter the contact number:");
        String number = scanner.next();

        String foundContact = ContactData.findContact(name, number);
        if (foundContact == null) {
            System.out.println("Contact does not exist.");
        } else {
            System.out.println("Found contact: " + foundContact);
        }
    }
}
