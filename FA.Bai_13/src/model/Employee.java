package model;

import java.time.LocalDate;
import java.util.List;

public abstract class Employee {
	private int id;
	private String fullName;
	private LocalDate birthDate;
	private String phone;
	private String email;
	private int employeeType;
	private static int employeeCount = 0;
	private List<Certificate> certificates;

	public Employee(int id, String fullName, LocalDate birthDate, String phone, String email, int employeeType,
			List<Certificate> certificates) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.employeeType = employeeType;
		this.certificates = certificates;
		employeeCount++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}

	public static int getEmployeeCount() {
		return employeeCount;
	}

	public static void setEmployeeCount(int employeeCount) {
		Employee.employeeCount = employeeCount;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public abstract void showInfo();

}
