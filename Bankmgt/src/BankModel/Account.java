package BankModel;

public class Account {
	private int accNo;
	private String name;
	private String mobNO;
	private String adharNo;
	private String gender;
	private int age;
	private double balence;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNO() {
		return mobNO;
	}
	public void setMobNO(String mobNO) {
		this.mobNO = mobNO;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo2) {
		this.adharNo = adharNo2;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalence() {
		return balence;
	}
	public void setBalence(double balence) {
		this.balence = balence;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", mobNO=" + mobNO + ", adharNo=" + adharNo + ", gender="
				+ gender + ", age=" + age + ", balence=" + balence + "]";
	}
	
	
	

}
