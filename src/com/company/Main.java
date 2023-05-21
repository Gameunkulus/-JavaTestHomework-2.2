package com.company;

public class Main {

    public static void main(String[] args) {

        int account = 100;
        System.out.println(bonusMiles(300, account));
        System.out.println(bonusMiles(1100, account));
    }

    public static int bonusMiles(int miles, int account) {

        if (miles > 1000) {
            return account + miles + (miles / 100);
        } else {
            return account + miles;
        }
    }
}