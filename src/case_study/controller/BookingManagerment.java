package case_study.controller;

import java.util.Scanner;

public class BookingManagerment {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayBooking() {
        do {
            System.out.println("Welcom to Booking Management \n" +
                    "1.\tAdd new booking \n" +
                    "2.\tDisplay list booking \n" +
                    "3.\tCreate new constracts \n" +
                    "4.\tDisplay list contracts \n" +
                    "5.\tEdit contracts \n" +
                    "6.\tReturn main menu ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return;
            }
        } while (true);
    }
}
