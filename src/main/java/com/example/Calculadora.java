package main.java.com.example;

import java.util.List;

public class Calculadora implements ICalculadora {
    private List<Alumno> alumnos;

    public Calculadora(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public List<Alumno> calcularPromedios() {
        for (Alumno alumno : alumnos) {
            float promedio = (float) alumno.getNotas().stream().mapToInt(Integer::intValue).average().orElse(0);
            alumno.setPromedio(promedio);
        }
        return alumnos;
    }
}
