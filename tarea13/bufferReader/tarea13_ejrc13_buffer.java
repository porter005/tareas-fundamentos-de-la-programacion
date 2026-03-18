package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc13_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int original = num;
        int reves = 0;
        while (num > 0) {
            reves = (reves * 10) + (num % 10);
            num = num / 10;
        }
        if (original == reves) System.out.println("Es capicúa");
        else System.out.println("No lo es");
    }
}