package Abstraction;

abstract class Payment{
	abstract String initiatePayment();
	abstract String  verifyPayment();
 public void  generateTransactionId() {
	 System.out.println("Return trasaction id ");
 }
 }
}

 class CreditCardPayment extends Payment{
	public String initiatePayment(){return "initiatePayment";}
	public String  verifyPayment() {return "CreditCardPayment verify";}
	 
 }
class UPIPayment extends Payment {
	public String initiatePayment(){return " UPI initiatePayment";}
	public String  verifyPayment() {return "verify UPIPayment";}
}
class NetBankingPayment extends Payment {
	public String initiatePayment(){return "initiatePayment";}
	public String  verifyPayment() {return "verify NetBankingPayment";}
	
}

public class Paymentmethod {

	public static void main(String[] args) {
	    Payment card = new CreditCardPayment();
		 System.out.println(card.initiatePayment());
	     System.out.println(card.verifyPayment());
	     card.generateTransactionId();

	    Payment upi = new UPIPayment();
	     System.out.println(upi.initiatePayment());
	     System.out.println(upi.verifyPayment());
	     upi.generateTransactionId();
	     
	     Payment pay = new NetBankingPayment();
	     System.out.println(pay.initiatePayment());
	     System.out.println(pay.verifyPayment());
	     pay.generateTransactionId();
	     
	     
	}

}
