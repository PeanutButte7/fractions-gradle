import org.junit.Assert;
import org.junit.Test;


public class TestMultiplication {

    @Test
    public void testSimple() {
        IFraction fraction = TestUtils.createFraction(2, 3);
        IFraction result = fraction.times(new NotImplementedFraction(5, 7));

        Assert.assertEquals((Integer) 10, result.getNumerator());
        Assert.assertEquals((Integer) 21, result.getDenominator());
    }

    @Test
    public void testNormalisation() {
        IFraction fraction = TestUtils.createFraction(2, 8);
        IFraction result = fraction.times(new NotImplementedFraction(4, 2));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 2, result.getDenominator());
    }
}
