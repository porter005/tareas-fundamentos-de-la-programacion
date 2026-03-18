package fundamentos_de_la_programacion;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tarea10_7 {
    public static void main(String[] args) 	throws IOException {
    
    	
        System.out.println("Acciones: 1:Permitir | 2:Bloquear | 3:Cuarentena");
        System.out.print("Ingrese código de acción y nivel de riesgo (1-10): ");
        int codigo = new BufferedReader(new InputStreamReader(System.in)).read();
        int riesgo = new BufferedReader(new InputStreamReader(System.in)).read();

        switch (codigo) {
            case 1:
                if (riesgo > 7) System.out.println("Advertencia: Tráfico riesgoso permitido"); 
                else System.out.println("Tráfico seguro"); 
                break;
            case 2:
                System.out.println("Paquete descartado"); 
                break;
            case 3:
                System.out.println("Paquete aislado para análisis"); 
                break;
            default:
                System.out.println("Acción desconocida");
        }
    }
}