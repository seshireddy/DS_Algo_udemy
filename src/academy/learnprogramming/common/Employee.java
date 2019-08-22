package academy.learnprogramming.common;

public class Employee {

	private String firstName;
	private String lastName;
	private int id;
	public Employee(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getId() {
		return id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object arg0) {
		Employee e= (Employee)arg0;
		return this.firstName.equals(e.firstName)&&
				this.lastName.equals(e.lastName)&&
				this.id==e.id;
	}
	@Override
	public String toString() {
		return "Employee{"+
				"Firstname=' "+firstName+'\''+
				", Lastname=' "+lastName+'\''+
				", ID=' "+id+
				"}";
	}
	@Override
	public int hashCode() {
		int result = firstName.hashCode();
		result=31*result+lastName.hashCode();
		result=31*result+id;
		return result;
	}
	
}
