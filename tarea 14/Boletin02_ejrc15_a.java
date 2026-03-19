package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc15_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int edad, media_edad, suma_edad, mayor_18, mayor_175;
        double altura, media_altura, suma_altura;
//Pide las edades y alturas de 5 alumnos para calcular medias, contar mayores de 18 años y alumnos que miden más de 1.75m.
        mayor_18 = 0;
        mayor_175 = 0;
        suma_edad = 0;
        suma_altura = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno " + i);
            System.out.print("Introduzca edad: ");
            edad = Integer.parseInt(br.readLine());
            System.out.print("Introduzca altura: ");
            altura = Double.parseDouble(br.readLine());

            if (edad > 18) mayor_18++;
            if (altura > 1.75) mayor_175++;

            suma_edad += edad;
            suma_altura += altura;
        }

        media_edad = suma_edad / 5;
        media_altura = suma_altura / 5;

        System.out.println("\nResultados:");
        System.out.println("La edad media es de: " + media_edad);
        System.out.println("La altura media es de: " + media_altura);
        System.out.println("Alumnos mayores de 18 años: " + mayor_18);
        System.out.println("Alumnos que miden más de 1.75: " + mayor_175);
    }
}