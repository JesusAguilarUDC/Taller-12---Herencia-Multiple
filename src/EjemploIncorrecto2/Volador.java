package Ejemplos.EjemploIncorrecto2;

// Interfaz Volador
public interface Volador {
    default void despegar() {
        System.out.println("Volador despega.");
    }
}