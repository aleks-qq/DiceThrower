/**
 *
 * @author ddrank
 */

import java.util.Random;

public class DiceModel {

    private int nOfThrows;
    private final Random rand;

    public DiceModel(){
        rand = new Random();
    }
    
//diceCount() returns int with random value from 1 to 6
    public int diceCount() {
        nOfThrows++;
        return rand.nextInt(6) + 1;
    }

//thrown() returns the amount of dices rolled
    public int thrown() {
        return nOfThrows;
    }
}
