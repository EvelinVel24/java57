package main.java.com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("15562563", "HeathSchowalter", Arrays.asList(6, 7, 2), 0f));
        alumnos.add(new Alumno("13635430", "RozellaBartoletti", Arrays.asList(3, 2, 6, 6, 6, 4, 3, 3, 4), 0f));
        alumnos.add(new Alumno("17554475", "JedRunolfsdottir", Arrays.asList(2, 5, 3, 6, 2, 1, 7, 2, 2), 0f));
        // Añade el resto de los alumnos aquí

        ICalculadora calculadora = new Calculadora(alumnos);
        Profesor profesor = new Profesor(calculadora);

        profesor.mostrarAlumnosConPromedios();
    }
}
