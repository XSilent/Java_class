
import java.lang.Math; 

/**
 * Dice
 * 
 * Dice with two constructors,
 * change amount of dice faces
 * by providing amount of max eyes.
 */
public class Dice 
{
    private int eyes;

    // Constructor
    public Dice(int eyes) {
        this.eyes = eyes;
    }

    // Constructor default
    public Dice() {
        this.eyes = 6;
    }

    // Throw dice
    public int getDiceThrow() 
    {
        int min = 1;
        int max = this.eyes;

        return (int)Math.round((Math.random() * (max - min)) + min);
    }

    public int getAmountOfEyes() 
    {
        return eyes;
    }

    // Overwrite toString method,
    // to output dice throw, when object 
    // is printed
    public String toString() {
        return "" + this.getDiceThrow();
    }
}