package LoopSatemnts;

public class CountEvenorOdd {

	public static void main(String[] args) {
		int n=123456789,digit=0,evencount=0,oddcount=0;
		do {
			digit=n%10;
			if(digit%2==0)
				evencount++;
			else
				oddcount++;	
			n/=10;
		}while(n>0);
			System.out.println("Even count: "+evencount);
		System.out.println("Odd count: "+oddcount);

	}

}
