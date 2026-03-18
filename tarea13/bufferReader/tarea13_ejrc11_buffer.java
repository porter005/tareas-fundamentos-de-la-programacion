package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc11_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num < 10) System.out.println("1 cifra");
        else if (num < 100) System.out.println("2 cifras");
        else if (num < 1000) System.out.println("3 cifras");
        else if (num < 10000) System.out.println("4 cifras");
        else System.out.println("5 cifras");
    }
}