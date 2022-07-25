package case_study.controller;

import java.util.Scanner;

public class FacilityManagement {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayFacility() {
        do {
            System.out.println("Welcom to Facility Management \n" +
                    "1.\tDisplay list Facility \n" +
                    "2.\tAdd new Facility \n" +
                    "3.\tEdit Facility \n" +
                    "4.\tReturn main menu ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return;
            }
        } while (true);
    }
}
