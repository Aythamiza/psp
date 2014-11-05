package com.dam.psp.tema1.ejercicios.ejercicio4;

import java.util.List;


/*
 * Ejercicio 4. Mejor de la clase GeneraVector
 *
 * Mejorar la clase GeneraVector proporcionada en el repositorio (a�adiendo otro m�todo con firma 
 * similar, llamado generaConThread) para que dicha generaci�n de valores tambi�n se realice usando 
 * varios hilos en paralelo.
 * 
 * Se utilizar� un n�mero fijo de hilos (usar para ello una constante), que en nuestro caso ser�n 3.
 * 
 * Testear este nuevo m�todo a trav�s de una clase que implemente el m�todo main y reciba el n�mero 
 * de elementos a generar a trav�s de la l�nea de argumentos.
 *
 * @author Luis Miguel L�pez Maga�a
 *
 */

public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 1) {
			System.err.println("Error en la sintaxis. java Ejercicio4 <num_elementos>");
		} else {
			int n_elementos;
			try {
				n_elementos = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				n_elementos = 100;
			}
			
			List<Integer> lista = GeneraVector.generaVectorConThread(n_elementos);
			
			for(Integer i : lista) {
				System.out.println(i.toString());
			}
			
			
		}
		
		
		
	}

}
