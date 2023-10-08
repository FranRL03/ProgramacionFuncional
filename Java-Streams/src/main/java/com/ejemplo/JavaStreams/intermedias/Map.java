package com.ejemplo.JavaStreams.intermedias;

import java.util.ArrayList;
import java.util.List;

public class Map {

    public static void main(String[] args) {

        List<String> texts = new ArrayList<>();

        texts.add("ddd2");
        texts.add("aaa2");
        texts.add("bbb1");
        texts.add("aaa1");
        texts.add("bbb3");
        texts.add("ccc");
        texts.add("bbb2");

//        texts.stream()
//                .map(text -> text.length())
//               .forEach(System.out::println);

        //Es lo mismo

        texts.stream()
                .map(String::length)
                .forEach(System.out::println);

        List<Product> products = new ArrayList<>();

        products.add(new Product("Product1", 9.99));
        products.add(new Product("Product2", 19.99));
        products.add(new Product("Product3", 29.99));
        products.add(new Product("Product4", 39.99));
        products.add(new Product("Product5", 49.99));

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        products.stream()
                .map(Product::getPrice)
                //Extraes los precios
                .filter(price -> price > 10.0)
                //Filtras los precios de los productos
                .forEach(System.out::println);


    }
}
