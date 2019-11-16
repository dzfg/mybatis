package b.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Emp implements Serializable {

	private String id;
	private String name;
	private String gender;
	private Double salary;

	public Emp() {
	}

	public Emp(String id, String name, String gender, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

}
