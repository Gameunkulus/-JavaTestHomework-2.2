package com.company;

public class Main {

    public static void main(String[] args) {

        int account = 100;
        System.out.println(bonusAdds(300, account));
        System.out.println(bonusAdds(1100, account));
    }

    public static int bonusAdds(int miles, int account) {

        if (miles > 1000) {
            return account + miles + (miles / 100);
        } else {
            return account + miles;
        }
    }
}