package in.akshay.vo;

public class Student {
	private String sno;
	private String name;
	private String saddress;
	private String dob;
	
	
	
	public String getSno() {
		return sno;
	}



	public void setSno(String sno) {
		this.sno = sno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSaddress() {
		return saddress;
	}



	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", saddress=" + saddress + ", dob=" + dob + "]";
	}
	
	
}
