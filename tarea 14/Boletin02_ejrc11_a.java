package fundamentos_de_la_programacion;

import java.io.*;

public class Boletin02_ejrc11_a {
    public static void main(String[] args) {
        long producto = 1; 
//Calcula y muestra el producto de los 10 primeros números impares.
        for (int i = 1; i < 20; i += 2) {
            producto = producto * i;
        }

        System.out.println("La multiplicación de los 10 primeros impares: " + producto);
    }
}