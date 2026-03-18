Algoritmo tarea10_9
    Definir ext, admin Como Entero
    Escribir "--- Tipos de Archivo ---"
    Escribir "1: .exe | 2: .docx | 3: .sh"
    Leer ext
    
    Segun ext Hacer
        1, 3: 
            Escribir "¿Tiene permisos de admin? (1:Si, 0:No)" 
				Leer admin
				Si admin == 1 Entonces
					Escribir "Archivo potencialmente ejecutable - Ejecución autorizada"
				Sino
					Escribir "Archivo potencialmente ejecutable - Acceso Denegado"
				FinSi
			2:
            Escribir "Documento de texto seguro" 
			De Otro Modo:
            Escribir "Extensión no reconocida" 
		FinSegun
FinAlgoritmo