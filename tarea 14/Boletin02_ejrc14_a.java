package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc14_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sueldo, suma = 0, mayor_1000 = 0;
//Solicita 10 sueldos, calcula su suma total y cuenta cuántos de ellos son mayores a 1000€.
        for (int i = 1; i <= 10; i++) {
            System.out.print("Escribe un sueldo: ");
            sueldo = Integer.parseInt(br.readLine());
            
            if (sueldo > 1000) {
                mayor_1000++;
            }
            suma += sueldo;
        }

        System.out.println("Mayores de 1000 hay: " + mayor_1000);
        System.out.println("La suma es de: " + suma);
    }
}
