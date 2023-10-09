package in.springcore.main;

import in.springcore.card.AmexCard;
import in.springcore.card.DebitCard;
import in.springcore.card.PayingPayment;

public class Main {
	public static void main(String[] args) {
		PayingPayment pp = new PayingPayment();
		pp.setMethod(new AmexCard());
		boolean status = pp.doPayment("CreditCard", 100);
		if(status==true)
			System.out.println("payment successfull");
		else
			System.out.println("payment is not successfull you are fraud");
	}
	
}
