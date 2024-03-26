package model;

import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee {
	private int expInYear;
	private String proSkill;

	public Experience(int id, String fullName, LocalDate birthDate, String phone, String email, int employeeType,
			List<Certificate> certificates, int expInYear, String proSkill) {
		super(id, fullName, birthDate, phone, email, 0, certificates);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	@Override
	public void showInfo() {
		System.out.println("Experience [expInYear=" + expInYear + ", proSkill=" + proSkill + ", getId()=" + getId()
				+ ", getFullName()=" + getFullName() + ", getBirthDate()=" + getBirthDate() + ", getPhone()="
				+ getPhone() + ", getEmail()=" + getEmail() + ", getEmployeeType()=" + getEmployeeType()
				+ ", getCertificates()=" + getCertificates() + "]");
	}

}
