import javax.swing.JOptionPane;

public class Person {
	
	private String firstName;
	private String lastName;	
	 String city;
	 String state;
	
	public Person(String firstName, String lastName, String city, String state,) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
	}

	          public String getFirstName() {
		return firstName;
	}

          	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

            	public String getLastName() {
		return lastName;
	}

              	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


              	public String getCity() {
		return city;
	}

	              public void setCity(String city) {
		this.city = city;
	}

	              public String getState() {
		return state;
	}

              	public void setState(String state) {
		this.state = state;
	}

	            public String toString() {
	return this.firstName+" "+this.lastName+" " "+this.city+" "+this.state+" "
			+this.phone+" "+this.zipCode;
	
	}
	
	
	public void display() {
		JOptionPane.showMessageDialog(null, "Name:" + firstName+"  "+city+" "+state+");
		
	}
	
