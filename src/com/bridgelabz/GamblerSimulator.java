package com.bridgelabz;

public class GamblerSimulator {

    public static int stake = 100;
    public static int dailyBetValue = 1;

    public static int checkWinOrLose(){
        int check = (int)(Math.floor(Math.random() * 10)%2);
        return check;
    }

    public static void main(String[] args) {

        System.out.println("Starting Stake Value is: "+stake+" $");
        System.out.println("Gambler bet Daily: "+dailyBetValue+" $");
        int check = checkWinOrLose();
        if(check == 1){
            System.out.println("Win!!!");
        }else {
            System.out.println("Loose!!!");
        }
    }
}
