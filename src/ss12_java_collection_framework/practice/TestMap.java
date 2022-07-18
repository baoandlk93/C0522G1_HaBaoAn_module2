package ss12_java_collection_framework.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
//        Map<String,Integer> treeMap =new HashMap<>();
        Map<String,Integer> treeMap =new TreeMap<>();
        treeMap.put("Smith",30);
        treeMap.put("Anderson",31);
        treeMap.put("Lewis",29);
        treeMap.put("Cook",29);
        System.out.println("Hiển thị entry trong treeMap");
        System.out.println(treeMap + "\n");

    }
}
