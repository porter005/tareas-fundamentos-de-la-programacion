package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc5_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, num;
//Juego para adivinar un número aleatorio entre 1 y 100 indicando si es mayor o menor.
        n = (int) (Math.random() * 100) + 1;

        System.out.print("Introduce número: ");
        num = Integer.parseInt(br.readLine());

        while (num != n) {
            if (num > n) {
                System.out.println("Menor");
            } else {
                System.out.println("Mayor");
            }
            System.out.print("Introduce número: ");
            num = Integer.parseInt(br.readLine());
        }
        System.out.println("Acertaste...");
    }
}