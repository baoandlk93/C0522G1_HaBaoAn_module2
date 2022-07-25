package case_study.controller;

import java.util.Scanner;

public class PromotionManagement {
    public static Scanner scanner = new Scanner(System.in);

    public static void menuPromotion() {
        do {
            System.out.println("Welcom to Promotion Management \n" +
                    "1.\tDisplay list customers use service \n" +
                    "2.\tDisplay list customers get voucher \n" +
                    "3.\tReturn main menu");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                case 2:
                case 3:
                    return;
            }
        } while (true);
    }
}
