package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc4_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un número:");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println("Introduce otro número:");
        int n2 = Integer.parseInt(br.readLine());
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}