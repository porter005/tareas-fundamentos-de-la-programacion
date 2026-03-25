
import javax.swing.JOptionPane;

public class CalcularAreas2 {

    public static void main(String[] args) {
        String opcio;
        double radio, base, altura, baseMayor, baseMenor;

        do {
            opcio = mostrarMenu();

            switch (opcio) {
                case "C":
                    radio = pedirDato("Ingresa el radio del círculo:");
                    mostrarResultado("Círculo", calcularAreaCirculo(radio));
                    break;

                case "T":
                    base = pedirDato("Ingresa la base del triángulo:");
                    altura = pedirDato("Ingresa la altura del triángulo:");
                    mostrarResultado("Triángulo", calcularAreaTriangulo(base, altura));
                    break;

                case "R":
                    base = pedirDato("Ingresa la base del rectángulo:");
                    altura = pedirDato("Ingresa la altura del rectángulo:");
                    mostrarResultado("Rectángulo", calcularAreaRectangulo(base, altura));
                    break;

                case "P":
                    baseMayor = pedirDato("Ingresa la base mayor del trapecio (B):");
                    baseMenor = pedirDato("Ingresa la base menor del trapecio (b):");
                    altura = pedirDato("Ingresa la altura del trapecio (h):");
                    mostrarResultado("Trapecio", calcularAreaTrapecio(baseMayor, baseMenor, altura));
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
        String menu = "--- MENÚ DE ÁREAS ---\n"
                    + "C - Círculo\n"
                    + "T - Triángulo\n"
                    + "R - Rectángulo\n"
                    + "P - Trapecio\n"
                    + "S - Salir\n\n"
                    + "Elige una opción:";
        
        String input = JOptionPane.showInputDialog(menu);
        if (input == null) return "S";
        return input.toUpperCase();
    }

    public static double pedirDato(String mensaje) {
        String lectura = JOptionPane.showInputDialog(null, mensaje, "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        if (lectura == null || lectura.isEmpty()) return 0;
        return Double.parseDouble(lectura);
    }

    public static void mostrarResultado(String figura, double area) {
        JOptionPane.showMessageDialog(null, "El área del " + figura + " es: " + area, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }


    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTrapecio(double B, double b, double h) {
        return ((B + b) * h) / 2;
    }
}