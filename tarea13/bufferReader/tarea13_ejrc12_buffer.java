package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc12_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        while (num > 0) {
            System.out.print((num % 10) + " ");
            num = num / 10;
        }
    }
}