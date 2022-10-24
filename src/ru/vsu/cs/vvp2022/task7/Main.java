package ru.vsu.cs.vvp2022.task7;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mass = readArrayFromFile(args[0]);
        System.out.println();
    }

    public static int[] readArrayFromFile(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            int[] massive = new int[getLineCountByReader(fileName)];
            int i = 0;
            while (scanner.hasNextInt()) {
                massive[i] = scanner.nextInt();
                i++;
            }
            return massive;
        } catch (IOException e) {
            int[] massive = new int[0];
            return massive;
        }
    }

    public static int getLineCountByReader(String fileName) {
        try (var lnr = new LineNumberReader(new BufferedReader(new FileReader(fileName)))) {
            while (lnr.readLine() != null) ;
            return lnr.getLineNumber();
        } catch (IOException e){
            return 0;
        }
    }
}
