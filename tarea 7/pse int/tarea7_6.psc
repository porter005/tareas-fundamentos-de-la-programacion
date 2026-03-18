Algoritmo tarea7_6
	Definir num, residuo Como Entero
    
    Escribir "Introduce un numero entero:"
    Leer num
        residuo <- num MOD 2
    Si residuo = 0 Entonces
        Escribir "El numero ", num, " es PAR"
    Sino
        Escribir "El numero ", num, " es IMPAR"
    FinSi
FinAlgoritmo
