
public abstract class Entity {


	private String name;
	private int type;
	private String email;

	public String printableString;
	
	int ORGANIZATION = 2;
	int PERSON = 1;
	
	
	//getter & setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	//getter & setter for type
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	
	//getter & setter for email
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	

	//getter for printableString
	public String getPrintableString() {
		return printableString;
	}

}
