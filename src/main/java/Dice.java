public class Dice {

    public int numDice ;

    public Dice(int numDice) {

        this.numDice = numDice;


    }
    public Integer tossAndSum()
    {
        int sum = 0;

        for(int i = 0; i<this.numDice; i++)
        {
            sum += Math.random() * 6 + 1;
        }
        return sum;
    }

}
