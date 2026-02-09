package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " je sudé");
            } else {
                System.out.println(i + " je liché");
            }
        }
        System.out.println("A tak, no ...");
    }
}