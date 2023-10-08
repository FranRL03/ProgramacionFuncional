package com.ejercicios.Ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {

//        Crea una cadena de caracteres que esté compuesta de la primera letra de
//        cada una de las siguiente cadenas de caracteres:
//        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"

        String [] cadena = {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot"};

        String result = Arrays.stream(cadena)
                .map(letra -> letra.substring(0, 1))
                .collect(Collectors.joining());

        System.out.println(result);

    }
}
