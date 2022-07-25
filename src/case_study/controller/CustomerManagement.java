package case_study.controller;

import java.util.Scanner;

public class CustomerManagement {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayCustomer() {
        do {
            System.out.println("Welcom to Customer Management \n" +
                    "1.\tDisplay list customers \n" +
                    "2.\tAdd new customer \n" +
                    "3.\tEdit customer \n" +
                    "4.\tReturn main menu ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                case 2:
                case 3:
                    do {
                        System.out.println("Enter the information you want to modify" +
                                "1.Change name \n" +
                                "2. Change  ");
                        int choose1 = Integer.parseInt(scanner.nextLine());
                        switch (choose){
                            case 1:
                        }
                    }while (true);
                case 4:
                    return;
            }
        } while (true);
    }
}
