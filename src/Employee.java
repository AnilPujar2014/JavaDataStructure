
public class Employee {
	public String lastName;
	public String firstName;

	public Employee(String last, String first) {
		this.lastName = last;
		this.firstName = first;
	}

	public String fullName() {
		return firstName + " " + lastName;
	}

}
