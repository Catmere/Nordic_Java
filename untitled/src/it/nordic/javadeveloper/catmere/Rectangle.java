package it.nordic.javadeveloper.catmere;

import java.util.Scanner;

public class Rectangle {
    public Coordinate c1;
    public Coordinate c2;

    public Rectangle(){
        c1 = new Coordinate();
        c2 = new Coordinate();
    }

    public void fillFromScanner(Scanner scanner){
        System.out.println("Введите значение первой координаты:");
        c1.fillFromScanner(scanner);
        System.out.println("Введите значение второй координаты:");
        c2.fillFromScanner(scanner);
    }

    public int calculateS() {
        return Math.abs((this.c2.x - this.c1.x) * (this.c2.y - this.c1.y));
    }
}
