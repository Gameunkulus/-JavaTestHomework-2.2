package com.company;

public class Main {

    public static void main(String[] args) {
        int account = 100;
        System.out.println(bonuses(300, account));
        System.out.println(bonuses(1100, account));
    }

    public static int bonuses(int miles, int account) {
        if (miles > 1000) {
            return account + miles + (miles / 100);
        } else {
            return account + miles;
        }
    }
}