package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc16_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
//Pide un número entre 0 y 10 y muestra su tabla de multiplicar.
        System.out.print("Introduce un número (0 a 10): ");
        num = Integer.parseInt(br.readLine());

        System.out.println("\nTabla del " + num);
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
