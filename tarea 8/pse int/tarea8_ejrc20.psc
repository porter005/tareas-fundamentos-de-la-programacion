Algoritmo tarea8_ejrc20
    Leer tipo, latencia
    Si tipo = "Voz" O tipo = "Video" Entonces
        Si latencia < 50 Entonces 
			Escribir "Prioridad Alta" 
		Sino 
			Escribir "Prioridad Media" 
		FinSi
		Sino
			Si tipo = "Descarga" Entonces
				Si latencia < 150 Entonces
					Escribir "Prioridad Baja" 
				Sino 
					Escribir "Prioridad Mínima"
				FinSi
				FinSi
			FinSi
FinAlgoritmo
