
public class Person extends Entity {
	
	int age;
	
	public Person(String name, int inAge, String email) {
		setName(name);
		setType(PERSON);
		setAge(inAge);
		setEmail(email);
		setPrintableString("Person: "+name);
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
}
