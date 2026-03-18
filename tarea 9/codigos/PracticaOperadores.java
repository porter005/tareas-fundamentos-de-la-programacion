package fundamentos_de_la_programacion;

public class PracticaOperadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        //Uso de paréntesis para prioridad
        int resultado = (a + b) * 2; 
        
        //Uso de Wrappers (Integer)
        Integer numeroObjeto = Integer.valueOf(a);
        
        System.out.println("Resultado: " + resultado);
        System.out.println("Resto de división (mod): " + (a % b));
    }
}