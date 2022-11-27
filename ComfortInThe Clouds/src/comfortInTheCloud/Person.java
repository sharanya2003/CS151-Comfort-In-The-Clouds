package comfortInTheCloud;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 69972453067262362L;
	
	private String name;
	private String password;
	public Person(String name,String password) {
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
