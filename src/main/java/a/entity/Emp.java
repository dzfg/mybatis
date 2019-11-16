package a.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Emp implements Serializable {

	private String id;
	private String name;
	private String gender;
	private Double salary;
	// 所属部门
	private Dept dept;

	public Emp() {
	}

	public Emp(String id, String name, String gender, Double salary, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.dept = dept;
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

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}

}
