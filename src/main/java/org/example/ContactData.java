package org.example;

public class ContactData {
    private static String[] contactStorage = {"Simon, 123456789", "Mehrdad,987654321"}
            public static String findContact(String contactToFind) {
        for (String element : contactStorage){
            if(contactToFind.equalsIgnoreCase(element)){
                return element;

            }
        }
        return null;
            }
}
