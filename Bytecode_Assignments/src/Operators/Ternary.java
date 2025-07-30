package Operators;

public class Ternary {

	public static void main(String[] args) {
		int a=26,b=98,c=122;
		int result=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("Highest value is: "+result);
		
	}

}
