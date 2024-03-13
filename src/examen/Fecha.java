package examen;
/**
 *@author Diego López
 *@version 1.0 
 *
 *Esta clase devolverá la fecha que introduzca el usuario
 */
public class Fecha {
	/**
	 * variable local sin inicializar que indica la fecha que va a devolver el programa en función de lo que el usuario introduzca
	 */
	public static boolean fechaValida;
	/**
	 * Método que recibe como parámetros el dia el mes y el año y devuelve false si son incorrectos los datos o la fecha en caso de que sea correcta
	 * @param anio el usuario deberá introducir el año como parámetro
	 * @param mes anio el usuario deberá introducir el mes como parámetro
	 * @param dia anio el usuario deberá introducir el día como parámetro
	 * @return devolverá false si son incorrectos los datos o la fecha en caso de que los datos sean correctos
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}