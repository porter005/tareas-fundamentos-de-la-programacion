package fundamentos_de_la_programacion;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tarea10_5 {
    public static void main(String[] args)  throws IOException {
        System.out.print("Hora (0-23): ");
        int hora = new BufferedReader(new InputStreamReader(System.in)).read(); 
        System.out.print("Volumen de datos (GB): ");
        double volumen = new BufferedReader(new InputStreamReader(System.in)).read();

        if (hora >= 2 && hora <= 5) { 
            if (volumen > 50) { 
                System.out.println("Alerta: Posible exfiltración de datos");
            } else {
                System.out.println("Tráfico nocturno normal"); 
            }
        } else { 
            if (volumen > 500) { 
                System.out.println("Alerta: Congestión de red");
            } else {
                System.out.println("Tráfico bajo control");
            }
        }
    }
}