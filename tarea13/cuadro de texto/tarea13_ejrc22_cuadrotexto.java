package fundamentos_de_la_programacion;

import javax.swing.JOptionPane;

public class tarea13_ejrc22_cuadrotexto {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Número (0-99):"));
        int dec = num / 10;
        int uni = num % 10;
        String res = "";
        
        if (dec != 0) {
            switch (dec) {
                case 1: res = "Diez"; break;
                case 2: res = "Veinte"; break;
                case 3: res = "Treinta"; break;
                case 4: res = "Cuarenta"; break;
                case 5: res = "Cincuenta"; break;
                case 6: res = "Sesenta"; break;
                case 7: res = "Setenta"; break;
                case 8: res = "Ochenta"; break;
                case 9: res = "Noventa"; break;
            }
            if (uni != 0) res = res + " y ";
        }
        
        switch (uni) {
            case 0: if (dec == 0) res = "Cero"; break;
            case 1: res += "uno"; break;
            case 2: res += "dos"; break;
            case 3: res += "tres"; break;
            case 4: res += "cuatro"; break;
            case 5: res += "cinco"; break;
            case 6: res += "seis"; break;
            case 7: res += "siete"; break;
            case 8: res += "ocho"; break;
            case 9: res += "nueve"; break;
        }
        JOptionPane.showMessageDialog(null, res);
    }
}
