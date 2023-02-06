package utils;

public class Utils {
	public static int busquedaSecuencial(int tabla[], int valor) {
		// En este índice almacenaremos el índice en el que se encuentre el elemento
		// buscado
		int indiceBusqueda = 0;

		//Mientras no encontremos el valor y no hayamos llegado al final de la tabla
		// incrementamos en 1 el índice de búsqueda
		while (indiceBusqueda < tabla.length && valor != tabla[indiceBusqueda]) {
			indiceBusqueda++;
		}

		// Mensaje de error por si no hay el elemento pedido
		if (indiceBusqueda >= tabla.length) {
			indiceBusqueda = -1;
		}

		return indiceBusqueda;
	}
	//Funcion basica
	public static int busquedaSecuencialBasica(int tabla[], int valor) {
		int indiceBusqueda = 0;
		while (indiceBusqueda < tabla.length && valor != tabla[indiceBusqueda]) {
			indiceBusqueda++;
		}
		return indiceBusqueda;
	}
}