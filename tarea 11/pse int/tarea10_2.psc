Algoritmo tarea10_2
Escribir "Ingrese el primer octeto de la IP (0-255):"
    Leer octeto
Si octeto >= 1 Y octeto <= 126 Entonces 
	Escribir "Clase A" 
    Sino 
	Si octeto == 127 Entonces 
		Escribir "Dirección de Loopback" 
        Sino 
		Si octeto >= 128 Y octeto <= 191 Entonces 
			Escribir "Clase B" 
            Sino 
			Si octeto >= 192 Y octeto <= 223 Entonces 
				Escribir "Clase C" 
                Sino
				Escribir "Clase especial o reservada"
                FinSi
            FinSi
        FinSi
    FinSi
FinAlgoritmo