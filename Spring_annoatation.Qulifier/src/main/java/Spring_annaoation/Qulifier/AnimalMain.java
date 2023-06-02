package Spring_annaoation.Qulifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Qulifier.xml");
		Cage cage = (Cage)applicationContext.getBean("cage");
		cage.insideCage();


	}

}
