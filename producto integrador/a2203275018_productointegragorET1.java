package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class a2203275018_productointegragorET1 {

    public static void main(String[] args) {
        String tituloPrincipal = "Menú de Punto de Tienda de Abarrotes la Pequeña";
        String[] opcionesPrincipales = {"Productos", "Punto de Venta", "Inventario", "Listado de Ventas", "Salida"};

        String eleccion = DesplegarMenu(tituloPrincipal, opcionesPrincipales);
        
        System.out.println("Opción seleccionada: " + eleccion);
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena = "";
        try {
            System.out.print(texto + ": ");
            cadena = br.readLine();
        } catch (IOException e) {
            cadena = "";
        }
        return cadena;
    }

    public static String DesplegarMenu(String Titulol, String[] menu) {
        String cadena;
        cadena = Titulol + "\n\n";
        cadena += MostrarMenu(menu);
        cadena += "Que opción deseas";
        return Dialogo(cadena);
    }
}