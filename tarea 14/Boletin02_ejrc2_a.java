package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc2_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
//Determina si un número es positivo o negativo hasta que se introduce un cero.
        System.out.print("Introduzca un número: ");
        num = Integer.parseInt(br.readLine());

        while (num != 0) {
            if (num > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
            
            System.out.print("Introduzca otro número: ");
            num = Integer.parseInt(br.readLine());
        }
    }
}