package org.example;
import java.util.Random;
public class Teht12 {
    static String[] firstNames = {"Pekka", "Jarno", "Esko", "Joonas", "Väinö"};
    static String[] lastNames = {"Jussila", "Virtanen", "Korhonen", "Aalto", "Smith"};

    static String firstName, lastName;
    static String generateName() {
        Random rand = new Random();
        firstName = firstNames[rand.nextInt(firstNames.length)];
        lastName = lastNames[rand.nextInt(lastNames.length)];
        String fullName = firstName + " " + lastName;
        return fullName;
    }
}
