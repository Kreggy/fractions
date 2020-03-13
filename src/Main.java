import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the numerator of the first fraction");
        int numeratorFractionOne = sc.nextInt();
        System.out.println("Type the denominator of the first fraction");
        int denominatorFractionOne = sc.nextInt();
        System.out.println("Type the numerator of the second fraction");
        int numeratorFractionTwo = sc.nextInt();
        System.out.println("Type the denominator of the second fraction");
        int denominatorFractionTwo = sc.nextInt();
        sc.close();

        Fraction fractionOne = new Fraction (numeratorFractionOne, denominatorFractionOne);
        Fraction fractionTwo = new Fraction (numeratorFractionTwo, denominatorFractionTwo);

        IFraction add = fractionOne.plus(fractionTwo);
        IFraction subtract = fractionOne.minus(fractionTwo);
        IFraction multiply = fractionOne.times(fractionTwo);
        IFraction divide = fractionOne.dividedBy(fractionTwo);

        System.out.println("Added: " + add.getNumerator() + "/" + add.getDenominator() + "\n");
        System.out.println("Subtracted: " + subtract.getNumerator() + "/" + subtract.getDenominator() + "\n");
        System.out.println("Multiplied: " + multiply.getNumerator() + "/" + multiply.getDenominator() + "\n");
        System.out.println("Divided: " + divide.getNumerator() + "/" + divide.getDenominator() + "\n");
    }
}
