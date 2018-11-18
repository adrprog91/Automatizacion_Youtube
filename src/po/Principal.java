package po;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import comun.Funciones;

/**
 * Autor: Adri�n Abril
 * 
 * Descripci�n: pageObject correspondiente a la p�gina principal.
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
	 * Acceder a la p�gina del login
	 * 
	 * Descripci�n: Se encarga de pulsar el bot�n "ACCEDER" para acceder a la p�gina del login.
	 */
	public void accederLogin() throws Exception {
		try {
			// 1. Se pulsa el bot�n "ACCEDER"
			funciones.clickElemento(xpathBtnAcceder);
			System.out.println("Se pulsa el bot�n 'ACCEDER'");
			
		} catch (Exception e) {
			throw new Exception("No se ha podido acceder a la p�gina del login");
		}
	}
	
	/**
	 * Inicializa los identificadores correspondientes a �ste pageObject
	 */
	private void inicializarIdentificadores() {
		//btn
			xpathBtnAcceder = By.xpath(prop.getProperty("xpathBtnAcceder"));
			
	}
	
	
	
	
	
	
		
}
