package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc20_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nota, aprobados = 0, condicionados = 0, suspensos = 0;
//Pide 5 notas de alumnos y cuenta cuántos han aprobado (nota $\ge 5$), cuántos tienen un condicionado (nota $= 4$) y cuántos han suspendido (nota $< 4$).
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduzca nota (0-10): ");
            nota = Integer.parseInt(br.readLine());

            if (nota >= 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Condicionados (4): " + condicionados);
        System.out.println("Suspensos: " + suspensos);
    }
}
