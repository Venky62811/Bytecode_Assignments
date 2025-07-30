package LoopSatemnts;
import java.util.Scanner;

public class DowhileusingSwitchcase {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int choice = 0;
	do {
		System.out.println("1.chocolates");
		System.out.println("2.Biscuits");
		System.out.println("3.Cooldrinks");
		System.out.println("4.Exit");
		System.out.println("Enter the choice");
		choice=s.nextInt();
		switch(choice) {
		case 1-> System.out.println("Chocolates");
		case 2-> System.out.println("Biscuits");
		case 3-> System.out.println("Cooldrinks");
		case 4-> System.out.println("Exit");
		default -> System.out.println("Enter correct choice");
		}
	}while(choice !=4);
	}

}
