package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc6_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce n1 y n2:");
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        if (n1 % n2 == 0) {
            System.out.println("Son múltiplos");
        } else {
            System.out.println("No son múltiplos");
        }
    }
}