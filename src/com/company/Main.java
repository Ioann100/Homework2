package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  Task1();
        // Task2();
        //Task3();
        //Task4();
        //Task5();
        //Task6();
        // Task7();
        // Task8();
        //Task9();
        Task10();
    }

    private static void Task1() {
        Random ran = new Random();
        int a = (int) (Math.random() * (200 + 1)) - 100;
        int b = (int) (Math.random() * (200 + 1)) - 100;
        //  int a = ran.nextInt(100);
        //  int b = ran.nextInt(100);
        if (b == 0) {
            System.out.println("Ошибка");
        } else {
            System.out.println(a / b);
        }
    }

    private static void Task2() {
        System.out.println("В каком году была основана Одесса?");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        if (a == 1794) {
            System.out.println("Правильный ответ");
        } else {
            System.out.println("Вы ошиблись,Одесса была основана в 1794 ");
        }
    }

    private static void Task3() {
        System.out.println("Вычисление стоимости покупки с учетом скидки.");
        Scanner price = new Scanner(System.in);
        double x = price.nextInt();
        if (x > 1000) {
            System.out.println("Вам предоставляется скидка 5%");
            System.out.println("Сумма с учетом скидки:" + (x - (x * 0.05)) + " грн.");
        } else if (x > 500) {
            System.out.println("Вам предоставляется скидка 3%");
            System.out.println("Сумма с учетом скидки: " + (x - (x * 0.03)) + " грн. ");
        } else System.out.println("Сумма недостаточна для скидки.");


    }

    private static void Task4() {
        System.out.println("Введите целое число");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        if (n % 2 == 1) {
            System.out.println("Число " + n + " - нечетное");
        } else System.out.println("Число " + n + " - четное");


    }

    private static void Task5() {
        System.out.println("Введите целое число.");
        Scanner numb = new Scanner(System.in);
        int y = numb.nextInt();
        if (y % 3 == 0) {
            System.out.println("Число " + y + " нацело делится на три.");
            System.out.println(" Ответ: " + y / 3);
        } else System.out.println("Число " + y + " нацело на три не делится.");

    }

    private static void Task6() {
        System.out.println("Длительность разговора (целое количество минут)");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        double money = 2.5;
        if (min < 0 || min == 0) {
            System.out.println("Операция недоступна.");
        } else if (min > 0) {
            System.out.println("День недели (1-пн,2-вт,3-ср,4-чт,5-пт,6-сб,7-вс)");
            int day = scanner.nextInt();

            if (day == 6 || day == 7) {
                System.out.println("Предоставляется скидка 20%.");
                System.out.println("Стоимость разговора:" + ((money * min) - (money * min) * 0.20));
            } else if (day > 7 || day < 0 || day == 0) {
                System.out.println("Такого дня не существует.");
            } else System.out.println("Стоимость разговора: " + money * min + " грн.");
        }
    }

    private static void Task7() {
        int x = (int) (100 + Math.random() * 900);
        System.out.println(x);
        int num1 = x / 100;
        int num2 = x % 100 / 10;
        int num3 = x % 10;
        //  System.out.println(num1);
        //  System.out.println(num2);
        //  System.out.println(num3);
        if (num1 > num3) {
            System.out.println("Первая цифра больше третей.");
        } else if (num1 == num3) {
            System.out.println("Цифры ровны.");
        } else System.out.println("Третья цифра больше первой.");

        if (num1 > num2) {
            System.out.println("Первая цифра больше второй.");
        } else if (num1 == num2) {
            System.out.println("Цифры ровны.");
        } else System.out.println("Вторая цифра больше первой.");

        if (num3 > num2) {
            System.out.println("Третья цифра больше второй.");
        } else if (num3 == num2) {
            System.out.println("Цифры ровны.");
        } else System.out.println("Втора цифра больше третей.");


    }

    private static void Task8() {
        int c = (int) (100 + Math.random() * 900);
        System.out.println(c);
        int num1 = c / 100;
        int num2 = c % 100 / 10;
        int num3 = c % 10;
        System.out.println("Квадрат числа: " + c * c);
        System.out.println("Сумма кубов его цифр: " + num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3);
        if (c * c == num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3) {
            System.out.println("Квадрат этого числа равен сумме кубов его цифр.");
        } else System.out.println("Квадрат этого числа не равен сумме кубов его цифр.");


    }

    private static void Task9() {
        double x = (Math.random() * (200 + 1)) - 100;
        double y = (Math.random() * (200 + 1)) - 100;
        System.out.println(x);
        System.out.println(y);
        if (x < y) {
            x = (x + y) / 2;
            y = (x + y) * 2;
            System.out.println("x =" + x + " y =" + y);
        } else if (y > x) {
            y = (x + y) / 2;
            x = (x + y) * 2;
            System.out.println("x =" + x + " y =" + y);
        }

    }

    private static void Task10() {
        //ax3 + bх = 0
        //double a = (int) (Math.random() * (99 + 1)) ;
        //double b = (int) (Math.random() * (99 + 1)) ;
        double a = 139;
        double b = 179;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        double x_2 = -b / a;
        if (a == 0 && b == 0) {
            System.out.println("x имеет бескоречное количество решений");
        } else if (a != 0 && b != 0) {
            System.out.println("x1 = 0");
        } else if (a != 0 || b == 0) {
            System.out.println("x = 0");
        } else if (x_2 > 0 || x_2 == 0) {
            System.out.println("x2 =" + Math.sqrt(x_2));
        } else if (a == 0 || b != 0) {
            System.out.println("x = 0");
        }

    }
}




