package com.kalle.demo;

import java.util.Scanner;

public class Combat {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("""
                1. Fight
                2. Stats
                3. Run away
                """);

        switch (sc.nextLine()) {
            case "1" -> System.out.println("Combat");
                case "2" -> System.out.println("Stats");
                    default -> System.out.println("Trying to cowardly dashing away");
        }

    }
}
