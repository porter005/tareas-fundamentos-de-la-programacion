Algoritmo tarea10_8
    Definir tipo Como Caracter
    Definir tamano Como Entero
    Escribir "--- Categorías de Tráfico ---"
    Escribir "[V] Voz | [D] Datos | [G] Gaming"
    Escribir "Ingrese tipo de tráfico:"
    Leer tipo
    
    Segun tipo Hacer
        'V', 'v':
		Escribir "Prioridad: Crítica" 
        'G', 'g':
		Escribir "Prioridad: Alta" 
        'D', 'd':
            Escribir "Ingrese tamaño en MB:"
            Leer tamano
		Si tamano > 1000 Entonces 
			Escribir "Prioridad: Baja" 
            Sino
			Escribir "Prioridad: Media"
            FinSi
    FinSegun
FinAlgoritmo