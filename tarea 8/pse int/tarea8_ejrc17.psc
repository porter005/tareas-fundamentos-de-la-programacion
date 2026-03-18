Algoritmo tarea8_ejrc17
    Leer lon, m, n, e 
    Si lon < 8 Entonces
        Escribir "Insegura"
    Sino
        puntos = 0
        Si m Entonces 
			puntos = puntos + 1 
		FinSi
        Si n Entonces 
			puntos = puntos + 1
		FinSi
        Si e Entonces 
			puntos = puntos + 1
		FinSi
        Si puntos = 3 Entonces 
			Escribir "Muy Fuerte"
        Sino 
            Si puntos = 2 Entonces 
				Escribir "Fuerte"
            Sino
				Escribir "Débil" 
			FinSi
        FinSi
    FinSi
FinAlgoritmo