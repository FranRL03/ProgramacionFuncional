package com.ejemplo.JavaStreams.terminales;

import com.ejemplo.JavaStreams.intermedias.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToList {

    public static void main(String[] args) {

        List<Product > products = new ArrayList<>();

        products.add(new Product("Product1", 9.99));
        products.add(new Product("Product2", 19.99));
        products.add(new Product("Product3", 29.99));
        products.add(new Product("Product4", 39.99));
        products.add(new Product("Product5", 49.99));

        List<Double> prices = products.stream()
                .map(Product::getPrice)
                //Extraes los precios
                .filter(price -> price > 10.0)
                //Filtras los precios de los productos
                .collect(Collectors.toList());

        System.out.println(prices);

        List<Double> prices2 = products.stream()
                .map(Product::getPrice)
                //Extraes los precios
                .filter(price -> price > 10.0)
                //Filtras los precios de los productos
                .toList();
                //Los metes en una lista

        System.out.println(prices2);
    }
}
