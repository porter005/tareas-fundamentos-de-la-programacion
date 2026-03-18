Algoritmo Ejercicio01
    Definir a, b, c, x1, x2, d Como Real
    Escribir "Introduzca primer coeficiente (a):"
    Leer a
    Escribir "Introduzca segundo coeficiente (b):"
    Leer b
    Escribir "Introduzca tercer coeficiente (c):"
    Leer c
    d <- (b^2) - 4*a*c
    Si d < 0 Entonces
        Escribir "No existen soluciones reales"
    Sino
        x1 <- (-b + rc(d)) / (2*a)
        x2 <- (-b - rc(d)) / (2*a)
        Escribir "Solución 1: ", x1
        Escribir "Solución 2: ", x2
    FinSi
FinAlgoritmo