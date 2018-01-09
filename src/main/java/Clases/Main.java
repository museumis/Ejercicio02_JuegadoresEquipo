package Clases;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Clase que inicia el programa
 * 
 * @author Ismael Martin
 *
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext appContex = new ClassPathXmlApplicationContext("contexto-bean.xml");
		Equipo brasil = (Equipo) appContex.getBean("equipoBrasil");
		System.out.println(brasil);

	}

}
