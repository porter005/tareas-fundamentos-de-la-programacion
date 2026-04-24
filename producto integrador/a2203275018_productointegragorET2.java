package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class a2203275018_productointegragorET2 {

    public static void main(String[] args) {
        String tituloPrincipal = "Menú de Punto de Tienda de Abarrotes la Pequeña";
        String[] opcionesPrincipales = {"Productos", "Punto de Venta", "Inventario", "Listado de Ventas", "Salida"};

        String eleccion = DesplegarMenu(tituloPrincipal, opcionesPrincipales);
        
        System.out.println("\nSelección guardada: " + eleccion);
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
        String cadena = Titulol + "\n\n";
        cadena += MostrarMenu(menu);
        cadena += "Que opción deseas";
        return Dialogo(cadena);
    }

    public static String Leer(String texto) {
        String cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty()) {
                cadena = null;
            }
        } else {
            cadena = null;
        }
        return cadena;
    }

    public static boolean EsNumeroEntero(String dato) {
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean EsNumeroDouble(String dato) {
        boolean valido = false;
        int puntos = 0;
        for (char c : dato.toCharArray()) {
            if (Character.isDigit(c)) {
            } else if (c == '.') {
                puntos++;
                if (puntos > 1) {
                    return false;
                }
                valido = true;
            } else {
                return false;
            }
        }
        return valido;
    }

    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valido = false;
        switch (tipo) {
            case 1:
                if (EsNumeroEntero(dato)) {
                    valido = true;
                }
                break;
            case 2:
                if (EsNumeroDouble(dato)) {
                    valido = true;
                }
                break;
        }
        return valido;
    }

    public static String RellenarEspacios(String dato, int tamano) {
        String cadena = dato;
        for (int i = dato.length(); i < tamano; i++) {
            cadena += " ";
        }
        return cadena;
    }

    public static String IdticketSiguiente(String idticket) {
        String idticketnext = "";
        int num = Integer.parseInt(idticket) + 1;
        if (num < 10) {
            idticketnext = "00" + String.valueOf(num);
        } else if (num >= 10 && num <= 99) {
            idticketnext = "0" + String.valueOf(num);
        } else {
            idticketnext = String.valueOf(num);
        }
        return idticketnext;
    }
}