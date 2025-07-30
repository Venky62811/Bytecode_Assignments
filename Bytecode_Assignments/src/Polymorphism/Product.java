package Polymorphism;

 class product {
	 String name;
	double price;
	void  applyDiscount()
	{
		System.out.println("No discount for general process");
	}
	void  display()
	{
		System.out.println("Product " + name + " price after discount : " + price);
	}
 }
class Electronics extends product
{
	void applyDiscount() {
		price= price - price * 0.9;
	}
}
class Clothing extends product{	
	void applyDiscount() {
		price =  price-price * 0.8;
	}
}
class Books extends product {
	void applyDiscount() {
		price =  price-price * 0.95;
	}
}
public class Product{
	
	public static void main(String[] args) {
		  product[] products = new product[3];

	       
	        products[0] = new Electronics();
	        products[1] = new Clothing();
	        products[2] = new Books();

	        
	        products[0].name ="mobile";
	        products[0].price = 30000;
	        
	        products[1].name ="Shirt";
	        products[1].price = 1000;
	        
	        products[2].name ="General Knowledge ";
	        products[2].price = 30000;
            
	        for(int i=0;i<products.length;i++) {
	        	products[i].applyDiscount(); 
	        	products[i].display();
	        }
	}     
}
