package fundamentos_de_la_programacion;

import java.io.*;

public class tarea8_ejrc17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Longitud: "); int len = Integer.parseInt(br.readLine());
        System.out.print("Mayus (true/false): "); boolean m = Boolean.parseBoolean(br.readLine());
        System.out.print("Num (true/false): "); boolean n = Boolean.parseBoolean(br.readLine());
        System.out.print("Especial (true/false): "); boolean e = Boolean.parseBoolean(br.readLine());

        if (len < 8) {
            System.out.println("Insegura");
        } else {
            int contador = (m ? 1 : 0) + (n ? 1 : 0) + (e ? 1 : 0);
            if (contador == 3) System.out.println("Muy Fuerte");
            else if (contador == 2) System.out.println("Fuerte");
            else System.out.println("Débil");
        }
    }
}