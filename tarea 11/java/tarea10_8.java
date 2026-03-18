package fundamentos_de_la_programacion;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class tarea10_8 {
    public static void main(String[] args) throws IOException {
        System.out.print("Ingrese tipo (V: Voz, D: Datos, G: Gaming): ");
        char tipo = (char) new BufferedReader(new InputStreamReader(System.in)).read();

        switch (tipo) {
            case 'V':
                System.out.println("Prioridad: Crítica");
                break;
            case 'G':
                System.out.println("Prioridad: Alta"); 
                break;
            case 'D':
                System.out.print("Ingrese tamaño (MB): ");
                int tamano = new BufferedReader(new InputStreamReader(System.in)).read();
                if (tamano > 1000) System.out.println("Prioridad: Baja"); 
                else System.out.println("Prioridad: Media"); 
                break;
        }
    }
}