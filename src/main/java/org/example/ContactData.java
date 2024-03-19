package se.inyat;

import java.util.Scanner;

public class ContactData {
    private static String[] contactStorage = {"Inayat,123456789", "Mehrdad,987654321", "Marcus,543216789"};

    // Define a method to find a contact data (by name and number)
    public static String findContact(String name, String number) {
        String contactToFind = name + "," + number;
        for (String element : contactStorage) {
            if (contactToFind.equalsIgnoreCase(element)) {
                return element;
            }
        }
        return null;
    }
}
