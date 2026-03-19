package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc22_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        boolean hay_negativo = false;
//Pide 10 números y detecta mediante una variable booleana si se ha introducido algún número negativo.
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduzca número: ");
            num = Integer.parseInt(br.readLine());

            if (num < 0) {
                hay_negativo = true;
            }
        }

        if (hay_negativo) {
            System.out.println("Se ha introducido algún número negativo");
        } else {
            System.out.println("No hay ningún número negativo");
        }
    }
}