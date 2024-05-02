package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Teht16 {

    static int[] generateNums() {
        Random rand = new Random();
        //int max = 10;                                   // Testaustarkoituksessa pieni luku
        int max = 5000;
        int n = rand.nextInt(max) + 1;

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        if (n > 1) {                                    // Jos listassa on vain 1 numero, ei poista
            int randNum = rand.nextInt(n - 1);      // Jotta ei voi poistaa viimeistä numeroa
            nums.remove(randNum);
        } else {
            System.out.println("List only contains 1 number, nothing is missing.");
        }
        System.out.println(nums);

        int[] numsList = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            numsList[i] = nums.get(i);
        }

        return numsList;
    }

    static int findMissingNum(int[] x) {
        int current;
        int previous = 0;
        int missing = 0;

        for (int i = 0; i < x.length; i++) {
            current = x[i];
            if (current - previous != 1) {
                missing = current - 1;
            }
            previous = current;
        }
        if (missing > 0) {
            System.out.println(missing + " is missing from the list.");
        }
        return missing;
    }


}
