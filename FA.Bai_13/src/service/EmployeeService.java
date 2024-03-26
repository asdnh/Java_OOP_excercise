package service;

import java.util.List;

import model.Employee;
import model.Experience;
import model.Fresher;
import model.Intern;

public class EmployeeService {
	List<Employee> listEmployee;

	public EmployeeService(List<Employee> listEmployee) {
		super();
		this.listEmployee = listEmployee;
	}

	public void insert(Employee employee) {
		employee.showInfo();
		listEmployee.add(employee);
	}

	public Employee findById(int id) {
		return listEmployee.stream().filter((e) -> {
			return e.getId() == id;
		}).findFirst().orElse(null);
	}

	public void deleteEmployee(int id) {
		Employee employee = findById(id);
		listEmployee.remove(employee);
	}

	public void showAllIntern() {
		listEmployee.stream().filter((o) -> o instanceof Intern).forEach((o) -> o.showInfo());
	}

	public void showAllExperience() {
		listEmployee.stream().filter((o) -> o instanceof Experience).forEach((o) -> o.showInfo());
	}

	public void showAllFresher() {
		listEmployee.stream().filter((o) -> o instanceof Fresher).forEach((o) -> o.showInfo());
	}
}
