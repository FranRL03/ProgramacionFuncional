package com.example.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main1 {
    public static void main(String[] args) {

        /*
        El consumer siempre se usa cuando queremos consumir un dato, es decir,
        caundo queremos consumir un dato, guardarlo en una BBDD, imprimirlo, etc...
         */


        // Clase anónima
        Consumer<String> printer = new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };

        printer.accept("Hola Mundo");

        //Este código como es muy denso hay otra manera de hacerlo más rápido y limpio que
        //es usando las lambas

        //Lambdas
        Consumer<String> printer1 = message -> System.out.println(message);
        Consumer<String> printer2 = message -> System.out.println(message);
        printer2.accept("Hola mundo desde Lambda");

        //El andThen lo que hace es concatenar
        Consumer<String> printer12 = printer1.andThen(printer2);
        printer12.accept("Adios");

        List<String> names = new ArrayList<>();
        names.add("name 1");
        names.add("name 2");
        names.add("name 3");

        //Resumen de un bucle for
        names.forEach(name -> System.out.println(name));
    }
}
