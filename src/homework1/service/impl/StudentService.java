package homework1.service.impl;

import homework1.model.Student;
import homework1.service.IPersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IPersonService {
   private static  Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    public static Student infoStudent() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập name: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Nhập vào giới tính");
        String gender = scanner.nextLine();
        System.out.print("Nhập điểm: ");
        double score = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên Lớp: ");
        String className = scanner.nextLine();
        Student student = new Student(id, name, dayOfBirth,gender,className,score);
        return student;
    }

    @Override
    public void add() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập ID cần xóa");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for(Student student: studentList) {
            if(student.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if(chooseYesNo ==1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;

            }
        }
        if(!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }


    @Override
    public void display() {
        for (Student student:studentList){
            System.out.println(student);
        }
    }


}
