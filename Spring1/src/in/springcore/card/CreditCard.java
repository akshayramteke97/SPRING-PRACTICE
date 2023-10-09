package in.springcore.card;

public class CreditCard implements ICard {
	public boolean payingBill(double Bill) {
		System.out.println("paying the Bill by CreditCard & amount is : "+Bill);
		return true;
	}
}
