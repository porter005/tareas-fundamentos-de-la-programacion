package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc3_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el radio:");
        double r = Double.parseDouble(br.readLine());
        double L = 2 * Math.PI * r;
        System.out.println("La longitud es: " + L);
    }
}