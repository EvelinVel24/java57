package main.java.com.example;

public class Profesor {
    private ICalculadora calculadora;

    public Profesor(ICalculadora calculadora) {
        this.calculadora = calculadora;
    }

    public void mostrarAlumnosConPromedios() {
        calculadora.calcularPromedios().forEach(alumno -> 
            System.out.println("Rut: " + alumno.getRut() + 
                               ", Nombre: " + alumno.getNombre() + 
                               ", Promedio: " + alumno.getPromedio())
        );
    }
}
