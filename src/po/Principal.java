package po;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import comun.Funciones;

/**
 * Autor: Adrián Abril
 * 
 * Descripción: pageObject correspondiente a la página principal.
 */

public class Principal {
	
	/**
	 * *************
	 * VARIABLES
	 * *************
	**/
	WebDriver driver;
	Funciones funciones;
	Properties prop;
		
	/**
	 * *************
	 * IDENTIFICADORES
	 * *************
	**/
	private By xpathBtnAcceder;
		
	/**
	 * *************
	 * CONSTRUCTOR
	 * *************
	**/
	public Principal(WebDriver driver) throws Exception {
		this.driver = driver;
		this.funciones = new Funciones(driver);
		this.prop = funciones.getArchivoProperties("idesPrincipal");
		inicializarIdentificadores();
	}
	
	
	
	/**
	 * *************
	 * CONSTRUCTOR
	 * *************
	**/	
	
	/**
	 * Acceder a la página del login
	 * 
	 * Descripción: Se encarga de pulsar el botón "ACCEDER" para acceder a la página del login.
	 */
	public void accederLogin() throws Exception {
		try {
			// 1. Se pulsa el botón "ACCEDER"
			funciones.clickElemento(xpathBtnAcceder);
			System.out.println("Se pulsa el botón 'ACCEDER'");
			
		} catch (Exception e) {
			throw new Exception("No se ha podido acceder a la página del login");
		}
	}
	
	/**
	 * Inicializa los identificadores correspondientes a éste pageObject
	 */
	private void inicializarIdentificadores() {
		//btn
			xpathBtnAcceder = By.xpath(prop.getProperty("xpathBtnAcceder"));
			
	}
	
	
	
	
	
	
		
}
