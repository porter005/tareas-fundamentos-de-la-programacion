Algoritmo tarea10_7
    Definir codigo, riesgo Como Entero
    Escribir "--- Menú de Acciones del Firewall ---"
    Escribir "1. Permitir"
    Escribir "2. Bloquear"
    Escribir "3. Cuarentena"
    Escribir "Elija una opción (1-3) y luego ingrese nivel de riesgo (1-10):"
    Leer codigo, riesgo
    
    Segun codigo Hacer
        1:
            Si riesgo > 7 Entonces
                Escribir "Advertencia: Tráfico riesgoso permitido"
            Sino
                Escribir "Tráfico seguro"
            FinSi
        2:
            Escribir "Paquete descartado"
        3:
            Escribir "Paquete aislado para análisis"
        De Otro Modo:
            Escribir "Código no válido"
    FinSegun
FinAlgoritmo