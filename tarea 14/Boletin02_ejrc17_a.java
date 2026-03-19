package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc17_a {
    public static void main(String[] args) {
//Muestra las tablas de multiplicar del 1 al 10 utilizando bucles anidados.
    	for (int i = 1; i <= 10; i++) {
            System.out.println("\nTABLA DEL " + i);
            System.out.println("---------------");
            
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
