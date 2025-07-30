package Tasks;

public class NestedeTernaryOperator {

	public static void main(String[] args) {
		boolean isLoggedin = true;
		String 	userType =  "viewer";
		String subscriptionStatus ="active";
		String message = !isLoggedin ? "Please log in to continue"
                : userType.equals("admin") ? "Welcome, Admin"
                : userType.equals("creator") && subscriptionStatus.equals("active") ? "Creator Dashboard"
                : userType.equals("creator") && subscriptionStatus.equals("expired") ? "Renew to access your dashboard"
                : userType.equals("viewer") && subscriptionStatus.equals("active") ? "Continue Watching"
                : userType.equals("viewer") && subscriptionStatus.equals("expired") ? "Subscription expired"
                : "Access Denied";
		System.out.println("Homepage is : "+message);
	}
}
