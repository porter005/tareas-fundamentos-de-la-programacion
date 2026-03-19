package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc12_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Solicita un número al usuario y calcula su factorial
        double factorial = 1; // Usamos double para factoriales grandes
        int num;

        System.out.print("Introduce un número: ");
        num = Integer.parseInt(br.readLine());

        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}