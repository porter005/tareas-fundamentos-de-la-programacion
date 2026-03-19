package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc1_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, cuadrado;
      //Calcula el cuadrado de números ingresados hasta que se introduce uno negativo.
        System.out.print("Introduzca número: ");
        num = Integer.parseInt(br.readLine());

        while (num >= 0) {
            cuadrado = num * num;
            System.out.println(num + "² es igual a " + cuadrado);
            
            System.out.print("Introduzca otro número: ");
            num = Integer.parseInt(br.readLine());
        }
    }
}