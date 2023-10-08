package com.example.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main2 {
    public static void main(String[] args) {

        BiConsumer <Integer, Integer> andTwo = (x, y) -> System.out.println(x + " " + y);

        andTwo.accept(5, 10);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "name 1");
        map.put(2, "name 2");
        map.put(3, "name 3");

        map.forEach((key, value) -> {
            System.out.println("key: " + key);
            System.out.println("value: " + value);
        });
    }
}
