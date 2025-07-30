package Polymorphism;

public class MathOperators {

    public static void main(String[] args) {
        MathOperators mathOps = new MathOperators();

        int result1 = mathOps.multiply(2, 3);
        int result2 = mathOps.multiply(2, 3, 4);
        double result3 = mathOps.multiply(2.5, 4.0);

        System.out.println("2 * 3 = " + result1);
        System.out.println("2 * 3 * 4 = " + result2);
        System.out.println("2.5 * 4.0 = " + result3);
    }

	private int multiply(int i, int j, int k) {
		
		return 0;
	}

	private int multiply(double d, double e) {
		
		return 0;
	}
}

