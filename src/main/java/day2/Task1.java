package day2;

/*
Реализовать программу, которая принимает на вход через консоль с помощью
        класса Scanner, число, соответствующее количеству этажей в здании. Используя
        условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.
        Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более
        - “Многоэтажный дом”. Так же, необходимо учесть что может быть введено
        отрицательное значение, в таком случае сообщить “Ошибка ввода”.
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число этажей:");

        int floorCount = sc.nextInt();

        if (floorCount > 0 && floorCount < 5) {
            System.out.println("Малоэтажный дом");
        } else if (floorCount >= 5 && floorCount < 9) {
            System.out.println("Среднеэтажный дом");
        } else if (floorCount >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
