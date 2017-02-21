package dao;

import com.sun.istack.internal.logging.Logger;

public class DaoImp implements IDao {

	private Logger logger = Logger.getLogger(this.getClass());

	@Override
	public double getTemperature() {
		double t = 24;
		logger.info("Returning temperature " + t);
		return t;
	}

}
