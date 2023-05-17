package com.company;

public class Main {

    public static void main(String[] args) {

        int account = 100;
        System.out.println(bonusAdds(300,account));
        System.out.println(bonusAdds(1100,account));
    }

    public static int bonusAdds(int x, int y){

        if (x > 1000) {
            return y + x + (x/100);
        }
        else{
            return y + x;
        }
    }
}