Algoritmo tarea8_ejrc18
    Leer s1, s2, s3
    Si Abs(s1-s2)>20 O Abs(s1-s3)>20 O Abs(s2-s3)>20 Entonces
        Escribir "Error de Sensor"
    Sino
        prom = (s1+s2+s3)/3
        Si prom > 80 Entonces
			Escribir "Alerta de Incendio"
        Sino
            Si prom > 60 Entonces 
				Escribir "Alerta de Sobrecalentamiento"
            Sino 
				Escribir "Estado Normal" 
			FinSi
        FinSi
    FinSi
FinAlgoritmo