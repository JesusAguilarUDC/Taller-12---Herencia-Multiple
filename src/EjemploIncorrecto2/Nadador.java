package Ejemplos.EjemploIncorrecto2;

// Interfaz Nadador
public interface Nadador {
    default void despegar() {
        System.out.println("Nadador despega.");
    }
}