package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.person.Employee;
import case_study.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static List<Employee> employeeList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    static {

    }

    private static Employee infoEmployee() {
        System.out.println("Enter employee code");
        String employeeCode = scanner.nextLine();

        System.out.println("Enter employee name ");
        String name = scanner.nextLine();

        System.out.println("Enter employee's date of birth");
        String dayOfBirth = scanner.nextLine();

        System.out.println("Enter the employee's gender");
        String gender = scanner.nextLine();

        System.out.println("Enter employee identification number");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                System.out.println("ID : " + id);
                for (Employee employee : employeeList) {
                    if (employee.getId() == id) {
                        throw new DuplicateIDException("ID already exists, please re-enter");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Are you sure you entered it correctly, please re-enter it");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.println("Enter employee phone number");
        int phoneNumber;
        while (true) {
            try {
                phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Phone Number" + phoneNumber);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Are you sure you entered it correctly, please re-enter it");
            }
        }

        System.out.println("Enter employee email");
        String email = scanner.nextLine();

        System.out.println("Enter the employee's qualifications");
        String level = scanner.nextLine();

        System.out.println("Enter the position of employee");
        String position = scanner.nextLine();

        System.out.println("Enter employee's salary");
        int salary;
        while (true) {
            try {
                salary = Integer.parseInt(scanner.nextLine());
                System.out.println("Salary" + salary);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Are you sure you entered it correctly, please re-enter it");
            }
        }

        return new Employee(employeeCode, name, dayOfBirth, gender, id, phoneNumber, email, level, position, salary);

    }

    @Override
    public void add() {
        Employee employee = infoEmployee();
        employeeList.add(employee);
        System.out.println("Successfully added new");
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

    }

    @Override
    public void edit() {
        System.out.println("Enter the information you want to modify");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println();
        }

    }
}
