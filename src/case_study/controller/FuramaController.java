package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static final Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        do {
            System.out.println("===Welcom to Furama Resort=== \n" +
                    "1.\tEmployee Management \n" +
                    "2.\tCustomer Management \n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management \n" +
                    "5.\tPromotion Management \n" +
                    "6.\tExit ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    EmployeeManagement.menuEmployee();
                    break;
                case 2:
                    CustomerManagement.displayCustomer();
                    break;
                case 3:
                    FacilityManagement.displayFacility();
                    break;
                case 4:
                    BookingManagerment.displayBooking();
                    break;
                case 5:
                    PromotionManagement.menuPromotion();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
