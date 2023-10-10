package com.ejercicios.Ejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));

        System.out.println("Obtener la cantidad de cursos con una duración mayor a 5 horas.");

        cursos.stream()
                .map(Curso::getDuracion)
                .filter(tiempo -> tiempo > 5f)
                .forEach(System.out::println);

        System.out.println("Obtener la cantidad de cursos con una duración menor a 2 horas.");

        cursos.stream()
                .map(Curso::getDuracion)
                .filter(tiempo -> tiempo < 2f)
                .forEach(System.out::println);

        System.out.println("Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.");

        List<Integer> cantidadVideos = cursos.stream()
                .map(Curso::getVideos)
                .filter(cantidad -> cantidad > 50)
                .toList();

        System.out.println(cantidadVideos);

        System.out.println("Mostrar en consola el título de los 3 cursos con mayor duración.");

        cursos.stream()
                .sorted(Comparator.comparingDouble(Curso::getDuracion).reversed())
                .limit(3)
                .map(Curso::getTitulo)
                .forEach(System.out::println);

        


    }
}
