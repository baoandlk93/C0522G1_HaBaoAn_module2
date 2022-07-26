package case_study.controller;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    public static Scanner scanner = new Scanner(System.in);

    public static void menuEmployee() {
        EmployeeService employeeService = new EmployeeService();
        do {
            System.out.println("Welcom to Employee Management \n" +
                    "1\tDisplay list employees \n" +
                    "2\tAdd new employee \n" +
                    "3\tEdit employee \n" +
                    "4\tReturn main menu");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                  employeeService.display();
                  break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
//                    employeeService.edit();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
