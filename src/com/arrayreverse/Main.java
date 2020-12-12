package com.arrayreverse;

public class Main {

    public static void main(String[] args) {
        int[] processArr = new int[10];
        int out = processArr.length;
        int buff;

        // Инициализация массива
        for (int i = 0; i < processArr.length; i++) {
            processArr[i] = i + 1;
        }

        System.out.println("Исходный массив");
        for (int i = 0; i < processArr.length; i++) {
            System.out.print(processArr[i] + " ");
        }

        // Реверс массива
        for (int i = 0; i <= 5; i++) {
            out = out - 1;
            buff = processArr[out];
            processArr[out] = processArr[i];
            processArr[i] = buff;
        }

        // Вывод значений
        System.out.println("\nПерестановка элементов массива в обратном порядке");
        for (int i = 0; i < processArr.length; i++) {
            System.out.print(processArr[i] + " ");

        }
    }
}