package cl.edutecno.utility;

import java.util.concurrent.TimeUnit;

public class Utilidades {
	

	public void limpiarPantalla() {
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println();
			
		}	
		System.out.println("---------");
		
	}
	public void tiempoEspera() {
		
		 int i=5;
		
		while (i>0) {
		System.out.println(".");
		i=i-1;
		
		try {
			TimeUnit.SECONDS.sleep(1);	
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		}
	}
}
