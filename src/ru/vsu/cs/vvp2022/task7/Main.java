package ru.vsu.cs.vvp2022.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mass = readArray("mass");
        System.out.println();
    }

    public static int[] readArray(String massiveName) {
        Scanner scanner = new Scanner(System.in);

        int arrLen = readArrLen(massiveName);

        int[] massive = new int[arrLen];

        for (int i = 0; i < arrLen; i++) {
            System.out.printf("Введите %s элемент массива ", i + 1);

            massive[i] = scanner.nextInt();
        }
        return massive;
    }

    public static int readArrLen(String massiveName) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите длину массива %s ", massiveName);
        int len = scanner.nextInt();

        return len;
    }

}
