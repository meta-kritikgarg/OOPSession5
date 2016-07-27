
public abstract class Entity {


	private String name;
	private int type;
	private String email;

	private String printableString;
	
	int ORGANIZATION = 2;
	int PERSON = 1;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPrintableString(String printableString) {
		this.printableString = printableString;
	}

}
