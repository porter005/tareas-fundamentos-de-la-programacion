package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc5_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un número:");
        int num = Integer.parseInt(br.readLine());
        if (num >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}
