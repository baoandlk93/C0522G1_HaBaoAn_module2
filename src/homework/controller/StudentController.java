package homework.controller;

import homework.service.IPersonService;
import homework.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {

    public static void menuStudent(){
        Scanner scanner = new Scanner(System.in);
        IPersonService iPersonService = new StudentService();
        do {
            System.out.println("1. Thêm mới sinh viên\n" +
                    "2. Xóa sinh viên\n" +
                    "3. Hiển thị danh sách sinh viên\n" +
                    "4. Quay về Menu chính");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
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
        }while (true);
    }

}
