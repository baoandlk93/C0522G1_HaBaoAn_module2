package homework2.service.impl;

import homework2.model.Vehical;
import homework2.service.IVehicalService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicalService implements IVehicalService {
    private static  Scanner scanner = new Scanner(System.in);
    private static List<Vehical>vehicalList = new ArrayList<>();
    @Override
    public void add() {

    }

    @Override
    public void display() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void search() {

    }

    public static Vehical infoVehical(){
        System.out.println("Nhập biển kiểm soát");
        int licensePlate = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất");

    }
}
