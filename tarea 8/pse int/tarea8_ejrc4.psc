Algoritmo tarea8_ejrc4
    Escribir "Edad, Fuerza (0-100) y Visión (0-1):"
    Leer edad, fuerza, vision
    Si edad >= 18 Y edad <= 25 Entonces
        Si fuerza > 80 Y vision >= 0.8 Entonces
            Escribir "Fuerzas Especiales"
        Sino
            Si fuerza > 50 Entonces
                Escribir "Infantería"
            Sino
                Escribir "No apto"
            FinSi
        FinSi
    Sino
        Si edad > 25 Y vision >= 0.9 Entonces
            Escribir "Estratega"
        Sino
            Escribir "No apto"
        FinSi
    FinSi
FinAlgoritmo