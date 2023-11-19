package com.kalle.demo;

public class Player {

    public static int basePower = 5;
    public static int basePre = 5;
    public static int baseDex = 5;
    public static int baseHp = 50;
    public static int baseXp = 5;
    public static int baseLvl = 1;

    public static void main(String[] args) {

        //stat check:
        System.out.println(basePower);
        System.out.println(basePre);
        System.out.println(baseDex);
        System.out.println(baseHp);
        System.out.println(baseXp);
        System.out.println(baseLvl);

    }

     public static int lvl = baseLvl + 3;
    public static int power = basePower + lvl * 2;
    public static int pre = basePre + lvl * 2;
    public static int dex = baseDex + lvl * 2;
    public static int hp = baseHp + lvl * 10;






}
