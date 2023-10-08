package com.ejemplo.JavaStreams.intermedias;

import java.util.ArrayList;
import java.util.List;

public class Distinct {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);

        System.out.println("Los números son: " + numbers);
        System.out.println();
        long num = numbers.stream().distinct().count();
        System.out.println("Hay:" + num + " números distintos");

    }
}
