package homework1.service.impl;

import homework1.model.Student;
import homework1.service.IPersonService;
import homework1.service.IStudenService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class StudentService implements IStudenService {
   private static  Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1,"Bùi Nam","1990","Nam","C0522g1",9));
        studentList.add(new Student(2,"Trần Hoàng","1991","Nam","C0522g1",8));
        studentList.add(new Student(3,"Lý Thị Hoa","1992","Nữ","C0522g1",7));
        studentList.add(new Student(4,"Trần Văn Nam","1993","Nam","C0522g1",6));
        studentList.add(new Student(5,"Hoàng Xuân Nam","1994","Nữ","C0522g1",5));
        studentList.add(new Student(6,"Vũ Tiến Nam","1995","Nam","C0522g1",4));
        studentList.add(new Student(7,"ĐỖ Hoàng","1996","Nam","C0522g1",3));
    }


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


    @Override
    public void searchPersonById(){
        System.out.println("Nhập vào mã sinh viên cần tìm" );
        int idSearch = Integer.parseInt(scanner.nextLine());
        for (Student str:studentList){
            if (idSearch==str.getId()){
                System.out.println(str);
            }
        }
    }

    @Override
    public void searchPersonByName() {
        System.out.println("Nhập vào tên sinh viên cần tìm");
        String nameSearch = scanner.nextLine();
        boolean isFlag = false;
        for (Student str : studentList){
            if (str.getName().toLowerCase().contains(nameSearch.toLowerCase())){
                System.out.println(str);
                isFlag = true;
            }
        }
        if (!isFlag){
            System.out.println("Không tìm thấy");
        }
    }


}
