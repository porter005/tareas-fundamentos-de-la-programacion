package fundamentos_de_la_programacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;

public class producto_integrador {
	
	static String[][] productos;
	static String ventas[][]; 
	static int tamventas = 100; 

	public static String MostrarMenu(String[] opciones) {             
		String cadena = ""; 
		for (String info : opciones) { 
			cadena = cadena + info + "\n"; 
		}
		return cadena; 
	}

	public static boolean EsNumeroEntero(String dato) {
		for (char c : dato.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	public static boolean EsNumeroDouble(String dato) {
		boolean valido = false;
		for (char c : dato.toCharArray()) {
			if (!Character.isDigit(c)) {
				if (c == '.' && !valido) {
					valido = true;
				} else {
					return false;
				}
			}
		}
		return valido;
	}

	public static boolean EvaluarNumerico(String dato, int tipo) {
		boolean valido = false;
		switch (tipo) {
			case 1:
				valido = EsNumeroEntero(dato);
				break;
			case 2: 
				valido = EsNumeroDouble(dato);
				break;
		}
		return valido;
	}

	public static String Dialogo(String texto) throws IOException { 
		String cadena; 
		System.out.println(texto + " : "); 
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in)); 
		cadena = lectura.readLine(); 
		return cadena; 
	}

	public static String Leer(String texto) throws IOException { 
		String cadena = ""; 
		cadena = Dialogo(texto); 
		if (cadena != null) { 
			cadena = cadena.trim(); 
			if (cadena.isEmpty())
				cadena = null;
		} else {
			cadena = null; 
		}
		return cadena; 
	}

	public static String DesplegarMenu(String Titulo1, String[] menu) throws IOException { 
		String cadena; 
		cadena = Titulo1 + "\n\n"; 
		cadena = cadena + MostrarMenu(menu);
		cadena = cadena + "\n Que opcion deseas "; 
		return Dialogo(cadena);
	}

	public static String RellenarEspacios(String dato, int tamano) { 
		return String.format("%1$-" + tamano + "s", dato); 
	}

	public static String Fecha() {
		Date fechaObj = new Date();
		SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
		return formatodia.format(fechaObj);
	}

	public static String IdTicketSiguiente(String idticket) {
		String idticketnext = "";
		int num = Integer.parseInt(idticket) + 1;
		if (num < 10) { 
			idticketnext = "00" + String.valueOf(num).trim(); 
		} else if ((num > 9) && (num < 100)) { 
			idticketnext = "0" + String.valueOf(num).trim(); 
		} else {
			idticketnext = String.valueOf(num).trim(); 
		}
		return idticketnext;
	}
	
