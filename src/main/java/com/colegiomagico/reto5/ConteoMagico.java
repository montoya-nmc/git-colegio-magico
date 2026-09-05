package com.colegiomagico.reto5;

/**
 * Suma todos los números desde 1 hasta limite usando un ciclo while.
 */
public class ConteoMagico {

    public static int contar(int limite) {
        int i= 0;
        int valor = 0;
        while (i < limite) {
             i++;
             valor+=i;
            
        }
        return valor; // TODO: Cambia esto
    }

    public static void main(String[] args) {
        System.out.println("Conteo hasta 4: " + contar(4));
    }
}
