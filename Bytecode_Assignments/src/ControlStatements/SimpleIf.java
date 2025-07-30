package ControlStatements;

public class SimpleIf {

	public static void main(String[] args) {
		int withdrawl_amt=6000, bal_amount=7000;
		if(bal_amount>=withdrawl_amt) {
			bal_amount-=withdrawl_amt;
			System.out.println("Balance amount is: "+bal_amount);
		}

	}

}
