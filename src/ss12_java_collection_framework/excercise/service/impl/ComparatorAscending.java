package ss12_java_collection_framework.excercise.service.impl;

import ss12_java_collection_framework.excercise.model.Product;

import java.util.Comparator;

public class ComparatorAscending implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
