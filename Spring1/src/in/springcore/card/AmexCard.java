package in.springcore.card;

public class AmexCard implements ICard {
	public boolean payingBill(double Bill) {
		System.out.println("paying the Bill by AmexCard & amount is : "+Bill);
		return true;
		
	}
}
