package homework.controller;

import homework.service.IPersonService;
import homework.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {


    public static void menuTeacher() {
        Scanner scanner = new Scanner(System.in);
        IPersonService iPersonService = new TeacherService();
        do {
            System.out.println("1. Thêm mới Giảng viên\n" +
                    "2. Xóa Giảng viên\n" +
                    "3. Hiển thị danh sách Giảng viên\n" +
                    "4. Quay về Menu chính");
            System.out.println("Mời bạn lựa chọn");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iPersonService.add();
                    break;
                case 2:
                    iPersonService.remove();
                    break;
                case 3:
                    iPersonService.display();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
