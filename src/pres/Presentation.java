package pres;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class Presentation {

	public static void main(String[] args) {
		// static programmation :
		// DaoImp dao = new DaoImp();
		// MetierImp metier = new MetierImp();
		// metier.setDao(dao);

		// dynamic programmation :
		try {
			Scanner scanner = new Scanner(new File("config.txt"));
			String daoClassName = scanner.next();
			// System.out.println(daoClassName);
			String metierClassName = scanner.next();
			// System.out.println(metierClassName);

			Class cDao = Class.forName(daoClassName);
			Class cMetier = Class.forName(metierClassName);

			IDao dao = (IDao) cDao.newInstance();
			IMetier metier = (IMetier) cMetier.newInstance();

			Method m = cMetier.getMethod("setDao", new Class[] { IDao.class });
			m.invoke(metier, new Object[] { dao });

			System.out.println(dao.getTemperature());
			System.out.println(metier.calcul());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(metier.calcul());

	}

}
