package in.springcore.card;

public class PayingPayment {
	private ICard payment=null;
	
//	public PayingPayment(ICard payment) {
//		this.payment=payment;
//	}
	public void setMethod(ICard payment) {
		this.payment=payment;
	}
	public boolean doPayment(String cardType,int billAmount) {
//		if("CreditCard".equals(cardType)) {
//			CreditCard cc = new CreditCard();
//			return cc.payingBill(billAmount);
//		}
//		else if("DebitCard".equals(cardType)) {
//			DebitCard dc = new DebitCard();
//			return dc.payingBill(billAmount);
//		}
//		else if("AmexCard".equals(cardType)) {
//			AmexCard ac = new AmexCard();
//			return ac.payingBill(billAmount);
//		}
//		else {
//			return false;
//		}
		return payment.payingBill(billAmount);
	}
}
