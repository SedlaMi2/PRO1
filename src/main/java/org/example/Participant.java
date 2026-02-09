package org.example;

public class Participant {
    private String name;
    private int bYear;

    public Participant(String name, int bYear) {
        this.name = name;
        this.bYear = bYear;
    }


    public String getInfo(int year) {
        return name + ", " + (year - bYear);
    }
}
