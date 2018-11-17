package scripts;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import comun.Base;
import comun.Funciones;

public class TC_001_Login extends Base {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		try {
			
			/**
			 * *************
			 * VARIABLES
			 * *************
			 */
				WebDriver driver;
				Funciones funciones;
				String navegador;
				Properties datosGenerales;
				
			/**
			 * ***************
			 * PRECONDICIONES
			 * ***************
			 */
				// 1. Se obtiene el navegador en el que se realizará la prueba
				funciones = new Funciones();
				datosGenerales = funciones.getArchivoProperties("datosGenerales");
				navegador = datosGenerales.getProperty("navegador");
				
				// 2. Se prepara el driver
				driver = Base.startUp(navegador);
				
				// 3. Se accede a la url "https://www.youtube.com"
				Base.abrirURL(datosGenerales.getProperty("URL"));
				
			/**
			 * *************
			 * OPERATIVA
			 * *************
			 */
				
			
		} catch (Exception e) {
			// 1. Se muestra el mensaje de la excepción
			System.out.println(e.getMessage());
			// 2. Se muestra la traza de error que genera eclipse cuando se produce una excepción.
			e.printStackTrace();
		} finally {
			// 1. se cierra el navegador y se elimina el proceso del driver 
			Base.dropDown();
			System.out.println("Se cierra el navegador");
		}
	}
}
