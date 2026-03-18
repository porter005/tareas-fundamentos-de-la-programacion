Algoritmo tarea7_9
    Definir n1, n2, n3, promedio Como Real
    Escribir "Ingrese la calificación del primer parcial:"
    Leer n1
    Escribir "Ingrese la calificación del segundo parcial:"
    Leer n2
    Escribir "Ingrese la calificación del tercer parcial:"
    Leer n3
    promedio <- (n1 + n2 + n3) / 3
    Escribir "Tu promedio final es: ", promedio
    Si promedio >= 7 Entonces
        Escribir "Estado: ACREDITADO"
    Sino
        Escribir "Estado: NO ACREDITADO"
    FinSi
FinAlgoritmo