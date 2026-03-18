Algoritmo tarea10_5
Escribir "Ingrese la hora (0-23):" 
    Leer hora
Escribir "Ingrese el volumen de datos (GB):" 
    Leer volumen
    
Si hora >= 2 Y hora <= 5 Entonces 
	Si volumen > 50 Entonces 
		Escribir "Alerta: Posible exfiltración de datos" 
		Escribir "Tráfico nocturno normal" 
        FinSi
    Sino 
        Si volumen > 500 Entonces 
            Escribir "Alerta: Congestión de red" 
			Sino
            Escribir "Tráfico bajo control" 
			FinSi
		FinSi
FinAlgoritmo