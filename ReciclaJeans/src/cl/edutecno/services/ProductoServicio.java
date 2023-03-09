package cl.edutecno.services;

import java.util.ArrayList;
import java.util.Scanner;

import cl.edutecno.model.Producto;


public class ProductoServicio {

	
	private ArrayList<Producto> listaProductos;

	//Constructor estandar ctrl+espacio
	public ProductoServicio() {
		listaProductos = new ArrayList<Producto>(); //inicializamos Arraylist 
	}
	
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public void listarProducto() {
		if (getListaProductos() != null && getListaProductos().size() != 0) { //si lista productos diferente de nullo && diferenge de 0
			for (Producto productoTemp : listaProductos) { //recorrer listaProductos, productoTemp variable temporal que se crea sólo para el arreglo
				System.out.println(productoTemp);
			}
			
		}	else {
			System.out.println("Su lista se encuentra vacía o incompleta");
		}
	}
	
	public void editarProducto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el código del producto que desea editar");
		String codigoSolicitado = sc.nextLine();
		for (Producto productoTemp : listaProductos) {
			if (codigoSolicitado.equals(productoTemp.getCodigo())) {
			
	System.out.println("Ingrese el dato que quiere editar del producto");
	System.out.println("1. nombre Articulo");
	System.out.println("2. codigo");
	System.out.println("3. color del producto");
	System.out.println("4. descripcion del producto");
	System.out.println("5. marca del producto");
	System.out.println("6. precio del producto");
	System.out.println("7. talla del producto");
	System.out.println("8. Salir");
	
	
	 String opcionSeleccionada = sc.nextLine();
	 
	switch (opcionSeleccionada) {
	case "1":
		System.out.println("Ingrese el nuevo nombre");
		String nombre = sc.nextLine();
		productoTemp.setArticulo(nombre);		
		break;
	case "2":
		System.out.println("Ingrese el nuevo codigo");
		String codigoNuevo = sc.nextLine();
		productoTemp.setCodigo(codigoNuevo);
		break;
	case "3":
	System.out.println("Ingrese el nuevo color");
	String color = sc.nextLine();
	productoTemp.setColor(color);
	break;
	
	case "4":
		System.out.println("Ingrese una nueva descripcion del producto");
		String descripcion = sc.nextLine();
		productoTemp.setDescripcion(descripcion);
		break;
	case "5":
		System.out.println("Ingrese una nueva marca del producto");
		String marca = sc.nextLine();
		productoTemp.setMarca(marca);
		break;
	
	case "6":
		System.out.println("Ingrese un nuevo precio del producto");
		String precio = sc.nextLine();
		productoTemp.setPrecio(precio);
	break;
	
	case "7":
		System.out.println("Ingrese una nueva talla del producto");
		String talla = sc.nextLine();
		productoTemp.setTalla(talla);
	break;
	
	case "8":
		System.out.println("Saliendo...");
		System.exit(0);//salir
		break;


	default:
		break;
	}
	
			}
		}
		
	}
	
	public void agregarProducto() {
		Scanner sc = new Scanner (System.in); 
		
		//Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca,
		//String color)

		System.out.println("Ingrese artículo: ");
		String articulo = sc.nextLine(); 
		
		System.out.println("Ingrese precio: ");
		String precio = sc.nextLine(); 
		
		System.out.println("Ingrese descripción: ");
		String descripcion = sc.nextLine(); 
		
		System.out.println("Ingrese código: ");
		String codigo = sc.nextLine(); 
		
		System.out.println("Ingrese talla: ");
		String talla = sc.nextLine(); 
		
		System.out.println("Ingrese marca: ");
		String marca = sc.nextLine(); 
		
		System.out.println("Ingrese color: ");
		String color = sc.nextLine(); 
	
	Producto producto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color); //constructor con parametros
	
		listaProductos.add(producto); //agregamos a la lista listaProductos
		
	
	}
	
	public void editarProductos() {  //recorrer la lista de productos que haya y encontrar los nuevos datos y setearlo mediante el codigo.
	}
	
	
	
}
