package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class a2203275018_productointegragorET3 {

    public static void main(String[] args) throws IOException {
        MenuPrincipal();
    }

    public static void MenuPrincipal() throws IOException {
        String op = "";
        String[] menu = {"Productos", "Punto de Venta", "Inventario", "Salida"};
        do {
            op = DesplegarMenu("Tienda de Abarrotes la Pequeña", menu);
            switch (op) {
                case "1":
                    System.out.println("Entrando a Productos...");
                    break;
                case "2":
                    System.out.println("Entrando a Punto de Venta...");
                    break;
                case "3":
                    System.out.println("Entrando a Inventario...");
                    break;
                case "4":
                    System.out.println("Salida del Sistema");
                    break;
                default:
                    System.out.println("No existe esta opción");
                    break;
            }
        } while (!op.equals("4"));
    }

    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
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
        String cadena = Titulol + "\n\n" + MostrarMenu(menu) + "Que opción deseas";
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
                if (EsNumeroEntero(dato)) valido = true;
                break;
            case 2:
                if (EsNumeroDouble(dato)) valido = true;
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