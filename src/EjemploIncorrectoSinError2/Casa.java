package Ejemplos.EjemploIncorrectoSinError2;

// Clase incorrecta que implementa una interfaz innecesaria
public class Casa implements Movible {
    @Override
    public void moverse() {
        // La lógica aquí no tiene sentido para una Casa
        System.out.println("Las casas no se mueven.");
    }
}