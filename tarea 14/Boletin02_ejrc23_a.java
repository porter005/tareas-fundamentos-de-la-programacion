package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc23_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nota;
        boolean hay_suspensos = false;
//Pide 5 notas de alumnos y detecta si hay algún suspenso (nota < 5) utilizando una variable booleana.
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduzca nota (0-10): ");
            nota = Integer.parseInt(br.readLine());

            if (nota < 5) {
                hay_suspensos = true;
            }
        }

        if (hay_suspensos) {
            System.out.println("Hay alumnos suspensos");
        } else {
            System.out.println("No hay ningún suspenso");
        }
    }
}
