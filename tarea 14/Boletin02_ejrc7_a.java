package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc7_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, suma = 0, elementos = 0;
        float media;
//Pide números hasta introducir uno negativo y calcula la media aritmética de los números positivos.
        System.out.print("Introduzca un número: ");
        num = Integer.parseInt(br.readLine());

        while (num >= 0) {
            suma += num;
            elementos++;
            System.out.print("Introduzca otro número: ");
            num = Integer.parseInt(br.readLine());
        }

        if (elementos == 0) {
            System.out.println("Imposible hacer la media");
        } else {
            media = (float) suma / elementos;
            System.out.println("La media es de: " + media);
        }
    }
}
