package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.BirthDayException;
import exceptions.EmailException;
import exceptions.FullNameException;
import exceptions.PhoneException;
import model.Certificate;
import model.Employee;
import model.Experience;
import model.Fresher;
import model.Intern;
import service.EmployeeService;
import utils.Validation;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employeeList = new ArrayList<>();
		EmployeeService employeeService = new EmployeeService(employeeList);
		Validation validation = new Validation();
		while (true) {
			mainMenu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				String fullName = null;

				try {
					System.out.println("FullName: ");
					fullName = sc.nextLine();
					validation.isValidName(fullName);
				} catch (FullNameException e) {
					e.printStackTrace();
				}
				String birthDateInput;
				System.out.println("BirthDay(dd-MM-yyyy): ");
				birthDateInput = sc.nextLine();
				try {
					validation.isValidBirthDate(birthDateInput);
				} catch (BirthDayException e) {
					e.printStackTrace();
				}
				LocalDate birthDate = null;
				birthDate = LocalDate.parse(birthDateInput, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

				String phone = null;
				System.out.println("Phone: ");
				phone = sc.nextLine();
				try {
					validation.isValidPhone(phone);
				} catch (PhoneException e) {
					e.printStackTrace();
				}

				String email = null;
				System.out.println("Email: ");
				email = sc.nextLine();
				try {
					validation.isValidEmail(email);
				} catch (EmailException e) {
					e.printStackTrace();
				}

				System.out.println("Number of Certificates: ");
				int numOfCert = sc.nextInt();
				List<Certificate> certList = new ArrayList<>();
				for (int i = 0; i < numOfCert; i++) {
					System.out.println("------------");
					System.out.println("ID: ");
					int certID = sc.nextInt();
					sc.nextLine();
					System.out.println("Name: ");
					String certName = sc.nextLine();
					System.out.println("Rank: ");
					String certRank = sc.nextLine();
					System.out.println("Date(dd-MM-yyyy): ");
					LocalDate certDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
					Certificate certificate = new Certificate(certID, certName, certRank, certDate);
					certList.add(certificate);
				}

				System.out.println("Employee type: ");
				int employeeType = sc.nextInt();
				sc.nextLine();

				switch (employeeType) {
				case 0: {
					// experience
					System.out.println("ExpInYear: ");
					int exp = sc.nextInt();
					sc.nextLine();
					System.out.println("Pro skill: ");
					String proSkill = sc.nextLine();
					Employee experience = new Experience(id, fullName, birthDate, phone, email, employeeType, certList,
							exp, proSkill);
					employeeService.insert(experience);
					break;
				}
				case 1: {
					// fresher
					System.out.println("Graduation Date(dd-MM-yyyy): ");
					LocalDate graduationDate = LocalDate.parse(sc.nextLine(),
							DateTimeFormatter.ofPattern("dd-MM-yyyy"));
					System.out.println("Graduantion rank: ");
					String graduationRank = sc.nextLine();
					System.out.println("Education: ");
					String education = sc.nextLine();
					Employee fresher = new Fresher(id, fullName, birthDate, phone, email, employeeType, certList,
							graduationDate, graduationRank, education);
					employeeService.insert(fresher);
					break;
				}
				case 2: {
					// intern
					System.out.println("Majors: ");
					String majors = sc.nextLine();
					System.out.println("Semester: ");
					int semester = sc.nextInt();
					System.out.println("University name: ");
					String universityName = sc.nextLine();
					Employee intern = new Intern(id, fullName, birthDate, phone, email, employeeType, certList, majors,
							semester, universityName);
					employeeService.insert(intern);
					break;
				}
				default:
					break;
				}
				break;
			}
			case 2: {
				System.out.println("id: ");
				int id = sc.nextInt();
				sc.nextLine();
				if (employeeService.findById(id) != null) {
					employeeService.deleteEmployee(id);
					String fullName = null;
					try {
						System.out.println("FullName: ");
						fullName = sc.nextLine();
						validation.isValidName(fullName);
					} catch (FullNameException e) {
						e.printStackTrace();
					}
					String birthDateInput;
					System.out.println("BirthDay(dd-MM-yyyy): ");
					birthDateInput = sc.nextLine();
					try {
						validation.isValidBirthDate(birthDateInput);
					} catch (BirthDayException e) {
						e.printStackTrace();
					}
					LocalDate birthDate = null;
					birthDate = LocalDate.parse(birthDateInput, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

					String phone = null;
					System.out.println("Phone: ");
					phone = sc.nextLine();
					try {
						validation.isValidPhone(phone);
					} catch (PhoneException e) {
						e.printStackTrace();
					}

					String email = null;
					System.out.println("Email: ");
					email = sc.nextLine();
					try {
						validation.isValidEmail(email);
					} catch (EmailException e) {
						e.printStackTrace();
					}

					System.out.println("Number of Certificates: ");
					int numOfCert = sc.nextInt();
					List<Certificate> certList = new ArrayList<>();
					for (int i = 0; i < numOfCert; i++) {
						System.out.println("------------");
						System.out.println("ID: ");
						int certID = sc.nextInt();
						sc.nextLine();
						System.out.println("Name: ");
						String certName = sc.nextLine();
						System.out.println("Rank: ");
						String certRank = sc.nextLine();
						System.out.println("Date(dd-MM-yyyy): ");
						LocalDate certDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
						Certificate certificate = new Certificate(certID, certName, certRank, certDate);
						certList.add(certificate);
					}

					System.out.println("Employee type: ");
					int employeeType = sc.nextInt();
					sc.nextLine();

					switch (employeeType) {
					case 0: {
						// experience
						System.out.println("ExpInYear: ");
						int exp = sc.nextInt();
						sc.nextLine();
						System.out.println("Pro skill: ");
						String proSkill = sc.nextLine();
						Employee experience = new Experience(id, fullName, birthDate, phone, email, employeeType,
								certList, exp, proSkill);
						employeeService.insert(experience);
						break;
					}
					case 1: {
						// fresher
						System.out.println("Graduation Date(dd-MM-yyyy): ");
						LocalDate graduationDate = LocalDate.parse(sc.nextLine(),
								DateTimeFormatter.ofPattern("dd-MM-yyyy"));
						System.out.println("Graduantion rank: ");
						String graduationRank = sc.nextLine();
						System.out.println("Education: ");
						String education = sc.nextLine();
						Employee fresher = new Fresher(id, fullName, birthDate, phone, email, employeeType, certList,
								graduationDate, graduationRank, education);
						employeeService.insert(fresher);
						break;
					}
					case 2: {
						// intern
						System.out.println("Majors: ");
						String majors = sc.nextLine();
						System.out.println("Semester: ");
						int semester = sc.nextInt();
						System.out.println("University name: ");
						String universityName = sc.nextLine();
						Employee intern = new Intern(id, fullName, birthDate, phone, email, employeeType, certList,
								majors, semester, universityName);
						employeeService.insert(intern);
						break;
					}
					default:
						break;
					}
				} else {
					System.out.println("Employee doesn't exist!");
				}

				break;
			}
			case 3: {
				System.out.println("id: ");
				choice = sc.nextInt();
				employeeService.deleteEmployee(choice);
				break;
			}
			case 4: {
				employeeService.showAllIntern();
				break;
			}
			case 5: {
				employeeService.showAllExperience();
				break;
			}
			case 6: {
				employeeService.showAllFresher();
				break;
			}
			default:
				System.out.println("Program exited");
				sc.close();
				return;
			}
		}
	}

	public static void mainMenu() {
		System.out.println("1. Add Employee\n" + "2. Edit Employee\n" + "3. Delete Employee\n" + "4. Show all Intern\n"
				+ "5. Show all Experience\n" + "6. Show all Fresher\n" + "7. Exit\n");
	}

}
