package basic.Day16;

interface Payment {
	void pay();
}

class UPI implements Payment {
	@Override
	public void pay() {
		System.out.println("Payment through UPI");
	}
}

class CreditCard implements Payment {
	@Override
	public void pay() {
		System.out.println("Payment through Credit Card");
	}
}

public class TransactionDetails {
	public static void main(String[] args) {
		Payment upi = new UPI();
		Payment creditcard = new CreditCard();
		
		upi.pay();
		creditcard.pay();
	}
}
