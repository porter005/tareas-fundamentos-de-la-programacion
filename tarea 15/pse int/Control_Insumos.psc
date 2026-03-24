Algoritmo Control_Insumos
    Definir op, nmanodeobra, nmateriales, nservicios, nmaquinaria Como Entero
    Definir vmanodeobra, vmateriales, vservicios, vmaquinaria Como Real
    Definir tmanodeobra, tmateriales, tservicios, tmaquinaria Como Real
    Definir seguir Como Caracter
    
    tmanodeobra<-0; tmateriales<-0; tservicios<-0; tmaquinaria<-0
    nmanodeobra<-0; nmateriales<-0; nservicios<-0; nmaquinaria<-0
    
    Repetir
        Escribir "--- CONTROL DE INSUMOS ---"
        Escribir "1.- Mano de Obra (Total: ", tmanodeobra, " Concepts: ", nmanodeobra, ")"
        Escribir "2.- Materiales"
        Escribir "3.- Servicios"
        Escribir "4.- Maquinaria"
        Escribir "5.- Salida"
        Leer op
        
        Segun op Hacer
            1:
                Repetir
                    nmanodeobra <- nmanodeobra + 1
                    Escribir "Valor del concepto ", nmanodeobra, ":"
                    Leer vmanodeobra
                    tmanodeobra <- tmanodeobra + vmanodeobra
                    Escribir "¿Agregar otro concepto de Mano de Obra? (s/n)"
                    Leer seguir
                Hasta Que seguir <> 's' Y seguir <> 'S'
				// Estructura similar para las otras opciones (2, 3, 4) según el PDF
            5: Escribir "Saliendo del sistema..."
        FinSegun
    Hasta Que op = 5
FinAlgoritmo