package streams;

public class Employee1 {
	private int id ;
	private String name ;
	private int salary ;
	private String gender;
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee1(int id, String name, int salary, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}
	

}
