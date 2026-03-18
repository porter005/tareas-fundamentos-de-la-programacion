Algoritmo Ejercicio18
    Leer d, m, a
    Si a == 0 Entonces
        Escribir "Invalida"
    Sino
        Si m=2 Y (d>=1 Y d<=28) Entonces 
			Escribir "OK"
        Sino 
			Si (m=4|m=6|m=9|m=11) Y (d>=1 Y d<=30) Entonces 
				Escribir "OK"
			Sino 
				Si (m=1|m=3|m=5|m=7|m=8|m=10|m=12) Y (d>=1 Y d<=31) Entonces 
					Escribir "OK"
				Sino 
					Escribir "Invalida"
				FinSi 
			FinSi 
		FinSi
			FinSi
FinAlgoritmo