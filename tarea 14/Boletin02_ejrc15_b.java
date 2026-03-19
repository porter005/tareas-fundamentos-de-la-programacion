package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class Boletin02_ejrc15_b {
    public static void main(String[] args) {
        int edad, media_edad, suma_edad = 0, mayor_18 = 0, mayor_175 = 0;
        double altura, media_altura, suma_altura = 0;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno " + i + "\nIntroduzca edad:"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Alumno " + i + "\nIntroduzca altura:"));

            if (edad > 18) mayor_18++;
            if (altura > 1.75) mayor_175++;

            suma_edad += edad;
            suma_altura += altura;
        }

        media_edad = suma_edad / 5;
        media_altura = suma_altura / 5;

        String res = "Edad media: " + media_edad + "\n" +
                     "Altura media: " + media_altura + "\n" +
                     "Mayores de 18: " + mayor_18 + "\n" +
                     "Más altos de 1.75: " + mayor_175;

        JOptionPane.showMessageDialog(null, res);
    }
}
