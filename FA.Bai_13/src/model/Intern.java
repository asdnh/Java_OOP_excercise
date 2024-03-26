package model;

import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee {
	private String majors;
	private int semester;
	private String universityName;

	public Intern(int id, String fullName, LocalDate birthDate, String phone, String email, int employeeType,
			List<Certificate> certificates, String majors, int semester, String universityName) {
		super(id, fullName, birthDate, phone, email, 2, certificates);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}

	@Override
	public void showInfo() {
		System.out.println("Intern [majors=" + majors + ", semester=" + semester + ", universityName=" + universityName
				+ ", getId()=" + getId() + ", getFullName()=" + getFullName() + ", getBirthDate()=" + getBirthDate()
				+ ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getEmployeeType()="
				+ getEmployeeType() + ", getCertificates()=" + getCertificates() + "]");
	}

}
