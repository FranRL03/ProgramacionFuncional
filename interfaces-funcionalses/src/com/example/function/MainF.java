package com.example.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MainF {
    public static void main(String[] args) {

        //Le pasas un objeto y te devuelve su valor por ejemplo
        // le pasas un producto y te devuelve el precio

        /* En este ejemplo le pasaríamos un titulo y nos devolvería su longitud
        * smp un número */
        Function<String, Integer> extractLength = title -> title.length();

        // Le pasas un String y te devuelve la longitud
        Integer titleLength = extractLength.apply("Hola mundo");
        System.out.println(titleLength);


        BiFunction<Integer, Integer, Integer> divider = (num1, num2)  -> (num1 / num2);
        System.out.println(divider.apply(10, 10));
    }
}
