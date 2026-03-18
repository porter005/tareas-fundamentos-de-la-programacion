package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc9_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        if (n1 > n2) {
            System.out.println(n1 + " , " + n2);
        } else {
            System.out.println(n2 + " , " + n1);
        }
    }
}