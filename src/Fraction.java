public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
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
        int denominatorR = denominator * other.getDenominator();
        int numeratorR = (other.getDenominator() * numerator) + (denominator * getNumerator());

        Fraction ret = new Fraction(numeratorR, denominatorR);
        return minimizeFraction(ret);
    }

    @Override
    public IFraction minus(IFraction other) {
        int denominatorR = denominator * other.getDenominator();
        int numeratorR = (other.getDenominator() * numerator) - (denominator * getNumerator());

        Fraction ret = new Fraction(numeratorR, denominatorR);
        return minimizeFraction(ret);
    }

    @Override
    public IFraction times(IFraction other) {
        int denominatorR = denominator * other.getDenominator();
        int numeratorR = (other.getDenominator() * numerator) * (denominator * getNumerator());
        Fraction ret = new Fraction(numeratorR, denominatorR);
        return minimizeFraction(ret);
    }

    @Override
    public IFraction dividedBy(IFraction other) {
        Fraction ret = new Fraction(other.getNumerator(), other.getNumerator());
        return times(ret);
    }
    @Override
    public IFraction minimizeFraction (IFraction other) {
        int numeratorS = other.getNumerator();
        int denominatorS = other.getDenominator();
        int max = 0;
        for(int i = 1; (i < numeratorS) || (i < denominatorS); i++) {
            if(((numeratorS % i) == 0) && ((denominatorS % i) == 0)) { //vic zavorek na jednom miste jsem nikdy nevidel
                max = i;
            }
        }
        numeratorS = numeratorS/max;
        denominatorS = denominatorS/max;

        return new Fraction(numeratorS, denominatorS);
    }
}
