package streams;

public class Custumer {
	
	private String name ;
	private String city ;
	private int bill;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Custumer(String name, String city, int bill, String gender) {
		super();
		this.name = name;
		this.city = city;
		this.bill = bill;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Custumer [name=" + name + ", city=" + city + ", bill=" + bill + ", gender=" + gender + "]";
	}
}
