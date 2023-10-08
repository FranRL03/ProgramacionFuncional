package com.ejemplo.JavaStreams.terminales;

import java.util.ArrayList;
import java.util.List;

public class Match {

    public static void main(String[] args) {

        List<String> texts = new ArrayList<>();

        texts.add("ddd2");
        texts.add("aaa2");
        texts.add("bbb1");
        texts.add("aaa1");
        texts.add("bbb3");
        texts.add("ccc");
        texts.add("bbb2");

        boolean result = texts.stream()
                .anyMatch(text -> text.startsWith("z"));
        //Que alguno empieze por la letra "z"

        System.out.println(result);

        System.out.println("------------------");

        boolean result2 = texts.stream()
                .allMatch(text -> text.startsWith("a"));
        System.out.println(result2);
        //Si todos empiezan por la letra "a"

        System.out.println("------------------");

        boolean result3 = texts.stream()
                .noneMatch(text -> text.startsWith("z"));
        System.out.println(result3);
        //Si ninguno empieza por la "z"

    }
}
