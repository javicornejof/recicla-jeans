package cl.edutecno.views;

import java.util.ArrayList;
import java.util.Scanner;

import cl.edutecno.model.Producto;
import cl.edutecno.services.ArchivoServicio;
import cl.edutecno.services.ProductoServicio;
import cl.edutecno.utility.Utilidades;

public class Menu {

	ProductoServicio ps = new ProductoServicio();//Instancia de productoServicio, para acceder a sus métodos
	//ExportadorTxt exportar = new ExportadorTxt();// igual para acceder a ExportadorTxt y sus métodos
	Utilidades limpiar = new Utilidades();
	ArchivoServicio as = new ArchivoServicio();
	
	public void iniciarMenu() {
	String opcion = ""; 
	
	do {
		
			
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1 Listar Producto");
		System.out.println("2 Cargar datos desde Archivo csv");
		System.out.println("3 Editar datos");
		System.out.println("4 Exportar datos");
		System.out.println("5 Salir");
		System.out.println("Ingrese una opción: ");
		
		
		opcion = sc.nextLine();

		
		
		switch (opcion) {
		case "1":
			ps.listarProducto();
			
			break;
			
		case "2":
		
			System.out.println("Ingrese la ruta donde se encuentra archivo");
			String nombreArchivo = sc.nextLine();
			ArrayList<Producto> listaProducto = as.cargarDatos(nombreArchivo);
			ps.setListaProductos(listaProducto);
			break;
			
		case "3":
//		
			ps.editarProducto();
			
			break;
		case "4":
			System.out.println("Ingrese nombre del archivo");
			String nombreArchivoNuevo = sc.nextLine();
			as.exportarDatos(nombreArchivoNuevo, ps.getListaProductos());//exportar.exportar(nombreArchivo, ps.getListaProductos());
			break;
			
		case "5":
			System.out.println("Saliendo...");
			System.exit(0);//salir
			break;
		default:
			break;	
		}
		
	} while (!(opcion.equals("5")));	
	
	}
	
	
}