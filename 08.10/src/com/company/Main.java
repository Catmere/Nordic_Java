package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (false) {
            int a = 20;
            int b = 25;
            boolean cond = (a > b);
            int c = cond ? 90 : 95;
            System.out.println(c);

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите \"abc\"");
            String tmp = sc.nextLine();

            if (tmp.equals("abc")) {
                System.out.println("Верно");
            } else {
                System.out.println("Неверно");
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Посчитаем сумму двух положительных чисел");

        int sum = 0;
        for(int numOrder = 1; numOrder<=2; numOrder++){
            System.out.println("Введите число №"+numOrder);
            int tmp = scanner.nextInt();
            if (tmp<=0){
                System.out.println("Число не положительное!");
                numOrder--;
                continue;
            }
            sum+=tmp;
        }
        System.out.println("Сумма: "+sum);
    }
}
