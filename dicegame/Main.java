/**
 * Main 
 * 
 * Entry point for "dice game"
 */
public class Main 
{
    public static void main(String[] args) 
    {
        // using "normal" dice with 6 eyes max
        Dice fancyDice = new Dice();
        System.out.println("Dice 6 I: " + fancyDice);
        System.out.println("Amount of eyes: " + fancyDice.getAmountOfEyes());

        int nr6 = fancyDice.getDiceThrow();
        System.out.println("Dice 6 II: " + nr6);

        System.out.println("");

        // Using another dice
        Dice multiDice = new Dice(16);
        int nr16 = multiDice.getDiceThrow();
        System.out.println("Dice 16: " + nr16);
        System.out.println("Amount of eyes: " + multiDice.getAmountOfEyes());
    }
}