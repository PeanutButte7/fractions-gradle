import org.junit.Assert
import org.junit.Test

class TestDivision {
    @Test
    fun testSimple() {
        val fraction = TestUtils.createFraction(4, 1)
        val result = fraction.dividedBy(NotImplementedFraction(3, 1))

        Assert.assertEquals(4, result.numerator)
        Assert.assertEquals(3, result.denominator)
    }

    @Test
    fun testNormalisation() {
        val fraction = TestUtils.createFraction(4, 6)
        val result = fraction.dividedBy(NotImplementedFraction(7, 5))

        Assert.assertEquals(10, result.numerator)
        Assert.assertEquals(21, result.denominator)
    }
}
