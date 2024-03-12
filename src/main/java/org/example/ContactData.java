package org.example;
import java.util.Scanner;
public class ContactData {
    private static String[] contactStorage = {"Simon, 123456789", "Mehrdad,987654321", "Marcus,543216789"};
    //define methods to find contact by name, find contact by number, add a new contact to the contacts array, remove, edit and more..

    //define a method to find a contact data (by name and number)
    public static String findContact(String contactToFind) { //ex. Mehrdad, 987654321
        //Iterate on the array
        for (String element : contactStorage){
            if(contactToFind.equalsIgnoreCase(element)){
                return element;
            }
        }
        return null;
   }
}
