package fundamentos_de_la_programacion;

import java.util.Scanner;

public class PracticaCondicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un número para verificar si es par:");
        int num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es PAR.");
        } else {
            System.out.println("El número " + num + " es IMPAR.");
        }
    }
}