package com.dam.psp.tema1.ejercicios.ejercicio6;

public class Carrera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] equipo1 = {"Andrew Valmon", "Quincy Watts", "Butch Reynolds", "Michael Johnson"};
		String[] equipo2 = {"Andre Morris","Dameon Johnson","Deon Minor","Milton Campbell"};
		String[] equipo3 = {"Tatyana Ledovskaya (BLR)","Olga Nazarova (RUS)","Mariya Pinigina (UKR)","Olga Bryzgina (UKR)"};
		String[] equipo4 = {"Yuliya Gushchina","Olga Kotlyarova","Olga Zaytseva","Olesya Krasnomovets"};
		String[] equipo5 = {"Adri� Burriel Guerrero","�scar Husillos Domingo","Iv�n Jes�s Ramos Fopiani","Sergio Ruiz Serrano"};
		String[] equipo6 = {"Kevin L�pez Yerga","Luis Alberto Marco Contreras","Alejandro Rodr�guez Pritchard","Francisco Rold�n Mart�nez"};
		String[] equipo7 = {"Carlos Alonso Garc�a","Alberto Imedio Baladr�n","Adel Mechaal Mechaal","�lvaro Rodr�guez Melero"};
		String[] equipo8 = {"Luis Miguel L�pez Maga�a","Miguel Campos Rivera","Rafael Villar Li��n","Jes�s Casanova Dom�nguez"};

		
		new Thread(new EquipoRelevos(equipo1, "Calle 1")).start();
		new Thread(new EquipoRelevos(equipo2, "Calle 2")).start();
		new Thread(new EquipoRelevos(equipo3, "Calle 3")).start();
		new Thread(new EquipoRelevos(equipo4, "Calle 4")).start();
		new Thread(new EquipoRelevos(equipo5, "Calle 5")).start();
		new Thread(new EquipoRelevos(equipo6, "Calle 6")).start();
		new Thread(new EquipoRelevos(equipo7, "Calle 7")).start();
		new Thread(new EquipoRelevos(equipo8, "Calle 8")).start();
		
		
		
		
		
		
	}

}
