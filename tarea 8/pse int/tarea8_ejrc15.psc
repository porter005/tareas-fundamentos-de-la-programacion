Algoritmo tarea8_ejrc15
    Leer e1, e2, e3
    prom = (e1 + e2 + e3) / 3
    Si prom > 90 Entonces
        Si e1 = 100 O e2 = 100 O e3 = 100 Entonces
            Escribir "Oro con Honores"
        Sino
            Escribir "Oro"
        FinSi
    Sino
        Si prom >= 80 Entonces
            Escribir "Plata"
        Sino
            Escribir "Sin medalla"
        FinSi
    FinSi
FinAlgoritmo