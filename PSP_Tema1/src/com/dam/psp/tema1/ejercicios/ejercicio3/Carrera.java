package com.dam.psp.tema1.ejercicios.ejercicio3;

/*
 * Ejercicio 3. Carrera (versiones 1 y 2)
 *
 * En este ejercicio vamos a realizar un experimento: si lanzamos 8 hilos que realizan 
 * la misma tarea, y el planificador le asigna el mismo tiempo de ejecuci�n a cada uno, 
 * deber�a finalizar primero el primer hilo que se lanz�, y as� sucesivamente, �no?. 
 * Lo comprobaremos de la siguiente forma: supongamos que tendremos una carrera del gran premio de 
 * atletismo (la de 1500 metros). 
 * 
 * Tendremos que crear la clase corredor, que tendr� que implementar un bucle que 
 * cuente desde 0 a 1500 (una iteraci�n por metro recorrido). 
 * Cuando finalice el bucle, deber� mostrar un mensaje por pantalla indicando el 
 * nombre del corredor y que ha finalizado (El corredor Ferm�n Cacho ha finalizado la prueba).
 * 
 * Como versi�n 2 de este ejercicio, tendremos que generalizarlo, para poder ejecutarlo al menos 
 * 50 veces seguidas, para comprobar si el orden de finalizaci�n es siempre el mismo.
 * 
 * NOTA: Si los corredores realizan la carrera muy r�pido, se puede introducir, dentro del bucle, 
 * un peque�o lapso de tiempo (5 o 10 ms) de sue�o, mediante el uso del m�etodo sleep.
 *
 * @author Luis Miguel L�pez Maga�a
 *
 */

public class Carrera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos un array con los ocho corredores
		String[] corredores = { "Hicham El Guerrouj", "Noah Ngeny",
				"Mohamed Farah", "Bernard Lagat", "Rashid Ramzi",
				"Ryan Gregson", "Ferm�n Cacho", "Teddy Flack" };

		// Instanciamos y lanzamos los ocho corredores
		for (int i = 0; i < corredores.length; i++) {
			new Thread(new Corredor(corredores[i])).start();
		}

	}

}
