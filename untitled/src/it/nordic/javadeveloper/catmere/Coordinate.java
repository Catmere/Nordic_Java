package it.nordic.javadeveloper.catmere;

import java.util.Scanner;

public class Coordinate {
    public int x;
    public int y;

    public void fillFromScanner(Scanner scanner){
        System.out.println("Введите значение х:");
        this.x = scanner.nextInt();
        System.out.println("Введите значение y:");
        this.y = scanner.nextInt();
    }
}
