package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Examen 1: "); int e1 = Integer.parseInt(br.readLine());
        System.out.print("Examen 2: "); int e2 = Integer.parseInt(br.readLine());
        System.out.print("Examen 3: "); int e3 = Integer.parseInt(br.readLine());

        double promedio = (e1 + e2 + e3) / 3.0;

        if (promedio > 90) {
            if (e1 == 100 || e2 == 100 || e3 == 100) System.out.println("Oro con Honores");
            else System.out.println("Oro");
        } else if (promedio >= 80) {
            System.out.println("Plata");
        } else {
            System.out.println("Sin medalla");
        }
    }
}