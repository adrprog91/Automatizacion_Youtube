package po;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import comun.Funciones;

/**
 * Autor: Adri�n Abril
 * 
 * Descripci�n: pageObject correspondiente a la p�gina del login.
 */

public class Login {
	
	/**
	 * *************
	 * VARIABLES
	 * *************
	**/
	WebDriver driver;
	Funciones funciones;
	Properties propLogin, datosGenerales;
	
	
	/**
	 * *************
	 * IDENTIFICADORES
	 * *************
	**/
		//Btn
			By idBtnSiguiente;
			By xpathBtnSiguienteContrasena;
	
		//Txt
			By idTxtUsuario;
			By nameTxtContrasena;
	
	
	/**
	 * *************
	 * CONSTRUCTOR
	 * *************
	**/
	public Login(WebDriver driver) throws Exception {
		this.driver = driver;
		this.funciones = new Funciones(driver);
		this.propLogin = funciones.getArchivoProperties("idesLogin");
		this.datosGenerales = funciones.getArchivoProperties("datosGenerales");
		inicializarIdentificadores();
	}
	
	
	/**
	 * *************
	 * CONSTRUCTOR
	 * *************
	**/	
	
	/**
	 * Realiza el login
	 */
	public void doLogin() throws Exception {
		try {
			
			// 1. Rellena el campo "Correo electr�nico o tel�fono"
			funciones.setTxt(idTxtUsuario, datosGenerales.getProperty("usuario"));
			System.out.println("Se rellena el campo de texto 'Correo electr�nico o tel�fono'");
			
			// 2. Pulsa el bot�n "Siguiente"
			funciones.clickElemento(idBtnSiguiente);
			System.out.println("Se pulsa el bot�n 'Siguiente'");
			
			// 3. Rellena el campo "Contrase�a"
			funciones.setTxt(nameTxtContrasena, datosGenerales.getProperty("contrasena"));
			System.out.println("Se rellena el campo de texto 'Contrase�a'");
			
			// 2. Pulsa el bot�n "Siguiente"
			funciones.clickElemento(xpathBtnSiguienteContrasena);
			System.out.println("Se pulsa el bot�n 'Siguiente'");
			
		} catch (Exception e) {
			throw new Exception("No se ha podido realizar el login");
		}
		
			
	}
	
	/**
	 * Inicializa los identificadores correspondientes a �ste pageObject
	 */
	private void inicializarIdentificadores() {
		//Txt
			idTxtUsuario = By.id(propLogin.getProperty("idTxtUsuario"));
			nameTxtContrasena = By.name(propLogin.getProperty("nameTxtContrasena"));
		//Btn
			idBtnSiguiente = By.id(propLogin.getProperty("idBtnSiguiente"));
			xpathBtnSiguienteContrasena = By.xpath(propLogin.getProperty("xpathBtnSiguienteContrasena"));
	}
	
}
