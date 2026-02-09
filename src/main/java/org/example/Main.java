package org.example;

import java.io.IO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        var lines = Files.readAllLines(
                Paths.get("U:\\PRO1\\Cvičení\\cv01\\ucastnici.txt"));
        for(var line : lines) {
            var split = line.split(",");
            var p = new Participant(
                    split[0],
                    Integer.parseInt(split[1]));
            IO.println(p.getInfo(2026));
        }
    }
}