package ControlStatements;

public class SwitchCase_EvenorOdd {

	public static void main(String[] args) {
		int value =1;
		switch(value%2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
			System.out.println("Please give the proper input");
		}
	}

}
