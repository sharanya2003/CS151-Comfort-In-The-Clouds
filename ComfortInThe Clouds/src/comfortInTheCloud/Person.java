package comfortInTheCloud;

public class Person{
	private String fname;
	private String lname;
	private String email;
	private String pwd;
	public Person(String fname, String lname,String email, String pwd) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pwd = pwd;
	}
	
	public String getName() {
		return this.fname + " " + this.lname;
	}
	
	
}
