package com.bridgelabz;

public class GamblerSimulator {

    public static int stake = 100;
    public static int dailyBetValue = 1;

    public static int checkWinOrLose(){
        int check = (int)(Math.floor(Math.random() * 10)%2);
        return check;
    }

    public static void main(String[] args) {

        int winAmt = 0;
        int loseAmt = 0;
        boolean status = false;
        System.out.println("Starting Stake Value is: "+stake+" $");
        System.out.println("Gambler bet Daily: "+dailyBetValue+" $");

        for(int i=1; i<=stake; i++){
            int check = checkWinOrLose();
            if(check == 1){
                winAmt++;
                if(winAmt == 50){
                    status = true;
                    System.out.println("Player win 50% and resigned...");
                    break;
                }
            }else {
                loseAmt++;
                if (loseAmt == 50){
                    status = false;
                    System.out.println("Player lose by 50% and resigned...");
                    break;
                }
            }
        }
        if (status){
            System.out.println("Final remaining stake is: "+(stake+winAmt));
        }else{
            System.out.println("Final remaining stake is: "+(stake-loseAmt));
        }
    }
}
