package fundamentos_de_la_programacion;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tarea10_9 {
    public static void main(String[] args) throws IOException {
        System.out.println("Extensiones: 1:.exe | 2:.docx | 3:.sh");
        System.out.print("Elija código: ");
        int ext = new BufferedReader(new InputStreamReader(System.in)).read();

        switch (ext) {
            case 1:
            case 3:
                System.out.print("¿Es admin? (1:Si / 0:No): "); 
                int esAdmin = new BufferedReader(new InputStreamReader(System.in)).read();
                System.out.println("Archivo potencialmente ejecutable."); 
                if (esAdmin == 1) System.out.println("Permisos confirmados.");
                break;
            case 2:
                System.out.println("Documento de texto seguro"); 
                break;
            default:
                System.out.println("Extensión no reconocida"); 
        }
    }
}