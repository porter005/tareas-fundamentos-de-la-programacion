package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc18_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        if (a == 0) System.out.println("Invalida");
        else {
            if (m == 2 && (d >= 1 && d <= 28)) System.out.println("OK");
            else if ((m == 4 || m == 6 || m == 9 || m == 11) && (d >= 1 && d <= 30)) System.out.println("OK");
            else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d >= 1 && d <= 31)) System.out.println("OK");
            else System.out.println("Invalida");
        }
    }
}