package cl.edutecno;

import cl.edutecno.views.Menu;

public class Main {

	public static void main(String[] args) {
		
		Menu menu = new Menu(); //cuando es estático no es necesario hacer este paso (instanciarlo)
		menu.iniciarMenu();//llamamos a método iniciarMenu de clase Menu 
		
	}

}

