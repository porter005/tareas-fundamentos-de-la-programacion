package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tarea10_4 {
    public static void main(String[] args) throws IOException {
        System.out.print("Segundo octeto: ");
        int oct2 = new BufferedReader(new InputStreamReader(System.in)).read();
        System.out.print("Tercer octeto: ");
        int oct3 = new BufferedReader(new InputStreamReader(System.in)).read();

        if (oct2 == 0) { 
            if (oct3 == 5) { 
                System.out.println("Acceso concedido a Contabilidad");
            } else {
                System.out.println("Acceso denegado: Subred incorrecta"); 
            }
        } else {
            System.out.println("Acceso denegado: Red externa");
        }
    }
}