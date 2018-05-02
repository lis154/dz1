package com.company;

import java.sql.SQLOutput;

public class Dz1 {

    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int i = 3;
        long t = 4;
        float r = 1.2f;
        double e = 5.23;
        char w = 'w';
        boolean y = true;
        System.out.println(calculate(5, 3, 8, 9));
        System.out.println(proverka(5, 17));
        proverka2(45);
        System.out.println(proverka3(-5));
        privetstvie("Илья");
        god_proverka(1024);
        int newParametr = 10;

    }

    public static int calculate(int a, int b, int c, int d) {
        int rez = a * (b + (c / d));
        return rez;
    }

    public static boolean proverka(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else
            return false;
    }

    public static void proverka2(int a) {
        if (a < 0) {
            System.out.println("число отрицательное");
        } else
            System.out.println("число положительное");
    }

    public static boolean proverka3(int a) {
        if (a < 0) {
            return true;
        } else
            return false;
    }

    public static void privetstvie(String name) {
        System.out.println("Привет, " + name);
    }

    public static void god_proverka(int god) {
        if (god % 400 == 0) {
            System.out.println("Год високосный");
        } else if (god % 100 == 0) {
            System.out.println("Год не високосный");
        } else if (god % 4 == 0) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
    }
}
