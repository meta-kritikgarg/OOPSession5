

public class Organization extends Entity {

	public Organization(String name, String email) {
		setName(name);
		setEmail(email);
		setPrintableString("Organization: "+name);
	}
	
	
}
