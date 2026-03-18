package fundamentos_de_la_programacion;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class tarea10_10 {
    public static void main(String[] args) throws IOException {
        System.out.println("1:Escanear | 2:Firewall | 3:Cifrar | 4:Salir"); 
        int opcion = new BufferedReader(new InputStreamReader(System.in)).read();

        switch (opcion) {
            case 1:
                System.out.print("Rango (>0): ");
                int rango =new BufferedReader(new InputStreamReader(System.in)).read();
                if (rango > 0) System.out.println("Escaner iniciado."); 
                break;
            case 2:
                System.out.println("Estado: Activo"); 
                break;
            case 3:
                System.out.print("Nivel (1 o 2): ");
                int nivel = new BufferedReader(new InputStreamReader(System.in)).read();
                if (nivel == 2) System.out.println("Cifrado AES"); 
                else System.out.println("Cifrado César"); 
                break;
            case 4:
                System.out.println("Cerrando sesión"); 
                break;
        }
    }
}