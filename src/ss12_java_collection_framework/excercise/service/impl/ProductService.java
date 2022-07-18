package ss12_java_collection_framework.excercise.service.impl;

import ss12_java_collection_framework.excercise.model.Product;
import ss12_java_collection_framework.excercise.service.IProductService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class ProductService implements IProductService {
    ArrayList<Product> productArrayList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Product product = inforProduct();
        productArrayList.add(product);
        System.out.println("Thêm mới sản phẩm thành công");
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập mã sản phẩm cần xóa");
        String idRemove = scanner.nextLine();
        boolean isFlag = false;
        for (Product products : productArrayList) {
            if (Objects.equals(idRemove, products.getProductCode())) {
                System.out.println("Bạn có chắc muốn xóa sản phẩm này \n" +
                        " 1. Có \n" +
                        " 2. Không \n");
                int yesNo = Integer.parseInt(scanner.nextLine());
                if (yesNo == 1) {
                    productArrayList.remove(products);
                    System.out.println("Đã xóa sản phẩm");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy mã sản phẩm bạn nhập");
        }
    }

    @Override
    public void recover() {
        System.out.println("Mời bạn nhập mã sản phẩm cần sửa");
        String idRecover = scanner.nextLine();
        boolean isFlag = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (idRecover.equals(productArrayList.get(i).getProductCode())) {
                System.out.println("Bạn có chắc muốn sửa thông tin sản phẩm này \n" +
                        " 1. Có \n" +
                        " 2. Không ");
                int yesNo = Integer.parseInt(scanner.nextLine());
                if (yesNo == 1) {
                    productArrayList.set(i, inforProduct());
                    System.out.println("Đã cập nhật sản phẩm");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy mã sản phẩm bạn nhập");
        }

    }

    @Override
    public void search() {
        System.out.println("Mời bạn nhập tên sản phẩm muốn tìm");
        String searchName = scanner.nextLine();
        for (Product product : productArrayList) {
            if (searchName.equals(product.getProductName())) {
                System.out.println(product);
            }
        }

    }

    @Override
    public void display() {
        for (Product product : productArrayList) {
            System.out.println(product);
        }

    }

    @Override
    public void sort() {
        System.out.println("Bạn muốn xếp theo thứ tự \n" +
                "1. Tăng dần \n" +
                "2. Giảm dần");
        int choose = Integer.parseInt(scanner.nextLine());
        if (choose ==1){
            ComparatorAscending comparatorAscending = new ComparatorAscending();
            productArrayList.sort(comparatorAscending);
        }else {
            ComparatorDecrease comparatorDecrease = new ComparatorDecrease();
            productArrayList.sort(comparatorDecrease);
        }
    }

    public static Product inforProduct() {
        System.out.println("Nhập vào mã sản phẩm");
        String id = scanner.nextLine();
        System.out.println("Nhập vào tên sản phẩm ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào thông tin sản phẩm");
        String infor = scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        return new Product(id, name, infor, price);
    }
}
