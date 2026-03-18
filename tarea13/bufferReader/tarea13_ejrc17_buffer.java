package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc17_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        if ((d >= 1 && d <= 30) && (m >= 1 && m <= 12)) System.out.println("Correcta");
        else System.out.println("Incorrecta");
    }
}