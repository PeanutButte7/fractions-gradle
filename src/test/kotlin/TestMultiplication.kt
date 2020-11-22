import org.junit.Assert
import org.junit.Test

class TestMultiplication {
    @Test
    fun testSimple() {
        val fraction = TestUtils.createFraction(2, 3)
        val result = fraction.times(NotImplementedFraction(5, 7))

        Assert.assertEquals(10, result.numerator)
        Assert.assertEquals(21, result.denominator)
    }

    @Test
    fun testNormalisation() {
        val fraction = TestUtils.createFraction(2, 8)
        val result = fraction.times(NotImplementedFraction(4, 2))

        Assert.assertEquals(1, result.numerator)
        Assert.assertEquals(2, result.denominator)
    }
}
