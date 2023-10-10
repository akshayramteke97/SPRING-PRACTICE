package in.spring.beans;

public class PaymentProcess {
	private IPay pay=null;
	public PaymentProcess() {
		System.out.println("payment process object is created");
	}
	public void setPay(IPay pay) {
		this.pay=pay;
	}
	public void doPayment(double amount) {
		boolean flag=pay.payBill(amount);
		if(flag) {
			System.out.println("payment is sucessfull");
		}
		else {
			System.out.println("payment is not sucessfull");
		}
	}

}
