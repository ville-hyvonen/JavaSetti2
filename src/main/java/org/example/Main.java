package org.example;

import org.example.Teht14.Account;
import org.example.Teht14.Bank;
import org.example.Teht18.File2;
import org.example.Teht18.Text;
import org.example.Teht18.Audio;
import org.example.Teht18.FILES;
import org.example.Teht20.Task1;
import org.example.Teht20.Task2;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Teht11
        System.out.println(Teht11.SumHighestThree(Teht11.test1));
        System.out.println(Teht11.SumHighestThree(Teht11.test2));

        System.out.println("------------------------------------");


        //Teht12
        System.out.println(Teht12.generateName());

        System.out.println("------------------------------------");


        //Teht13
        File x = new File("C:\\Users\\ville\\Desktop\\Data-analytiikka\\Data (python)\\Data");
        long size = Teht13.dirSizeCalc(x);
        System.out.println(size);

        System.out.println("------------------------------------");


        //Teht14
        Bank bank = new Bank();

        Account acc1 = new Account("123456", "Joonas Juusela", 1234.56);
        Account acc2 = new Account("654321", "Kalle Kekkonen", 15.42);

        bank.addAcc(acc1);
        bank.addAcc(acc2);

        bank.showAccInfo("123456");

        System.out.println("------------------------------------");

        bank.showAccInfo("654321");

        System.out.println("------------------------------------");

        acc1.withdraw(1234567.0);

        System.out.println("------------------------------------");

        acc2.withdraw(1.0);

        System.out.println("------------------------------------");

        acc1.deposit(234.0);

        System.out.println("------------------------------------");

        acc2.deposit(3.0);

        System.out.println("------------------------------------");

        bank.showAccInfo("654321");

        System.out.println("------------------------------------");
        bank.showAccInfo("123456");


        System.out.println("------------------------------------");


        //Teht 15
        Teht15 test1 = Teht15.getInstance();
        Teht15 test2 = Teht15.getInstance();

        test1.setTrack("Sabaton - Primo Victoria");
        test2.playTrack();

        System.out.println(test1 == test2);

        System.out.println("------------------------------------");


        //Teht16
        int[] numsList = Teht16.generateNums();
        Teht16.findMissingNum(numsList);

        System.out.println("------------------------------------");


        //Teht17
        String input = "Kyllä se koodaus on sitten hupaisaa!";        // Kovakoodattu input testaamisen nopetukseen jne
        System.out.println(Teht17.reverseString(input));

        // Käyttäjältä syötteen ottava versio
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kirjoita jotain: ");
        String input = scanner.nextLine();
        System.out.println(Teht17.reverseString(input));
        scanner.close();
        */

        System.out.println("------------------------------------");


        //Teht18
        File2 text = new Text("teksti polku tähän");
        File2 audio = new Audio("audio polku tähän");

        System.out.println("Text path: " + text.getPath());
        System.out.println("Audio path: " + audio.getPath());

        text.open();
        audio.open();

        text.close();
        audio.close();


        System.out.println("------------------------------------");


        //Teht19
        Teht19<String> stack = new Teht19<>();

        stack.push("kissa");
        stack.push("talo");
        stack.push("Hello world!");
        stack.push("1");

        System.out.println("Size: " + stack.size());

        stack.pop();
        stack.pop();
        System.out.println("Is empty?: " + stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println("Is empty?: " + stack.isEmpty());

        System.out.println("------------------------------------");


        //Teht20
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());

        thread1.start();
        thread2.start();

    }
}