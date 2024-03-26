package model;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee {
	private LocalDate graduationDate;
	private String graduationRank;
	private String education;

	public Fresher(int id, String fullName, LocalDate birthDate, String phone, String email, int employeeType,
			List<Certificate> certificates, LocalDate graduationDate, String graduationRank, String education) {
		super(id, fullName, birthDate, phone, email, 1, certificates);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	@Override
	public void showInfo() {
		System.out.println("Fresher [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank
				+ ", education=" + education + ", getId()=" + getId() + ", getFullName()=" + getFullName()
				+ ", getBirthDate()=" + getBirthDate() + ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail()
				+ ", getEmployeeType()=" + getEmployeeType() + ", getCertificates()=" + getCertificates() + "]");
	}

}
