package com.kalle.demo;

public abstract class IText {

    private static String welcome;

    public IText(String welcome) {
        this.welcome = welcome;
    }
    public static String getWelcome() {
        return welcome;
    }
    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }



}
