
public class Human implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//	Human human = new Human(this.ssn, this.name, this.age, this.gender, this.address);
//	human.address = new Address(this.address.getCountry(),this.address.getCity(),this.address.getDistrict(),this.address.getPostcode());
		Human human = (Human) super.clone();
		human.address = (Address) human.address.clone();
		
		
		return human;
		
	}
	private int ssn;
	private String name;
	private int age;
	private String gender;
	private Address address;
		
	
	
	public Human(int ssn, String name, int age, String gender, Address address) {
		super();
		
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
