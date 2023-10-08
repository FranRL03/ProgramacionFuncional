package com.ejercicios.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static void main(String[] args) {

// Usando la lista anterior, eliminar de la lista aquellas palabras
// que tengan una longitud impar.
// "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"

        List<String> cadena = new ArrayList<>();

        cadena.add("alpha");
        cadena.add("bravo");
        cadena.add("charlie");
        cadena.add("delta");
        cadena.add("echo");
        cadena.add("foxtrot");

        cadena.stream()
                .filter(palabra -> palabra.length() % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
