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

        ArraysMethods.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("сортированный массив выведен");
    }
}