package fundamentos_de_la_programacion;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class a2203275018_productointegragorET4 {

    static String[][] productos;

    public static void main(String[] args) throws IOException {
        productos = CargarProductos();
        MenuPrincipal(productos);
    }

    public static String[][] CargarProductos() {
        String[][] producto = {
            { "001", "Arroz 1kg", "35", "10" },
            { "002", "Azúcar 1kg", "25", "10" },
            { "003", "Harina 1kg", "28", "10" },
            { "004", "Aceite 1L", "50", "10" },
            { "005", "Leche 1L", "35", "10" },
            { "006", "Huevos 12 unidades", "45", "10" },
            { "007", "Fideos 500g", "20", "10" },
            { "008", "Sal 1kg", "15", "10" },
            { "009", "Pasta de tomate 400g", "25", "10" },
            { "010", "Atún lata 170g", "35", "10" }
        };
        return producto;
    }

    public static void MenuPrincipal(String[][] vproductos) throws IOException {
        String op = "";
        String[] menu = {"Productos", "Punto de Venta", "Inventario", "Salida"};
        do {
            op = DesplegarMenu("Tienda de Abarrotes la Pequeña", menu);
            switch (op) {
                case "1":
                    MenuProductos(vproductos);
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

    public static void MenuProductos(String[][] vproductos) throws IOException {
        String op = "";
        String[] menu = {"Modificar Producto", "Listado de Productos", "Volver"};
        do {
            op = DesplegarMenu("MÓDULO DE PRODUCTOS", menu);
            switch (op) {
                case "1":
                    ModificarProducto(vproductos);
                    break;
                case "2":
                    System.out.println("\nLISTADO DE PRODUCTOS\n" + MostrarLista(vproductos));
                    break;
            }
        } while (!op.equals("3"));
    }

    public static void ModificarProducto(String[][] vproductos) throws IOException {
        System.out.println(MostrarLista(vproductos));
        String codigo = Leer("Introduce el código del producto a modificar");
        
        if (codigo != null) {
            int posicion = ExisteProducto(codigo, vproductos);
            
            if (posicion > -1) {
                String nuevoPrecio = Leer("Introduce el nuevo precio para " + vproductos[posicion][1]);
                if (nuevoPrecio != null) {
                    if (EvaluarNumerico(nuevoPrecio, 2)) {
                        vproductos[posicion][2] = nuevoPrecio;
                        System.out.println("Precio actualizado con éxito.");
                    } else {
                        System.out.println("Error: El precio debe ser numérico.");
                    }
                }
            } else {
                System.out.println("El código no existe.");
            }
        }
    }

    public static int ExisteProducto(String codigo, String[][] vproductos) {
        int enc = -1;
        for (int i = 0; i < vproductos.length; i++) {
            if (vproductos[i][0].equals(codigo.trim())) {
                enc = i;
                break;
            }
        }
        return enc;
    }

    public static String MostrarLista(String[][] vproductos) {
        String salida = "";
        for (int i = 0; i < vproductos.length; i++) {
            String[] vproducto = vproductos[i];
            salida += MostrarProducto(vproducto) + "\n";
        }
        return salida;
    }

    
    public static String MostrarProducto(String[] vproducto) {
        String codigo = RellenarEspacios(vproducto[0], 5);
        String nombre = RellenarEspacios(vproducto[1], 30);
        String precio = RellenarEspacios(vproducto[2], 10);
        String cantidad = RellenarEspacios(vproducto[3], 10);
        
        return codigo + nombre + precio + cantidad;
    }

   

    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
    }

    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        for (int i = 0; i < opciones.length; i++) {
            cadena += (i + 1) + ".- " + opciones[i] + "\n";
        }
        return cadena;
    }

    public static String Dialogo(String texto) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(texto + ": ");
        try {
            return br.readLine();
        } catch (IOException e) {
            return "";
        }
    }

    public static String DesplegarMenu(String Titulol, String[] menu) {
        String cadena = "\n--- " + Titulol + " ---\n" + MostrarMenu(menu) + "Seleccione una opción";
        return Dialogo(cadena);
    }

    public static String Leer(String texto) {
        String cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty()) return null;
        }
        return cadena;
    }

    public static boolean EsNumeroEntero(String dato) {
        if (dato == null) return false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static boolean EsNumeroDouble(String dato) {
        if (dato == null) return false;
        int puntos = 0;
        for (char c : dato.toCharArray()) {
            if (c == '.') {
                puntos++;
                if (puntos > 1) return false;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true; 
    }

    public static boolean EvaluarNumerico(String dato, int tipo) {
        return (tipo == 1) ? EsNumeroEntero(dato) : EsNumeroDouble(dato);
    }

    public static String RellenarEspacios(String dato, int tamano) {
        StringBuilder cadena = new StringBuilder(dato);
        for (int i = dato.length(); i < tamano; i++) {
            cadena.append(" ");
        }
        return cadena.toString();
    }
}