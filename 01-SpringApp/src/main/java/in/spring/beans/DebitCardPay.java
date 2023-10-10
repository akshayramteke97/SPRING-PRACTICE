package in.spring.beans;

public class DebitCardPay implements IPay {
	public DebitCardPay() {
		System.out.println("DebitCardPay object is created");
	}
	public boolean payBill(double Bill) {
		System.out.println("paying Bill by Debit card amoun is : "+Bill);
		return false;
	}

}
