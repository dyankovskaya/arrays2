package ru.dyankovskaya.arrays2._main;

import ru.dyankovskaya.arrays2.service.ArraysMethods;

import java.util.Random;

public class _Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 101);
            System.out.print(array[i] + " ");
        }
        System.out.println("массив выведен");

        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++){
                if (array[i] < array [i-1]){
                    int temporary = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temporary;
                    isSorted = false;
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("сортированный массив выведен");
        }

    }

}
