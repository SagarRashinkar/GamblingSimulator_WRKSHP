package com.bridgelabz;

public class GamblerSimulator {

    public static int stake = 100;
    public static final int dailyBetValue = 1;

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

        for(int day=1; day<=20; day++){
            int todayWinAmt = 0;
            int todayLoseAmt = 0;

            for(int i=1; i<=stake; i++){
                int check = checkWinOrLose();
                if(check == 1){
                    winAmt++;
                    todayWinAmt++;
                    if(winAmt == 50){
                        winAmt = 0;
                        status = true;
                        System.out.println("Player win 50% and resigned...");
                        break;
                    }else if (loseAmt == 50){
                        loseAmt = 0;
                        status = false;
                        System.out.println("Player lose by 50% and resigned...");
                        break;
                    }
                }else {
                    loseAmt++;
                    todayLoseAmt++;
                }
            }
            if (status){
                System.out.println("Day "+day+" winning Amount is: "+(todayWinAmt));
            }else{
                System.out.println("Day "+day+" losing Amount is: "+(todayLoseAmt));
            }
        }
    }
}
