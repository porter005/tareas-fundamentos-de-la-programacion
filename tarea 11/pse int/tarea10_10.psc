Algoritmo tarea10_10
    Definir opcion, subopcion Como Entero
    Escribir "--- MENÚ DE HERRAMIENTAS DE RED ---"
    Escribir "1. Escanear Red"
    Escribir "2. Verificar Firewall"
    Escribir "3. Cifrar Mensaje"
    Escribir "4. Salir"
    Leer opcion
    
    Segun opcion Hacer
        1:
		Escribir "Ingrese rango a escanear (>0):" 
            Leer subopcion
            Si subopcion > 0 Entonces
                Escribir "Escaneando..."
            FinSi
        2:
		Escribir "Estado: Activo" 
        3:
		Escribir "Nivel de cifrado (1:César, 2:AES):"
            Leer subopcion
            Si subopcion == 2 Entonces
			Escribir "Cifrado AES" 
            Sino
			Escribir "Cifrado César"
            FinSi
        4:
		Escribir "Cerrando sesión"
    FinSegun
FinAlgoritmo