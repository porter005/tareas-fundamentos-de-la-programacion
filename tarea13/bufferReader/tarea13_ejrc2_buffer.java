package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc2_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el radio de un círculo:");
        double r = Double.parseDouble(br.readLine());
        double area = Math.PI * Math.pow(r, 2);
        System.out.println("El área es: " + area);
    }
}