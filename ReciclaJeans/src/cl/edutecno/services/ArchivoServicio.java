package cl.edutecno.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

import cl.edutecno.model.Producto;

public class ArchivoServicio {
	
	
	
	
public  ArrayList<Producto> cargarDatos (String nombreArchivo) {
	
	File archivo = new File ("src/" + nombreArchivo+".csv");
	ArrayList<Producto> listaProductos = new ArrayList<Producto> ();
	
	try {
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader (fr);
		
		String linea = br.readLine();
		
	
		while (linea !=null) {
			
			ArrayList <String> camposProductos = new ArrayList<String>(Arrays.asList(linea.split(",")));
			
			
			//public Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca,
					//String color) {
			Producto producto = new Producto(camposProductos.get(0),camposProductos.get(1), camposProductos.get(2), camposProductos.get(3), camposProductos.get(4), camposProductos.get(5),camposProductos.get(6));
			listaProductos.add(producto);
			linea = br.readLine(); //lectura de la linea siguiente
			
		}
		br.close();
		fr.close();
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return listaProductos;
	
	
}

public void exportarDatos(String nombreArchivo, ArrayList<Producto> listaProductos) {
		
		try {
			String nombreDirectorio = crearDirectorio("directorio"); 
			
			
			File archivo = new File ("src" + File.separator + nombreDirectorio + File.separator + nombreArchivo + ".csv"); //indicarle ruta de archivo
			FileWriter fileWriter = new FileWriter(archivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
			
		if (!archivo.exists()) {
			archivo.createNewFile(); //crear archivo sólo si es que no existe
		}
			for (Producto productoTemp : listaProductos) {
				bufferedWriter.write(productoTemp.toString()); //nos da los datos que lleva el producto
				bufferedWriter.newLine(); //crear línea abajo para escribir datos del siguiente producto
			}
			
			bufferedWriter.close();
			fileWriter.close();
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ocurrió un error al crear el nuevo archivo");
			
		}
		
	}
	
	public static String crearDirectorio(String nombreDirectorio) {
	
		File directorio = new File ("src" + File.separator + nombreDirectorio); //creará directorio
		
		if (!directorio.exists()) {
			directorio.mkdir(); //médoto para crear directorio
			System.out.println("Directorio creado");
					
		} else {
			System.out.println("El directorio ya existe");
		}
	
		return nombreDirectorio; //retorno luego de que método compiló

			
		
		
	}
}
	
	