package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc6_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, suma = 0;
//Suma todos los números introducidos por teclado hasta que se ingresa un 0.
        do {
            System.out.print("Introduzca un número: ");
            num = Integer.parseInt(br.readLine());
            suma += num; // Acumula la suma
        } while (num != 0);

        System.out.println("La suma de todos los números es: " + suma);
    }
}
