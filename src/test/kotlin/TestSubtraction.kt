import org.junit.Assert
import org.junit.Test

class TestSubtraction {
    @Test
    fun testSimple() {
        val fraction = TestUtils.createFraction(9, 5)
        val result = fraction.minus(NotImplementedFraction(3, 5))

        Assert.assertEquals(6, result.numerator)
        Assert.assertEquals(5, result.denominator)
    }

    @Test
    fun testNormalisation() {
        val fraction = TestUtils.createFraction(3, 2)
        val result = fraction.minus(NotImplementedFraction(1, 2))

        Assert.assertEquals(1, result.numerator)
        Assert.assertEquals(1, result.denominator)
    }
}
