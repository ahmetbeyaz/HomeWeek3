package homeweek3kodlamaio.entities;

public class Instractor extends User {
	private String department;

	public Instractor(String department) {
		this.department = department;
	}

	public Instractor() {

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
