package case_study.utils;

import case_study.model.person.Customer;
import case_study.model.person.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ReadCustomerUtils {
    private static List<String> readFile(String path) {
        List<String> strings = new LinkedList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return strings;
    }
    public static List<Customer> readCustomerList(String path) {
        List<String> strings = readFile(path);
        List<Customer> customerList = new LinkedList<>();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
            customerList.add(new Customer(info[0], info[1], info[2], info[3], Long.parseLong(info[4]),Integer.parseInt(info[5]),info[6],info[7],info[8]));
        }
        return customerList;
    }
}
