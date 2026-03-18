package fundamentos_de_la_programacion;

import java.io.BufferedInputStream;
import java.io.IOException;


public class tarea10_1 {
    public static void main(String[] args) throws IOException {
        System.out.print("Tamaño del paquete: ");
        int tamano = new BufferedInputStream(System.in).read();
        System.out.print("Protocolo (1:ICMP, 2:TCP): ");
        int protocolo = new BufferedInputStream(System.in).read();

        if (protocolo == 1) { 
            if (tamano > 65535) { 
                System.out.println("Ataque Ping de la Muerte detectado"); 
            } else {
                System.out.println("Paquete ICMP normal"); 
            }
        } else if (protocolo == 2) {
            System.out.println("Ignorar, no es ICMP"); 
        }
        
    }
    
    
}
