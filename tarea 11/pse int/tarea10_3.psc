Algoritmo tarea10_3
Escribir "Ingrese intentos fallidos:" 
    Leer intentos_fallidos
Escribir "¿Es IP conocida? (1 para Sí, 0 para No):" 
    Leer es_ip_conocida
    
Si es_ip_conocida == 0 Entonces 
	Si intentos_fallidos > 3 Entonces 
		Escribir "Bloquear IP permanentemente" 
        Sino 
		Si intentos_fallidos >= 1 Y intentos_fallidos <= 3 Entonces 
			Escribir "Solicitar Captcha" 
            FinSi
        FinSi
    Sino 
        Si intentos_fallidos > 10 Entonces
            Escribir "Bloquear temporalmente por 15 min" 
			Sino
            Escribir "Permitir reintento" 
			FinSi
		FinSi
FinAlgoritmo