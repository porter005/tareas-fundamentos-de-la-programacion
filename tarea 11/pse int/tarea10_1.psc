Algoritmo tarea10_1
    Escribir "Ingrese el tamaño del paquete (bytes):" 
		Leer tamano
    Escribir "Ingrese el protocolo (1 para ICMP, 2 para TCP):" 
		Leer protocolo
    Si protocolo == 1 Entonces 
        Si tamano > 65535 Entonces 
            Escribir "Ataque Ping de la Muerte detectado" 
			Sino
            Escribir "Paquete ICMP normal" 
			FinSi
		Sino
        Si protocolo == 2 Entonces 
            Escribir "Ignorar, no es ICMP" 
			FinSi
		FinSi
FinAlgoritmo