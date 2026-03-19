package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc10_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, suma_total = 0;
//Solicita 15 números al usuario y muestra la suma total de todos ellos.
        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduzca número: ");
            num = Integer.parseInt(br.readLine());
            suma_total = suma_total + num;
        }

        System.out.println("La suma total es de: " + suma_total);
    }
}
