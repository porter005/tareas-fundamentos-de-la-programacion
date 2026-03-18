package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Número de 4 cifras: ");
        int n = Integer.parseInt(br.readLine());

        int d1 = n / 1000;
        int d2 = (n / 100) % 10;
        int d3 = (n / 10) % 10;
        int d4 = n % 10;

        if (d1 == d4 && d2 == d3) System.out.println("Es Capicúa");
        else System.out.println("No lo es");
    }
}