package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class a2203275018_productointegradorr {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String[] opcionesPrincipales = {
            "Productos", 
            "Punto de Venta", 
            "Inventario", 
            "Listado de Ventas", 
            "Salida"
        };

        String titulo = "Menú de Punto de Tienda de Abarrotes la Pequeña";

        String eleccion = DesplegarMenu(titulo, opcionesPrincipales);

        System.out.println("\nUsted seleccionó la opción: " + eleccion);
    }

   
    public static String DesplegarMenu(String Titulo1, String[] menu) {
        String cadena;

        cadena = Titulo1 + "\n\n";

        cadena += MostrarMenu(menu);

      
        cadena += "\nQue opción deseas: ";

        
        return Dialogo(cadena);
    }

    public static String MostrarMenu(String[] opciones) {
       
        String cadena = "";
       
        int i = 0;

       
        while (i < opciones.length) {
            
            cadena += (i + 1) + ".- " + opciones[i] + "\n";
           
            i++;
        }

       
        return cadena;
    }

  
    public static String Dialogo(String texto) {
       
        String cadena = "";
        try {
          
            System.out.print(texto);
            
           
            cadena = reader.readLine();
            
           
            if (cadena == null) {
                cadena = "";
            }
        } catch (IOException e) {
            System.err.println("Error al leer la entrada: " + e.getMessage());
        }
        
        
        return cadena;
    }
}