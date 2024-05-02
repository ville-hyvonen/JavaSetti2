package org.example;

public class Teht11 {
    static int[] test1 = {9,8,32,-2,1};
    static int[] test2 = {2,5,1,3,2};

    static int SumHighestThree(int[] testArray) {
        int tempResult = 0;
        int result = 0;

        for (int i = 0; i < testArray.length - 2; i++) {
            tempResult = testArray[i] + testArray[i + 1] + testArray[i + 2];
            if (tempResult > result) {
                result = tempResult;
            }
        }

        return result;
    }
}
