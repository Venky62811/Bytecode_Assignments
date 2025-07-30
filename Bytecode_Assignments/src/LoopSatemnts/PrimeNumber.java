package LoopSatemnts;

public class PrimeNumber {

	public static void main(String[] args) {
	int num=5,count=0;
	for(int i=2;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
	}
		if(count==1) {
			System.out.println("Prime number");
		}
			else {
				
				System.out.println("Not Prime");
		}
	}

}


