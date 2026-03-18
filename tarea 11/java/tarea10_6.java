package fundamentos_de_la_programacion;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tarea10_6 {
    public static void main(String[] args) throws IOException { {        
        
        System.out.println("--- Selector de Protocolo ---");
        System.out.println("Opciones comunes: 21 (FTP), 22 (SSH), 25 (SMTP), 80/443 (Web)");
        System.out.println("-----------------------------");
        
        System.out.print("Ingrese el número de puerto: ");
        int puerto = new BufferedReader(new InputStreamReader(System.in)).read();
  
        
        switch (puerto) {
            case 21:
                System.out.println("FTP - Transferencia de archivos"); 
                break;
            case 22:
                System.out.println("SSH - Acceso remoto seguro"); 
                break;
            case 25:
                System.out.println("SMTP - Envío de correo"); 
                break;
            case 80:
            case 443:
                System.out.println("Web (HTTP/HTTPS)");
                break;
            default:
                System.out.println("Puerto no estándar o desconocido"); 
        }
    }
}
}