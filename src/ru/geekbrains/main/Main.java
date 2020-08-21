package ru.geekbrains.main;

import ru.geekbrains.lesson1.Task2;
import ru.geekbrains.lesson1.Task5;
import ru.geekbrains.lesson1.Task6;
import ru.geekbrains.lesson1.Task7;

public class Main {
    public static void main(String[] args) {
        Task2 ourTask2=new Task2();
        ourTask2.name="Ivan";
        ourTask2.showName();
        Task5.math2(-0);
        Task6.math3(1);
        Task7 ourTask7=new Task7();
        ourTask7.name="Ivan";
        ourTask7.showName();
    }
}
