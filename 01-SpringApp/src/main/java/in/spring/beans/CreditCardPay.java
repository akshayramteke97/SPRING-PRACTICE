package in.spring.beans;

public class CreditCardPay implements IPay {
	public CreditCardPay() {
		System.out.println("CreditCardPay object is created");
	}
	public boolean payBill(double Bill) {
		System.out.println("paying Bill by CreditCard amount is : "+Bill);
		return false;
	}
}
