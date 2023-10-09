package in.springcore.card;

public class DebitCard implements ICard{
	public boolean payingBill(double Bill) {
		System.out.println("paying the Bill by DebitCard & amount is : "+Bill);
		return true;
	}
}
