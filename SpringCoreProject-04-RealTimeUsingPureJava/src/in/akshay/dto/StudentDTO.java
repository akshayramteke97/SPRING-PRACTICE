package in.akshay.dto;

public class StudentDTO {
	private int sno;
	private String name;
	private String saddress;
	private String dob;
	
	
	
	public int getSno() {
		return sno;
	}



	public void setSno(int sno) {
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
