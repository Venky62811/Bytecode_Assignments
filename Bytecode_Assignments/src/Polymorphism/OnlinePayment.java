package Polymorphism;
class Payment {
	double amount;
	void pay(double amount) {
		System.out.println("Paying" + amount +"using payment method ");
	}
}
class CreditCardPayment extends Payment{
	void pay(double amount) {
		System.out.println("Paying   " + amount +"  using CreditCard");
	}
}
class UPIPayments extends Payment{
	void pay(double amount) {
		System.out.println("Paying   " + amount +"   using UPI ");
	}
}
class WalletPayment extends Payment{
	void pay(double amount) {
		System.out.println("Paying   " + amount +"   using Wallet");
	}
}

public class OnlinePayment {

	public static void main(String[] args) {
		Payment payment;
		 
		payment = new CreditCardPayment();
		payment.pay(1000);
		
		payment = new UPIPayments();
		payment.pay(600);
		
		payment = new WalletPayment();
		payment.pay(100);
	}

}
