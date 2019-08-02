public class Simulation {

   private Integer numDice, numRoll;
    private Dice dice1;
    private Bins bin;

public Simulation(int numDice, int numRoll)
{
    this.numDice = numDice;
    this.numRoll = numRoll;
    this.dice1 = new Dice(numDice);
    this.bin = new Bins(numDice, numDice * 6);
}
public void runSimulation()
{
    for(int i = 0; i < numRoll; i++)
    {
        int diceRoll = dice1.tossAndSum();

        bin.increment(diceRoll);

    }
}
public void printResult()
{

    for (int i = 0; i < bin.arr.length; i++) {
        System.out.println(i+2 + " : " + bin.arr[i]);
    }
}

}
