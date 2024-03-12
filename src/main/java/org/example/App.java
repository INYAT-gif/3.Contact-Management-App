package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
//how to call ContactData.findContact
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the contact info (name,number).");
        String contact = scannner.next();
        String foundContact = ContactData.findContact(contact);
        if (foundContact == null) {
            System.out.println("Contact does not exist.");
        } else {
            System.out.println(contact);
        }
    }
}
