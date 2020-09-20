import org.junit.Assert;
import org.junit.Test;


public class TestDivision {

    @Test
    public void testSimple() {
        IFraction fraction = TestUtils.createFraction(4, 1);
        IFraction result = fraction.dividedBy(new NotImplementedFraction(3, 1));

        Assert.assertEquals((Integer) 4, result.getNumerator());
        Assert.assertEquals((Integer) 3, result.getDenominator());
    }

    @Test
    public void testNormalisation() {
        IFraction fraction = TestUtils.createFraction(4, 6);
        IFraction result = fraction.dividedBy(new NotImplementedFraction(7, 5));

        Assert.assertEquals((Integer) 10, result.getNumerator());
        Assert.assertEquals((Integer) 21, result.getDenominator());
    }
}
