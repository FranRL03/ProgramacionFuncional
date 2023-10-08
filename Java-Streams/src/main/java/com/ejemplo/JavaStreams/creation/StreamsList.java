package com.ejemplo.JavaStreams.creation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsList {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Fran");
        nombres.add("Jose Julio");
        nombres.add("Jesús");

        Stream<String> nom = nombres.stream().filter(name -> name.length() > 5);
        nom.forEach(System.out::println);

        System.out.println("--------------------------------------------------");

        Stream<String> nomWithLetter =  nombres.stream().filter(name -> name.toLowerCase().contains("j"));
        nomWithLetter.forEach(System.out::println);
    }
}
