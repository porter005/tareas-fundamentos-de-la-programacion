Algoritmo tarea10_6
    Definir puerto Como Entero    
    // Mini menú informativo
    Escribir "--- Menú de Puertos Sugeridos ---"
    Escribir "[21] FTP"
    Escribir "[22] SSH"
    Escribir "[25] SMTP"
    Escribir "[80/443] Web"
    Escribir "---------------------------------"
    Escribir "Ingrese el número de puerto:"
    Leer puerto
    // Evaluación del protocolo [cite: 44]
    Segun puerto Hacer
        21:
		Escribir "FTP - Transferencia de archivos" 
        22:
		Escribir "SSH - Acceso remoto seguro" 
        25:
		Escribir "SMTP - Envío de correo" 
        80, 443:
		Escribir "Web (HTTP/HTTPS)" 
        De Otro Modo:
		Escribir "Puerto no estándar o desconocido" 
    FinSegun
FinAlgoritmo