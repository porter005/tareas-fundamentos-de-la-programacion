Algoritmo Menu_Operaciones
    Definir opcion Como Entero
    Definir operando1, operando2, resultado Como Real
    Repetir
        Escribir "1.- Suma"
        Escribir "2.- Multiplicación"
        Escribir "3.- División"
        Escribir "4.- Salir"
        Escribir "Introduzca la opción a realizar:"
        Leer opcion
        
        Si opcion >= 1 Y opcion <= 3 Entonces
            Escribir "Introduce operando 1:"
            Leer operando1
            Escribir "Introduce operando 2:"
            Leer operando2
        FinSi
        
        Segun opcion Hacer
            1: 
                resultado <- operando1 + operando2
                Escribir "El resultado de la suma es: ", resultado
            2: 
                resultado <- operando1 * operando2
                Escribir "El resultado de la multiplicación es: ", resultado
            3: 
                resultado <- operando1 / operando2
                Escribir "El resultado de la división es: ", resultado
            4: 
                Escribir "Salida"
            De Otro Modo:
                Escribir "Opción no reconocida"
        FinSegun
    Hasta Que opcion = 4
FinAlgoritmo