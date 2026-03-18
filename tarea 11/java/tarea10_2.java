package fundamentos_de_la_programacion;
import java.io.BufferedInputStream;
import java.io.IOException;

public class tarea10_2 {
    public static void main(String[] args) throws IOException {
        System.out.print("Primer octeto (0-255): ");
        int octeto = new BufferedInputStream(System.in).read();

        if (octeto >= 1 && octeto <= 126) { 
            System.out.println("Clase A");
        } else if (octeto == 127) { 
            System.out.println("Dirección de Loopback");
        } else if (octeto >= 128 && octeto <= 191) { 
            System.out.println("Clase B");
        } else if (octeto >= 192 && octeto <= 223) { 
            System.out.println("Clase C");
        } else {
            System.out.println("Clase especial o reservada"); 
        }
    }
}