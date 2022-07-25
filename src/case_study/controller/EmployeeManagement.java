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
                    do {
                        System.out.println("Enter the information you want to modify" +
                                "1.Change name \n" +
                                "2. Change employee's date of birth \n" +
                                "3. Change the position of employee \n" +
                                "4. Change employee's salary \n" +
                                "5. Change the position of employee \n" +
                                "6. Change employee phone number \n" +
                                "7. Change employee email \n" +
                                "8. Change the employee's gender \n" +
                                "9. Enter employee identification number \n" +
                                "10. Return");
                        int choose1 = Integer.parseInt(scanner.nextLine());
                        switch (choose){
                            case 1:
                                System.out.println("Enter employee name");

                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 10:
                                return;
                        }
                    }while (true);
//                    employeeService.edit();
//                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
