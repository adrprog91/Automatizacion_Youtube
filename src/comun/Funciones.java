package comun;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Autor: Adrián Abril
 * 
 * Descripción: Clase creada para realizar distintos tipos de funciones generales que serán usadas en distintas clases.
 * 				Ejemplos:
 * 					- Pulsar un elemento
 * 					- Rellenar campos de formularios
 * 					- Obtener un archivo properties
 * 					- etc...
 *
 */

public class Funciones {

	/**
	 * *************
	 * VARIABLES
	 * *************
	**/
	WebDriver driver;
	FileInputStream fileInput;
	File file;
	Properties prop;
	BusquedaElementos buscar;
	
	
	
	/**
	 * *************
	 * CONSTRUCTORES
	 * *************
	**/
	public Funciones(WebDriver driver) {
		this.driver = driver;
		this.buscar = new BusquedaElementos(this.driver);
	}
	
	public Funciones() {}
	
	
	
	/**
	 * *************
	 * MÉTODOS
	 * *************
	**/
	
	/**
	 * Obtiene un archivo properties
	 */
	public Properties getArchivoProperties(String nombre) throws Exception {
		file = new File("Recursos//Properties//"+nombre+".properties");
		fileInput = new FileInputStream(file);
		prop = new Properties();
		prop.load(fileInput);
		return prop;
	}
	
	/**
	 * Pulsa un elemento
	 */
	public void clickElemento(By identificador) throws Exception {
		try {
			buscar.elementoClickable(identificador).click();
		} catch (Exception e) {
			throw new Exception("No se ha podido clickear el elemento");
		}
	}
	
	
	
	
	
	
}
