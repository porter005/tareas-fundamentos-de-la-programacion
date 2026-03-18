Algoritmo tarea8_ejrc12
    Leer d, m, bisiesto // bisiesto es logico
    valida = Falso
    Si m >= 1 Y m <= 12 Entonces
        Si m = 2 Entonces
            Si (bisiesto Y d >= 1 Y d <= 29) O (NO bisiesto Y d >= 1 Y d <= 28) Entonces
                valida = Verdadero
            FinSi
        Sino
            Si m=4 O m=6 O m=9 O m=11 Entonces
                Si d >= 1 Y d <= 30 Entonces 
					valida = Verdadero 			
				FinSi
            Sino
                Si d >= 1 Y d <= 31 Entonces 
					valida = Verdadero 
				FinSi
				
            FinSi
        FinSi
    FinSi
    Si valida Entonces 
		Escribir "Fecha Válida" 
	Sino
		Escribir "Inválida" 
	FinSi
FinAlgoritmo
