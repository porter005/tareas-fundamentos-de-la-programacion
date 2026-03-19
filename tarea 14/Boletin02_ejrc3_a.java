package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc3_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
//Determina si los números introducidos son pares o impares hasta que se ingresa un 0.
        System.out.print("Introduzca un número: ");
        num = Integer.parseInt(br.readLine());

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
            
            System.out.print("Introduzca otro número: ");
            num = Integer.parseInt(br.readLine());
        }
    }
}