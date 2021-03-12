package assignment;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Author{
	private String name;
	private String email;
	private char gender;

	public Author (String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
