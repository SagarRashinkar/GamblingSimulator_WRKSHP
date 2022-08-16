public class GamblerSimulator {

    public static void welcomeMsg(){
        System.out.println("Welcome to Gambler Simulator Program...");
    }

    public static void main(String[] args) {

        int stake = 100;
        int dailyBetValue = 1;
        welcomeMsg();
        System.out.println("Starting Stake Value is: "+stake);
        System.out.println("Gambler bet Daily: "+dailyBetValue);
    }
}
