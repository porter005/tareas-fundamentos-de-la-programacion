package fundamentos_de_la_programacion;

import java.io.*;

public class 	Boletin02_ejrc21_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sueldo, sueldo_max = 0, suma = 0;
        float media;
//Solicita 10 sueldos, muestra el sueldo máximo y calcula la media de todos los sueldos introducidos.
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduzca sueldo: ");
            sueldo = Integer.parseInt(br.readLine());

            // Comprobar si es el máximo
            if (sueldo > sueldo_max) {
                sueldo_max = sueldo;
            }
            
            suma += sueldo;
        }

        media = (float) suma / 10;
        System.out.println("El sueldo máximo es de: " + sueldo_max);
        System.out.println("La media es de: " + media);
    }
}
