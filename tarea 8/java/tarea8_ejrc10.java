package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("f1 c1: ");
        int f1 = Integer.parseInt(br.readLine()); int c1 = Integer.parseInt(br.readLine());
        System.out.print("f2 c2: ");
        int f2 = Integer.parseInt(br.readLine()); int c2 = Integer.parseInt(br.readLine());

        if ((f1 == f2 || c1 == c2) && !(f1 == f2 && c1 == c2)) {
            System.out.println("Válido");
        } else {
            System.out.println("Inválido");
        }
    }
}
