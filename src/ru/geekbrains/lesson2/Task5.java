package ru.geekbrains.lesson2;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {11, 52, 33, 222, 131, 44, 57, 21, 74, 85, 19, 81};
        int i;
        int max = array[0];
        int min = array[0];

        for (i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println("Максимальное значение " + max);

        for (i = 0; i < array.length; i++) {
            if (array[i] <min) min = array[i];
        }
        System.out.println("Минимальное значение " + min);
    }
}
