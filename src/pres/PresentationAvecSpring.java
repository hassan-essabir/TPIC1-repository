package pres;

import metier.IMetier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationAvecSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		IMetier metier = (IMetier) context.getBean("metier");
		System.out.println(metier.calcul());
	}

}
