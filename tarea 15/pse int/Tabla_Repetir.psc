Algoritmo Tabla_Repetir
    Definir num, ciclo Como Entero
    Escribir "Introduce el número de la tabla:"
    Leer num
    ciclo <- 1
    Repetir
        Escribir num, " * ", ciclo, " = ", (num * ciclo)
        ciclo <- ciclo + 1
    Hasta Que ciclo > 10
FinAlgoritmo
