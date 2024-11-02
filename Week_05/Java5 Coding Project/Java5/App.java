package Java5;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsterickLogger();
		
		logger.Log("Hello");
		System.out.println("");
		logger.Error("Hello");
		System.out.println("");
		

		Logger spacedLogger = new Spacedlogger();
		spacedLogger.Log("Hello");
		System.out.println("");
		spacedLogger.Error("Hello");
		System.out.println("");
		
		logger.Log("Goodbye");
		System.out.println("");
		logger.Error("Goodbye");
		System.out.println("");
		

		
		spacedLogger.Log("Goodbye");
		System.out.println("");
		spacedLogger.Error("Goodbye");
		System.out.println("");
	}

}