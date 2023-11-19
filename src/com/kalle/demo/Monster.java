package com.kalle.demo;

public class Monster {


    public static int minValue = 1;
    public static int maxValue = 20;
    public static int monsterLvl = (int)Math.floor(Math.random() * (maxValue - minValue +1) + minValue);

    public static int mobPower = 2 * monsterLvl;
    public static int mobPre = 2 * monsterLvl;
    public static int mobDex = 2 * monsterLvl;
    public static int mobHp = 15 * monsterLvl;

    public static void stats(String[] args) {
        System.out.println("Level:" + monsterLvl);
        System.out.println("Power:" + mobPower);
        System.out.println("Precision:" + mobPre);
        System.out.println("Dexterity:" + mobDex);
        System.out.println("Health:" + mobHp);
    }
}
