package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.async.AsyncLogger;

public class Log4jDemo {
	private static Logger logger = (Logger) LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n Hello World...!   \n");
		logger.trace("This is Trace Message");
		logger.info("Info Logger");
		logger.warn("This is warn message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
		System.out.println("\n Completed   \n");
		
		
	}

}
