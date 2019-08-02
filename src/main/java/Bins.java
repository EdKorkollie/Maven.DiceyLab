
public class Bins {

   public Integer [] arr;

   public Bins(Integer minRoll, Integer maxRoll  )
   {
       // creating an array to keep track of how many times the dice roll occurred.
       this.arr = new Integer[maxRoll - minRoll + 1];
       // when we make new array everthing is null, we are loop through to see array content to 0 instead of null
       for(int i =0; i <arr.length; i++)
       {
           arr[i] = 0;
       }
   }
public  Integer getBin(int numBin)
{
    return arr[numBin - 2];
}
public void increment(int numBin)
{
    arr[numBin-2]++;

}
}
