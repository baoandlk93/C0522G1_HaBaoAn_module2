package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.person.Employee;
import case_study.service.IEmployeeService;
import case_study.utils.ReadUtils;
import case_study.utils.WriterUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static List<Employee> employeeList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static final String PATH = "src/case_study/file/furama.csv";

    private static void readFile() {
        List<Employee> list = ReadUtils.readEmployeeList(PATH);
        employeeList.clear();
        employeeList.addAll(list);
    }

    private static void writeFile() {
        WriterUtils.writeEmployeeFile(PATH, employeeList);
    }

    private String getLiteracy() {
        System.out.println("Please select the employee's qualification \n" +
                "1. Intermediate \n" +
                "2. College \n" +
                "3. University \n" +
                "4. After University");
        int choose;
        do {
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        return "Intermediate";
                    case 2:
                        return "College";
                    case 3:
                        return "University";
                    case 4:
                        return "After University";
                }
            } catch (NumberFormatException | IllegalStateException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

        } while (true);
    }

    private String getPosition() {
        System.out.println("Select employee position \n" +
                "1. Receptionist \n" +
                "2. Waitress \n" +
                "3. Specialist \n" +
                "4. Supervisor \n" +
                "5. Manager \n" +
                "6. CEO ");
        int choose1;
        do {
            try {
                choose1 = Integer.parseInt(scanner.nextLine());
                switch (choose1) {
                    case 1:
                        return "Receptionist";
                    case 2:
                        return "Waitress";
                    case 3:
                        return "Specialist";
                    case 4:
                        return "Supervisor";
                    case 5:
                        return "Manager";
                    case 6:
                        return "CEO";
                }
            } catch (NumberFormatException | IllegalStateException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } while (true);

    }

    private Employee infoEmployee() {
        System.out.println("Enter employee code");
        String employeeCode = scanner.nextLine();

        System.out.println("Enter employee name ");
        String name = scanner.nextLine();

        System.out.println("Enter employee's date of birth");
        String dayOfBirth = scanner.nextLine();

        System.out.println("Enter the employee's gender");
        String gender = getGender();

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
                for (Employee employee : employeeList) {
                    if (employee.getPhoneNumber() == id) {
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

        System.out.println("Enter employee email");
        String email = scanner.nextLine();

        String literacy = getLiteracy();

        String position = getPosition();

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

        return new Employee(employeeCode, name, dayOfBirth, gender, id, phoneNumber, email, literacy, position, salary);

    }

    private boolean yesOrNo() {
        System.out.println("Are you sure you want to edit or not?\n" +
                "1. Yes.\n" +
                "2. No.");
        int chooseYesNo = Integer.parseInt(scanner.nextLine());
        return chooseYesNo == 1;
    }

    private String getGender() {
        System.out.println("Enter your choice");
        do {
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        return "Nam";
                    case 2:
                        return "Nữ";
                    case 3:
                        return "LGBT";
                }
            } catch (NumberFormatException | IllegalStateException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

        } while (true);

    }

    @Override
    public void add() {
        readFile();
        Employee employee = infoEmployee();
        employeeList.add(employee);
        writeFile();
        System.out.println("Successfully added new");
    }

    @Override
    public void display() {
        readFile();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

    }

    @Override
    public void edit() {

    }
//        readFile();
//        do {
//
//            System.out.println("Enter the information you want to modify \n" +
//                    "1. Change name \n" +
//                    "2. Change employee's date of birth \n" +
//                    "3. Change the position of employee \n" +
//                    "4. Change employee's salary \n" +
//                    "5. Change the the employee's qualification \n" +
//                    "6. Change employee phone number \n" +
//                    "7. Change employee email \n" +
//                    "8. Change the employee's gender \n" +
//                    "9. Enter employee identification number \n"
//            );
//
//            int choose = Integer.parseInt(scanner.nextLine());
//            switch (choose) {
//                case 1:
//                    System.out.println("Enter employee name");
//                    String newName = scanner.nextLine();
//                    return new Employee(employeeList.get(0).getEmployeeCode(),newName);
//                case 2:
//                    System.out.println("Enter employee's date of birth");
//                    String newDateOfBirth = scanner.nextLine();
//                    return new Employee(employeeList.get(0).getEmployeeCode(),employeeList.get(0).getName(),newDateOfBirth);
//                case 3:
//                    System.out.println("Enter the position of employee");
//                    String newPosition = getPosition();
//                    return new Employee(employeeList.get(0).getEmployeeCode(),employeeList.get(0).getName(),employeeList.get(0).getDateOfBirth(),employeeList.get(0).getGender(),employeeList.get(0).getId(),employeeList.get(0).getPhoneNumber(),employeeList.get(0).getEmail(),employeeList.get(0).getLiteracy(),newPosition,employeeList.get(0).getSalary());
////                case 4:
////                    System.out.println("Enter employee's salary");
////
////                    return new Employee(employeeList.get(0).getEmployeeCode(),);
////                case 5:
////                    System.out.println("Enter the employee's qualification");
////
////                    return new Employee(employeeList.get(0).getEmployeeCode(),);
////                case 6:
////                    System.out.println("Enter employee phone number");
////                    return new Employee(employeeList.get(0).getEmployeeCode(),);
////                case 7:
////                    System.out.println("Enter employee email");
////                    return new Employee(employeeList.get(0).getEmployeeCode(),);
////                case 8:
////                    System.out.println("Enter the employee's gender");
////                    return new Employee(employeeList.get(0).getEmployeeCode(),);
////                case 9:
////                    System.out.println("Enter employee identification number");
////                    return new Employee(employeeList.get(0).getEmployeeCode(),);
////                default:
////                    break;
////            }
////
////        } while (true);
//    }

}
