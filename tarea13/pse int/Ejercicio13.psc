Algoritmo Ejercicio13
    Definir num, original, reves Como Entero
    Leer num
    original <- num
    reves <- 0
    Mientras num > 0 Hacer
        reves <- (reves * 10) + (num MOD 10)
        num <- trunc(num/10)
    FinMientras
    Si original == reves Entonces 
		Escribir "Es capicúa" 
	Sino 
		Escribir "No lo es" 
	FinSi
FinAlgoritmo