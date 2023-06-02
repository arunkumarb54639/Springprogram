package Spring_annaoation.Qulifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cage {
	@Autowired
	@Qualifier(value="tiger")
	private Animal animal;

	public void insideCage() {
		animal.name();
	}
}
