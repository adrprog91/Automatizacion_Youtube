package comun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Autor: Adrián Abril
 * 
 * Descripción: 
 * 		- Crea el driver
 * 		- Abre el navegador
 * 		- Cierra el navegador y elimina el proceso
 * 		- Navega a la url correspondiente
 */

public abstract class Base {

	/**
	 * **********
	 * VARIABLES
	 * **********
	**/
	private static WebDriver driver;
	
	
	
	/**
	 *************
	 * MÉTODOS
	 *************
	**/
	
	/**
	 *	Crea el driver y abre el navegador indicado por parámetro.
	 */
	public static WebDriver startUp(String navegador) throws Exception {
		switch (navegador) {
			case "CHROME":
				driver = abrirChrome();
				break;
	
			default:
				break;
		}
		return driver;
	}
	
	
	/**
	 * Prepara el driver para el navegador Chrome
	 */
	private static WebDriver abrirChrome() {
		// 1. Se establecen las opciones para el navegador
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        ops.addArguments("disable-infobars");
        ops.addArguments("start-maximized");
        
        // 2. Se crea el driver
		System.setProperty("webdriver.chrome.driver", "Recursos//Drivers//chromedriver.exe");
		driver = new ChromeDriver(ops);
		
		return driver;
	}
	
	
	/**
	 * Abre la url indicada por parámetro
	 */
	public static void abrirURL(String url) throws Exception {
		driver.get(url);
	}
	
	
	/**
	 * Cierra el navegador y elimina el proceso del driver
	 */
	public static void dropDown() {
		driver.close();
		driver.quit();
	}
	
	
}
