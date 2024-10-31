package ru.dyankovskaya.arrays2.service;

public class ArraysMethods {

    public static void sort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temporary = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temporary;
                    isSorted = false;
                }
            }
        }
    }
}