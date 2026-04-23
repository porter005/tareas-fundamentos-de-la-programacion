package fundamentos_de_la_programacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class a2203275018_productointegrador {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            String entrada = Leer("Ingrese un valor para validar (entero o decimal): ");
            
            System.out.println("Validacion Entero (Tipo 1): " + EvaluarNumerico(entrada, 1));
            System.out.println("Validacion Decimal (Tipo 2): " + EvaluarNumerico(entrada, 2));

            String ticket = Leer("Ingrese el numero de ticket actual (ej. 001): ");
            if (EvaluarNumerico(ticket, 1)) {
                System.out.println("Siguiente ticket: " + IdticketSiguiente(ticket));
            }

            String nombre = Leer("Ingrese un nombre para formatear: ");
            System.out.println("Resultado con espacios: [" + RellenarEspacios(nombre, 15) + "]");

        } catch (Exception e) {
            System.out.println("Error en la ejecucion: " + e.getMessage());
        }
    }

  
    public static String Leer(String texto) {
        String cadena = ""; 
        try {
            System.out.print(texto);
            cadena = reader.readLine(); 

            if (cadena != null) { 
                cadena = cadena.trim();
                if (cadena.isEmpty()) {
                    cadena = null;
                }
            } else {
                cadena = null;
            }
        } catch (IOException e) {
            cadena = null;
        }
        return cadena; 
    }

    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valida = false; 
        
        switch (tipo) {
            case 1:
                if (EsNumeroEntero(dato)) { 
                    valida = true;
                }
                break;
            case 2:
                if (EsNumeroDouble(dato)) { 
                    valida = true;
                }
                break;
        }
        return valida;
    }

    public static boolean EsNumeroEntero(String dato) {
        if (dato == null) return false;
        
       
        for (char ch : dato.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true; 
    }

   
    public static boolean EsNumeroDouble(String dato) {
        if (dato == null) return false;
        
        boolean puntoEncontrado = false;
        
        for (char c : dato.toCharArray()) { 
            if (Character.isDigit(c)) {
                continue; 
            } else if (c == '.') { 
                if (!puntoEncontrado) {
                    puntoEncontrado = true; 
                } else {
                    return false; 
                }
            } else {
                return false; 
            }
        }
        return puntoEncontrado; 
    }

  
    public static String RellenarEspacios(String dato, int tamano) {
        String cadena = (dato == null) ? "" : dato; 
        
        for (int i = cadena.length(); i < tamano; i++) { 
            cadena += " "; 
        }
        return cadena; 
    }

  
    public static String IdticketSiguiente(String idticket) {
        if (idticket == null) return "001";
        
        String idticketnext = ""; 
        int num = Integer.parseInt(idticket) + 1; 
        
        if (num < 10) {
            idticketnext = "00" + num; 
        } else if (num < 100) {
            idticketnext = "0" + num;
        } else {
            idticketnext = String.valueOf(num); 
        }
        
        return idticketnext; 
    }
}