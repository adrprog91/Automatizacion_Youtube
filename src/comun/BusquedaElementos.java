package comun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Autor: Adrián Abril
 * 
 * Descripción: Crea un timeout para buscar uno o varios elementos visibles, clickables, no visibles, etc...
 * 
 */

public class BusquedaElementos {

	/**
	 * *************
	 * VARIABLES
	 * *************
	**/
	WebDriver driver;
	WebDriverWait wait;
	
	
	
	
	/**
	 * *************
	 * CONSTRUCTOR
	 * *************
	**/
	public BusquedaElementos(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
	}
	
	
	/**
	 * *************
	 * METODOS
	 * *************
	**/
	
	/**
	 * Busca un elemento por identificador que sea clickable y lo devuelve
	 */
	public WebElement elementoClickable(By identificador) throws Exception {
		return wait.until(ExpectedConditions.elementToBeClickable(identificador));
	}
	
	/**
	 * Busca un elemento por identificador que sea visible y lo devuelve
	 */
	public WebElement elementoVisible(By identificador) throws Exception {
		return wait.until(ExpectedConditions.presenceOfElementLocated(identificador));
	}
	
	
}
