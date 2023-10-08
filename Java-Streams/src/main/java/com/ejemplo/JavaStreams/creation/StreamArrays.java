package com.ejemplo.JavaStreams.creation;

import java.util.Arrays;

public class StreamArrays {

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5};

        long numElements =  Arrays.stream(numbers).count();
        System.out.println(numElements);
        long total =  Arrays.stream(numbers).sum();
        System.out.println(total);
    }
}
