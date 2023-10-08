package com.example.predicate;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        //El pridicate devuelve un boolean y simpre se usa cuando queremos poner filtros
        Predicate<String> validateName = name -> name.length() > 5 && name.length() < 15;

        System.out.println(validateName.test("fran")); // false
        System.out.println(validateName.test("fernando")); //true
        System.out.println(validateName.test("openwebinarsholaquetal")); // false

        List<String> names = List.of("fran", "jose julio", "jesus");


        /*
        Este método recorre una lista de nombres haciendo el test para
        comprobar que nombres cumplen con las condiciones y si el nombre los cumple
        lo imprime
         */
        for (String name : names){
            if(validateName.test(name))
                System.out.println(name);
        }

        //Es lo mismo pero de una forma mas rápida y funcional

        names.stream()
                .filter( name -> name.length() > 5)
                .forEach(name -> System.out.println(name));
    }
}
