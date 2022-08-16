public class GamblerSimulator {

    public static int stake = 100;
    public static int dailyBetValue = 1;
    public static void welcomeMsg(){
        System.out.println("Welcome to Gambler Simulator Program...");
    }

    public static void main(String[] args) {

        welcomeMsg();
        System.out.println("Starting Stake Value is: "+stake);
        System.out.println("Gambler bet Daily: "+dailyBetValue);
    }
}
