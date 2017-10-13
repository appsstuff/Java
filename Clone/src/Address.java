
public class Address implements Cloneable {
	
	private String country;
	private String city;
	private String district;
	private int  postcode;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	public Address(String country, String city, String district, int postcode) {
		super();
		this.country = country;
		this.city = city;
		this.district = district;
		this.postcode = postcode;
	}
	
	
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", district=" + district + ", postcode=" + postcode
				+ "]";
	}


	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}


}
