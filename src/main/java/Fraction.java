public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    @Override
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {
        int lcm = getLCM(denominator, other.getDenominator());
        int n1 = lcm / denominator * numerator;
        int n2 = lcm / other.getDenominator() * other.getNumerator();

        return createNormalised(n1 + n2, lcm);
    }

    @Override
    public IFraction minus(IFraction other) {
        int lcm = getLCM(denominator, other.getDenominator());
        int n1 = lcm / denominator * numerator;
        int n2 = lcm / other.getDenominator() * other.getNumerator();

        return createNormalised(n1 - n2, lcm);
    }

    @Override
    public IFraction times(IFraction other) {
        return createNormalised(numerator * other.getNumerator(), denominator * other.getDenominator());
    }

    @Override
    public IFraction dividedBy(IFraction other) {
        return createNormalised(numerator * other.getDenominator(), denominator * other.getNumerator());
    }

    private static Fraction createNormalised(Integer numerator, Integer denominator) {
        int lcd = getLCD(numerator, denominator);

        while(lcd > 1){
            numerator /= lcd;
            denominator /= lcd;
            lcd = getLCD(numerator, denominator);
        }

        return new Fraction(numerator, denominator);
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }

    private int getLCM(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        int absNumber1 = Math.abs(n1);
        int absNumber2 = Math.abs(n2);
        int absHigherNumber = Math.max(absNumber1, absNumber2);
        int absLowerNumber = Math.min(absNumber1, absNumber2);
        int lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }
        return lcm;
    }

    private static int getLCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getLCD(n2, n1 % n2);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 2);
        Fraction f3 = new Fraction(6, 22);

        System.out.println(f1.plus(f2).getNumerator() + "/" + f1.plus(f2).getDenominator());
        System.out.println(f3.createNormalised(f3.getNumerator(), f3.getDenominator()));
    }
}
