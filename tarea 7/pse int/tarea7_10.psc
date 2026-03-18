Algoritmo tarea7_10
    Definir opcion Como Entero
    Definir n1, n2, resultado Como Real
    Escribir "1. Suma"
    Escribir "2. Multiplicación"
    Escribir "3. División"
    Escribir "Elija una opción (1-3):"
    Leer opcion
    
    Escribir "Ingrese el primer número:"
    Leer n1
    Escribir "Ingrese el segundo número:"
    Leer n2
    
    Segun opcion Hacer
        1:
            resultado <- n1 + n2
            Escribir "El resultado de la suma es: ", resultado
        2:
            resultado <- n1 * n2
            Escribir "El resultado de la multiplicación es: ", resultado
        3:
            Si n2 <> 0 Entonces
                resultado <- n1 / n2
                Escribir "El resultado de la división es: ", resultado
            Sino
                Escribir "Error: No se puede dividir entre cero."
            FinSi
        De Otro Modo:
            Escribir "Opción no válida."
    FinSegun
FinAlgoritmo