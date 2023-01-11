package day4;

/*Создать новый массив размера 100 и заполнить его случайными числами из
        диапазона от 0 до 10000.
        Затем, используя циклы for each вывести:
        - наибольший элемент массива
        - наименьший элемент массива
        - количество элементов массива, оканчивающихся на 0
        - сумму элементов массива, оканчивающихся на 0
        Использовать сортировку запрещено.*/

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = new int[100];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max)
                max = i;
        }

        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min)
                min = i;
        }

        int count = 0;
        int sum = 0;
        for (int i : arr) {
            if (i % 10 == 0)
                count++;
                sum += i;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
        System.out.println(sum);
    }
}
