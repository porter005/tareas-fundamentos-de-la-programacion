package fundamentos_de_la_programacion;
import javax.swing.JOptionPane;

public class Boletin02_ejc14_b {
    public static void main(String[] args) {
        int sueldo, suma = 0, mayor_1000 = 0;

        for (int i = 1; i <= 10; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Escribe el sueldo (" + i + " de 10):"));
            
            if (sueldo > 1000) {
                mayor_1000++;
            }
            suma += sueldo;
        }

        String mensaje = "Mayores de 1000 hay: " + mayor_1000 + "\n" +
                         "La suma total es: " + suma + "€";
                         
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

