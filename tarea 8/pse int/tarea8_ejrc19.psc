Algoritmo tarea8_ejrc19
    Leer octeto
    Si octeto >= 1 Y octeto <= 127 Entonces
        Si octeto = 10 Entonces 
			Escribir "Clase A - Privada" 
		Sino 
			Escribir "Clase A - Pública" 
		FinSi
		Sino
			Si octeto >= 128 Y octeto <= 191 Entonces
				Si octeto = 172 Entonces 
					Escribir "Clase B - Privada" 
				Sino 
					Escribir "Clase B - Pública"
				FinSi
				Sino
					Si octeto >= 192 Y octeto <= 223 Entonces
						Si octeto = 192 Entonces 
							Escribir "Clase C - Privada" 
						Sino
							Escribir "Clase C - Pública"
						FinSi
						FinSi
					FinSi
				FinSi
FinAlgoritmo