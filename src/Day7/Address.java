package Day7;

public class Address {

	String street = null;
	String distric = null;
	String province = null;
	String zipcode = null;

	Address(String street, String distric, String province, String zipcode) {
		this.street = street;
		this.distric = distric;
		this.province = province;
		this.zipcode = zipcode;

	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistric() {
		return distric;
	}

	public void setDistric(String distric) {
		this.distric = distric;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getAllDetail(){
		return street+" "+distric+" "+province+" "+zipcode;
		
	}

}
