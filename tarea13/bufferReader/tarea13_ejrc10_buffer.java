package fundamentos_de_la_programacion;

import java.io.*;

public class tarea13_ejrc10_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if (a>b && b>c) System.out.println(a + "," + b + "," + c);
        if (a>c && c>b) System.out.println(a + "," + c + "," + b);
        if (b>a && a>c) System.out.println(b + "," + a + "," + c);
        if (b>c && c>a) System.out.println(b + "," + c + "," + a);
        if (c>a && a>b) System.out.println(c + "," + a + "," + b);
        if (c>b && b>a) System.out.println(c + "," + b + "," + a);
    }
}