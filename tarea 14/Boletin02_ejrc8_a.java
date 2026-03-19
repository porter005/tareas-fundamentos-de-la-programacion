package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc8_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, i;
// Muestra todos los números naturales desde el 1 hasta un número $N$ introducido por el usuario.
        System.out.print("Introduce un número: ");
        num = Integer.parseInt(br.readLine());

        i = 1;
        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
}