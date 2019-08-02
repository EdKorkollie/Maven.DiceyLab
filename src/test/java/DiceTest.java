import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void tossAndSum() {

    int expectedMin = 2;

    int expectedMax = expectedMin * 6;

    Dice myDice = new Dice(expectedMin);

    int actual = myDice.tossAndSum();

    Assert.assertTrue(actual <= expectedMax && actual >=expectedMin);

    }
}