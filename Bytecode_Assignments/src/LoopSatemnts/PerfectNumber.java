package LoopSatemnts;

public class PerfectNumber {

	public static void main(String[] args) {
		int num=6,sum=0;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
			if(sum==num) {
				System.out.println("Perfect number");
			}
				else {
					System.out.println("Not Perfect");
			}
	}
}
