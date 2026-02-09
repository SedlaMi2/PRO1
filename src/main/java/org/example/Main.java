package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            i =+ 2;
            System.out.println("i = " + i);
            i =- 3;
            System.out.println("i = " + i);
        }
    }
}