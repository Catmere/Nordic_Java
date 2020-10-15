package it.nordic.javadeveloper.catmere;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        rectangle.fillFromScanner(scanner);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.fillFromScanner(scanner);

        System.out.println("Площадь 1 прямоугольника равна " + rectangle.calculateS());
        System.out.println("Площадь 2 прямоугольника равна " + rectangle1.calculateS());
    }




}
