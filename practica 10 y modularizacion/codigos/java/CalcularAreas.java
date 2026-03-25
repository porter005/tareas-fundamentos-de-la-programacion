
import javax.swing.JOptionPane;

public class CalcularAreas {

    public static void main(String[] args) {
        String opcio;
        double radio, base, altura;

        do {
            opcio = mostrarMenu();

            switch (opcio) {
                case "C":
                    radio = pedirDato("Ingresa el radio del círculo:");
                    double areaC = calcularAreaCirculo(radio);
                    JOptionPane.showMessageDialog(null, "El área del círculo es: " + areaC);
                    break;

                case "T":
                    base = pedirDato("Ingresa la base del triángulo:");
                    altura = pedirDato("Ingresa la altura del triángulo:");
                    double areaT = calcularAreaTriangulo(base, altura);
                    JOptionPane.showMessageDialog(null, "El área del triángulo es: " + areaT);
                    break;

                case "S":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "OPCIÓN NO VÁLIDA.");
                    break;
            }

        } while (!opcio.equals("S"));
    }

    public static String mostrarMenu() {
        String menu = "--- MENÚ ---\n"
                    + "C - Calcular área del círculo\n"
                    + "T - Calcular área del triángulo\n"
                    + "S - Salir\n\n"
                    + "Elige una opción:";
        
        String input = JOptionPane.showInputDialog(menu);
        
        if (input == null) return "S";
        
        return input.toUpperCase();
    }

    public static double pedirDato(String mensaje) {
        String lectura = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(lectura);
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
