import org.junit.Assert;
import org.junit.Test;


public class TestAddition {

    @Test
    public void testSimple() {
        IFraction fraction = TestUtils.createFraction(3, 5);
        IFraction result = fraction.plus(new NotImplementedFraction(3, 5));

        Assert.assertEquals((Integer) 6, result.getNumerator());
        Assert.assertEquals((Integer) 5, result.getDenominator());
    }

    @Test
    public void testNormalisation() {
        IFraction fraction = TestUtils.createFraction(1, 2);
        IFraction result = fraction.plus(new NotImplementedFraction(1, 2));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }
}
