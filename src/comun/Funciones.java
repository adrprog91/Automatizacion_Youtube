package comun;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

/**
 * Autor: Adri�n Abril
 * 
 * Descripci�n: Clase creada para realizar distintos tipos de funciones generales que ser�n usadas en distintas clases.
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
 */
	WebDriver driver;
	FileInputStream fileInput;
	File file;
	Properties prop;
	
	
	
/**
 * *************
 * CONSTRUCTORES
 * *************
 */
	public Funciones(WebDriver driver) {
		this.driver = driver;
	}
	
	public Funciones() {}
	
	
	
/**
 * *************
 * M�TODOS
 * *************
 */
	
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
	
	
	
	
	
	
	
}