	public static int ObtenerUltimaPosicion(String[][] matriz) {
		int ultimaPosicion = -1; 
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][0] != null && !matriz[i][0].isEmpty()) {
				ultimaPosicion = i; 
			}
		}
		return ultimaPosicion; 
	}
	
	public static String[][] CargarProductos() {
		String[][] producto = {
			{ "001", "Expreso", "40", "10" },
			{ "002", "Expreso doble", "40", "10" },
			{ "003", "Expreso cortado", "40", "10" },
			{ "004", "Expreso macchiato caramelo", "40", "10" },
			{ "005", "Expreso americano Med", "49", "10" },
			{ "006", "Expreso americano Gde", "52", "10" },
			{ "007", "Capuchino Med", "65", "10" },
			{ "008", "Capuchino Gde", "69", "10" },
			{ "009", "Latte Med", "65", "10" },
			{ "010", "Latte Gde", "69", "10" },
			{ "011", "Macchiato caramelo Med", "72", "10" },
			{ "012", "Macchiato caramelo Gde", "74", "10" },
			{ "013", "Lechero Med", "63", "10" },
			{ "014", "Lechero Gde", "69", "10" },
			{ "015", "Chocolate mexicano Med", "60", "10" },
			{ "016", "Chocolate mexicano Gde", "69", "10" },
			{ "017", "Chocolate blanco Med", "72", "10" },
			{ "018", "Chocolate blanco Gde", "74", "10" },
			{ "019", "Cafe viernes Med", "72", "10" },
			{ "020", "Cafe viernes Gde", "79", "10" },
			{ "021", "Beso de angel Med", "65", "10" },
			{ "022", "Beso de angel Gde", "69", "10" },
			{ "023", "Pay de queso con fresas", "65", "10" },
			{ "024", "Pay de limon", "65", "10" },
			{ "025", "Pay de zanahoria", "65", "10" },
			{ "026", "Pastel de chocolate", "70", "10" },
			{ "027", "Pay de platano", "65", "10" },
			{ "028", "Pay de manzana", "65", "10" }
		};
		return producto;
	} 		
	
	public static String MostrarProducto(String[] vproducto) { 
		String codigo = RellenarEspacios(vproducto[0], 6); 
		String producto = RellenarEspacios(vproducto[1], 30); 
		String precio = RellenarEspacios(vproducto[2], 10); 
		String cantidad = RellenarEspacios(vproducto[3], 10);
		return codigo.concat(producto + precio + cantidad); 
	}

	public static String MostrarListaCompleta(String[][] vproductos) { 
		String salida = "";
		for (int ciclo = 0; ciclo < vproductos.length; ciclo++) { 
			String[] vproducto = {vproductos[ciclo][0], vproductos[ciclo][1], vproductos[ciclo][2], vproductos[ciclo][3]}; 
			String cadena = MostrarProducto(vproducto); 
			salida = salida.concat(cadena + "\n"); 
		} 
		return salida; 
	}

	public static String FiltrarPorRango(String[][] vproductos, int inicio, int fin) {
		String salida = "";
		for (int i = inicio; i <= fin; i++) {
			int existencia = Integer.parseInt(vproductos[i][3]);
			if (existencia > 0) {
				String[] vproducto = {vproductos[i][0], vproductos[i][1], vproductos[i][2], vproductos[i][3]};
				salida = salida.concat(MostrarProducto(vproducto) + "\n");
			}
		}
		return salida;
	}

	public static int ExisteProducto(String codigo, String[][] vproductos) {
		int enc = -1;
		int pos = 0;
		int tam = vproductos.length;
		for (int ciclo = 0; ciclo < tam; ciclo++) {
			if (vproductos[ciclo][0].compareTo(codigo.trim()) == 0) {
				enc = pos;
			}
			pos++;
		}
		return enc;
	}

	public static void ModificarProducto(String[][] vproductos) throws IOException {
		String codigo, precio;
		int posicion;
		String info = MostrarListaCompleta(vproductos);
		codigo = Leer(info + "\nIntroduce el codigo del producto a modificar");
		if (codigo != null) {
			posicion = ExisteProducto(codigo, vproductos);
			if (posicion > -1) {
				String[] vproducto = {vproductos[posicion][0], vproductos[posicion][1], vproductos[posicion][2], vproductos[posicion][3]};
				precio = Leer("\nIntroduce el precio de " + MostrarProducto(vproducto) + " ");
				if (precio != null) {
					if (EvaluarNumerico(precio, 2) || EvaluarNumerico(precio, 1))
						vproductos[posicion][2] = precio;
					else
						System.out.println("no es un valor numerico");  
				} else {
					System.out.println(" dato nulo");
				} 
			} else {
				System.out.println("no existe el codigo");
			} 
		} else {
			System.out.println(" dato nulo");
		}
	}
	
	public static void MenuProductos(String[][] vproductos) throws IOException {
		String[] datosmenuproductos = { "1.-Modificar ", "2.-Listado ", "3.-Salida " }; 
		String opcion = "0"; 
		do {
			opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos); 
			if (opcion == null) {
				System.out.println("opcion incorrecta ");
			} else {
				switch (opcion) { 
					case "1": ModificarProducto(vproductos); break; 
					case "2": System.out.println(MostrarListaCompleta(vproductos)); break; 
					case "3": System.out.println("Salida del Sistema "); break; 
					default: System.out.println("No existe esta opcion "); break; 
				} 
			}
		} while (opcion.compareTo("3") != 0); 
	}

	public static String[][] CrearVenta() {
		return new String[tamventas][5];
	}

	public static String UltimoTicket(int pos, String[][] mventa) {
		String idticket = "000"; 
		if (pos > -1) { 
			idticket = mventa[pos][0]; 
		}
		return idticket; 
	}

	public static String[][] CrearTicket() {
		return new String[20][4];
	}	
	
	public static int ExisteTicketCodigo(String[][] mticket, String codigo) {
		int enc = -1; 
		int pos = ObtenerUltimaPosicion(mticket); 
		for (int ciclo = 0; ciclo <= pos; ciclo++) {
			if (mticket[ciclo][0].compareTo(codigo.trim()) == 0) {
				enc = ciclo; 
				return enc; 
			}
		}
		return enc; 
	}

	public static boolean InsertarProductoTicket(String[][] mticket, String[] datos, int tamticket) {
		boolean sucedio = true; 
		int posticket = ObtenerUltimaPosicion(mticket); 
		int enc = ExisteTicketCodigo(mticket, datos[0]); 

		if (posticket < tamticket) { 
			if (enc > -1) { 
				int cantidadactual = Integer.parseInt(mticket[enc][3]); 
				mticket[enc][3] = String.valueOf(cantidadactual + 1); 
			} else { 
				posticket++; 
				mticket[posticket][0] = datos[0]; 
				mticket[posticket][1] = datos[1]; 
				mticket[posticket][2] = datos[2]; 
				mticket[posticket][3] = datos[3]; 
			}
		} else {
			sucedio = false; 
		}
		return sucedio; 
	}
		
	public static String TotalProducto(String precio, String cantidad) {
		double total = Double.parseDouble(precio) * Double.parseDouble(cantidad); 
		return String.format(Locale.US, "%.2f", total); 
	}

	public static String MostrarProductoTicket(String[][] mticket, int pos) {
		String codigo = RellenarEspacios(mticket[pos][0], 6); 
		String producto = RellenarEspacios(mticket[pos][1], 30); 
		String precio = RellenarEspacios(mticket[pos][2], 10); 
		String cantidad = RellenarEspacios(mticket[pos][3], 5); 
		String totalproducto = RellenarEspacios(TotalProducto(mticket[pos][2], mticket[pos][3]), 10); 
		return codigo.concat(producto + precio + cantidad + totalproducto); 
	}
	
	public static String MostrarTicket(String[][] mticket) {
		String salida = "";
		int pos = ObtenerUltimaPosicion(mticket); 
		for (int ciclo = 0; ciclo <= pos; ciclo++) {
			salida = salida.concat(MostrarProductoTicket(mticket, ciclo) + "\n"); 
		}
		return salida; 
	}

	public static double SubTotalTicket(String[][] mticket) {
		double subtotal = 0;
		int pos = ObtenerUltimaPosicion(mticket); 
		for (int ciclo = 0; ciclo <= pos; ciclo++) {
			subtotal = subtotal + Double.parseDouble(TotalProducto(mticket[ciclo][2], mticket[ciclo][3])); 
		}
		return subtotal; 
	}

	public static double IvaTicket(String[][] mticket) {
		double subtotal = SubTotalTicket(mticket); 
		if (subtotal > 0) {
			subtotal = 0.16 * subtotal; 
		} else {
			subtotal = -1; 
		}
		return subtotal; 
	}

	public static double TotalTicket(String[][] mticket) {
		double total = SubTotalTicket(mticket); 
		if (total > 0) {
			total = IvaTicket(mticket) + total; 
		}
		return total; 
	}

	public static String MostrarTicketVenta(String[][] mticket, String idticket, String fechaDia) {
		String salida = "";
		String subtotal = String.format(Locale.US, "%.2f", SubTotalTicket(mticket)); 
		String iva = String.format(Locale.US, "%.2f", IvaTicket(mticket)); 
		String total = String.format(Locale.US, "%.2f", TotalTicket(mticket)); 
		salida = "Fecha " + fechaDia + " Ticket No." + idticket; 
		salida = salida + "\n" + MostrarTicket(mticket); 
		salida = salida + "\n \n El total sin iva " + subtotal; 
		salida = salida + "\n el iva total es " + iva; 
		salida = salida + "\n el total de la venta fue " + total; 
		return salida; 
	}

	public static void CapturaVentaProducto(String[][] mticket, String[][] mproductos, String idticket, int tamticket) throws IOException {
		String subopcion = "";
		do {
			String[] menuSecciones = { "1.-Cafes", "2.-Postres", "3.-Terminar seleccion" };
			subopcion = DesplegarMenu("Hola Como estas, Que es lo que desea", menuSecciones);
			
			if (subopcion != null) {
				if (subopcion.equals("1")) {
					String subcafes = "";
					do {
						String[] menuCafes = { "1.-Especialidades Cargadas", "2.-Especialidades Calientes", "3.-Regresar" };
						subcafes = DesplegarMenu("Seccion de Cafes", menuCafes);
						
						if (subcafes != null) {
							if (subcafes.equals("1")) {
								String info = FiltrarPorRango(mproductos, 0, 3);
								ProcesarSeleccionCodigo(info, mticket, mproductos, tamticket);
							} else if (subcafes.equals("2")) {
								String info = FiltrarPorRango(mproductos, 4, 21);
								ProcesarSeleccionCodigo(info, mticket, mproductos, tamticket);
							}
						}
					} while (subcafes != null && !subcafes.equals("3"));
					
				} else if (subopcion.equals("2")) {
					String info = FiltrarPorRango(mproductos, 22, 27);
					ProcesarSeleccionCodigo(info, mticket, mproductos, tamticket);
				}
			}
		} while (subopcion != null && !subopcion.equals("3"));
	}

	public static void ProcesarSeleccionCodigo(String listado, String[][] mticket, String[][] mproductos, int tamticket) throws IOException {
		String codigo = Leer(listado + "\nIntroduce el codigo del producto");
		if (codigo != null) {
			int posp = ExisteProducto(codigo.trim(), mproductos);
			if (posp > -1) {
				if (Integer.parseInt(mproductos[posp][3]) > 0) {
					int cant = Integer.parseInt(mproductos[posp][3]) - 1;
					mproductos[posp][3] = String.valueOf(cant);
					
					String[] venta = new String[4];
					venta[0] = mproductos[posp][0];
					venta[1] = mproductos[posp][1];
					venta[2] = mproductos[posp][2];
					venta[3] = "1";
					
					if (!InsertarProductoTicket(mticket, venta, tamticket)) {
						System.out.println("el Arreglo esta lleno \n");
					}
				} else {
					System.out.println("no hay productos para venta");
				}
			} else {
				System.out.println("el codigo no existe no se puede agregar\n");
			}
		} else {
			System.out.println("dato nulo\n");
		}
	}

	public static void RemoverProductoTicket(String[][] mticket, int pos) {
		int tam = ObtenerUltimaPosicion(mticket); 
		if (tam > pos) {
			for (int i = pos; i < tam + 1; i++) {
				mticket[i] = mticket[i + 1];
			}
			mticket[tam][0] = null; 
		} else {
			mticket[pos][0] = null; 
		}
	}

	public static void EliminarProductoTicket(String[][] mticket, int pos) {
		int cantidad = Integer.parseInt(mticket[pos][3]); 
		if (cantidad > 1) {
			mticket[pos][3] = String.valueOf(cantidad - 1); 
		} else {
			RemoverProductoTicket(mticket, pos); 
		}
	}

	public static void Eliminar(String[][] mticket, String[][] mproductos) throws IOException {
		String codigo, info;
		info = MostrarTicket(mticket); 
		codigo = Leer(info + "\nIntroduce el codigo del producto a eliminar"); 
		if (codigo != null) {
			int pos = ExisteTicketCodigo(mticket, codigo); 
			if (pos > -1) {
				int posproducto = ExisteProducto(codigo, mproductos); 
				String nuevacantidad = String.valueOf((Integer.valueOf(mproductos[posproducto][3]) + 1)); 
				mproductos[posproducto][3] = nuevacantidad; 
				EliminarProductoTicket(mticket, pos); 
			}
		} else {
			System.out.println("dato nulo"); 
		}
	}

	public static void AgregarProductoAVenta(String[][] mticket, String[][] mventa, String idticket) {
		int posventas = ObtenerUltimaPosicion(mventa); 
		int posticket = ObtenerUltimaPosicion(mticket); 
		for (int i = 0; i <= posticket; i++) {
			if (mticket[i][0] != null) { 
				posventas++; 
				mventa[posventas][0] = idticket; 
				mventa[posventas][1] = mticket[i][0]; 
				mventa[posventas][2] = mticket[i][1]; 
				mventa[posventas][3] = mticket[i][2]; 
				mventa[posventas][4] = mticket[i][3]; 
			}
		}
	}

	public static void Pagar(String idticket, String[][] mventa, String[][] mticket) {
		int posventas = ObtenerUltimaPosicion(mventa); 
		int post = ObtenerUltimaPosicion(mticket); 

		if ((posventas + post) < 100) {
			AgregarProductoAVenta(mticket, mventa, idticket); 
		} else {
			System.out.println("Desbordamiento de Memoria de ventas"); 
		}
	}

	public static void DevolucionTicket(String[][] mticket, String[][] mproductos) {
		int posmticket = ObtenerUltimaPosicion(mticket); 

		for (int pos = 0; pos <= posmticket; pos++) {
			String codigo = mticket[pos][0]; 
			int posp = ExisteProducto(codigo.trim(), mproductos); 
			if (posp > -1) { 
				int cant = Integer.parseInt(mticket[pos][3]) + Integer.parseInt(mproductos[posp][3]); 
				mproductos[posp][3] = String.valueOf(cant); 
			}
		}
	}

	public static void MenuPuntoVenta(String[][] ventas, String idticket, String[][] productos) throws IOException {
		String opcion, membrete;
		Boolean pago = false; 
		int tamticket = 50; 
		String[][] Vticket = new String[tamticket][4]; 

		idticket = IdTicketSiguiente(idticket);
		String fechadia = Fecha();
		opcion = "";

		do {
			membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket;
			membrete = membrete + "\n-----------------------------------------------------\n";

			String Tickettexto = MostrarTicket(Vticket).trim();
			if (!Tickettexto.trim().isEmpty()) {
				membrete = membrete + "\n" + Tickettexto + "\n";
			}

			// Modificado: Se eliminó la opción "3.-Listado"
			String[] datosmenu = { "1.-Agregar  ", "2.-Eliminar ", "3.-Pagar ", "4.-Salida " };
			opcion = DesplegarMenu(membrete + "\n Menu de Punto de Venta", datosmenu);

			if (opcion == null) {
				System.out.println("dato incorrecto introducido");
			} else {
				switch (opcion) {
					case "1":
						CapturaVentaProducto(Vticket, productos, idticket, tamticket);
						break;
					case "2":
						Eliminar(Vticket, productos);
						break;
					case "3":
						System.out.println(MostrarTicketVenta(Vticket, idticket, fechadia).trim());
						Pagar(idticket, ventas, Vticket);
						pago = true;
						
						String[] opcionesFinales = { "1.-Volver al inicio (Modificar/Stock)", "2.-Finalizar programa" };
						String seleccionFinal = DesplegarMenu("¡Gracias por su compra!\n¿Que desea hacer ahora?", opcionesFinales);
						
						if (seleccionFinal != null && seleccionFinal.equals("2")) {
							System.out.println("\n¡Vuelva pronto!");
							System.exit(0); 
						}
						opcion = "4"; // Cambiado a 4 para romper el ciclo y salir correctamente
						break;
					case "4":
						System.out.println("Salida del Ventas ");
						if (!pago) {
							System.out.println("No pago el ticket ");
							DevolucionTicket(Vticket, productos);
							System.out.println("eliminando ticket " + idticket);
						}
						break;
					default:
						System.out.println("No existe esta opcion");
						break;
				} 
			}
		} while (opcion.compareTo("4") != 0); // Cambiado a 4 el límite del ciclo
	}
	
	public static String MostrarVenta(String[] venta) {
		String idticket = RellenarEspacios(venta[0], 6); 
		String codigo = RellenarEspacios(venta[1], 5); 
		String producto = RellenarEspacios(venta[2], 30); 
		String precio = RellenarEspacios(venta[3], 10); 
		String cantidad = RellenarEspacios(venta[4], 10); 
		return idticket.concat(codigo + producto + precio + cantidad); 
	}

	public static String MostrarListaVentas(String[][] ventas) {
		int posventas = ObtenerUltimaPosicion(ventas); 
		String salida = "";
		for (int ciclo = 0; ciclo <= posventas; ciclo++) {
			String[] venta = { ventas[ciclo][0], ventas[ciclo][1], ventas[ciclo][2], ventas[ciclo][3], ventas[ciclo][4] };
			salida = salida.concat(MostrarVenta(venta) + "\n"); 
		}
		return salida; 
	}

	public static void AgregarStock(String[][] vproductos) throws IOException {
		String codigo, cantidad;
		int posicion;
		String info = MostrarListaCompleta(vproductos);
		codigo = Leer(info + "\nIntroduce el codigo del producto a modificar");
		if (codigo != null) {
			posicion = ExisteProducto(codigo, vproductos);
			if (posicion > -1) {
				String[] vproducto = {vproductos[posicion][0], vproductos[posicion][1], vproductos[posicion][3], ""};
				cantidad = Leer("\nIntroduce la Cantidad de Stock a Agregar" + MostrarProducto(vproducto) + " ");
				if (cantidad != null) {
					if (EvaluarNumerico(cantidad, 2) || EvaluarNumerico(cantidad, 1)) {        
						String nuevacantidad = String.valueOf((Integer.valueOf(cantidad) + Integer.valueOf(vproducto[2]))); 
						vproductos[posicion][3] =  nuevacantidad;
					} else {
						System.out.println("no es un valor numerico");  
					}
				} else {
					System.out.println(" dato nulo");
				} 
			} else {
				System.out.println("no existe el codigo") ; 
			} 
		} else {
			System.out.println(" dato nulo");
		}
	}

	public static void MenuInventario(String[][] vproductos) throws IOException { 
		String[] datosmenuinventario = { "1.-Listado ", "2.-Agregar ", "3.-Salida " }; 
		String opcion = "0"; 
		do {
			opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario); 
			if (opcion == null)
				System.out.println("opcion incorrecta ");
			else 
				switch (opcion) { 
					case "1": System.out.println(MostrarListaCompleta(vproductos)); break; 
					case "2": AgregarStock(vproductos); break; 
					case "3": System.out.println("Salida del Sistema "); break; 
					default: System.out.println("No existe esta opcion "); break; 
				} 
		} while (opcion.compareTo("3") != 0); 
	}

	public static void MenuPrincipal(String[][] vproductos, String[][] vventas) throws IOException { 
		String[] datosmenuprincipal = { "1.-Productos ", "2.-Punto de Venta ", "3.- Inventario", "4.-Ventas", "5.-Salida " }; 
		String opcion = "0"; 
		String idticket;
		do {
			idticket = ObtenerUltimoValorVentas(vventas); 
			opcion = DesplegarMenu("Menu de Punto de Shingu Coffee Shop", datosmenuprincipal); 
			if (opcion == null) {
				System.out.println("opcion incorrecta ");
			} else {
				switch (opcion) { 
					case "1": MenuProductos(vproductos); break; 
					case "2": MenuPuntoVenta(vventas, idticket, vproductos); break; 
					case "3": MenuInventario(vproductos); break;
					case "4": System.out.println(MostrarListaVentas(vventas)); break;
					case "5": System.out.println("Salida del Sistema "); break; 
					default: System.out.println("No existe esta opcion "); break; 
				} 
			}
		} while (opcion.compareTo("5") != 0); 
	}

	public static String ObtenerUltimoValorVentas(String[][] ventas) {
		int ultimaposicion = ObtenerUltimaPosicion(ventas); 
		String ultimoValor = "000"; 
		if (ultimaposicion >= 0) {
			ultimoValor = ventas[ultimaposicion][0]; 
		}
		return ultimoValor; 
	}
	
	public static void main(String[] args) throws IOException {
		productos = CargarProductos();
		ventas = CrearVenta(); 
		MenuPrincipal(productos, ventas);
	}	
}