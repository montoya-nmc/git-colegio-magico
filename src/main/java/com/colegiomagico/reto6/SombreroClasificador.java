package com.colegiomagico.reto6;

/**
 * Usa Switch. Gryffindor -> Valentia, Ravenclaw -> Inteligencia, otro -> Desconocido.
 */
public class SombreroClasificador {

    public static String clasificar(String casa) {
        String resultado = "";
         switch (casa) {
            case "Gryffindor":
                resultado = "Valentia";
                break;

            case "Ravenclaw":
                resultado = "Inteligencia";
                break;

            case "Muggle":
                resultado = "Desconocido";
                break;
        }

        return resultado; // TODO: Cambia esto
    }

    public static void main(String[] args) {
        System.out.println("Gryffindor: " + clasificar("Gryffindor"));
    }
}
