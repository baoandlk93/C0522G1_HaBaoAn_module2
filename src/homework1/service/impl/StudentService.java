package homework1.service.impl;

import homework1.model.Student;

import homework1.service.IStudenService;

import java.util.*;

public class StudentService implements IStudenService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "Bùi Nam", "1990", "Nam", "C0522g1", 9));
        studentList.add(new Student(2, "Trần Hoàng", "1991", "Nam", "C0522g1", 8));
        studentList.add(new Student(3, "Lý Thị Hoa", "1992", "Nữ", "C0522g1", 7));
        studentList.add(new Student(4, "Trần Văn Nam", "1993", "Nam", "C0522g1", 6));
        studentList.add(new Student(5, "Hoàng Xuân Nam", "1994", "Nữ", "C0522g1", 5));
        studentList.add(new Student(6, "Vũ Tiến Nam", "1995", "Nam", "C0522g1", 4));
        studentList.add(new Student(7, "ĐỖ Hoàng", "1996", "Nam", "C0522g1", 3));
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
        return new Student(id, name, dayOfBirth, gender, className, score);
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
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;

            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }


    @Override
    public void display() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void sortByName() {
        boolean isSwap = true;
        for (int i = 0; i < studentList.size() && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    isSwap = true;
                }
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) == 0) {
                    if (studentList.get(j).getId() > studentList.get(j + 1).getId()) {
                        Collections.swap(studentList, j, j + 1);
                        isSwap = true;
                    }
                }
            }
        }
    }

    @Override
    public void searchPersonById() {
        System.out.println("Nhập vào mã sinh viên cần tìm");
        int idSearch = Integer.parseInt(scanner.nextLine());
        for (Student str : studentList) {
            if (idSearch == str.getId()) {
                System.out.println(str);
            }
        }
    }

    @Override
    public void searchPersonByName() {
        System.out.println("Nhập vào tên sinh viên cần tìm");
        String nameSearch = scanner.nextLine();
        boolean flag = false;
        for (Student str : studentList) {
            if (str.getName().toLowerCase().contains(nameSearch.toLowerCase())) {
                System.out.println(str);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy");
        }
    }


}
