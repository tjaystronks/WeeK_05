package Java5;

//3b.  SpacedLogger

public class Spacedlogger implements Logger{

/** 5. Implement the SpacedLogger methods:

Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.


a. If the log method received “Hello” as an argument, it should print H e l l o

b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)*/
	
//5a.
	public void Log(String log) {
		for(int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + " ");
		}System.out.println("");
		
	}
	
//5b.
	public void Error(String error) {
	    System.out.print("ERROR: ");
		for(int i = 0; i < error.length(); i++) {
			System.out.print(error.charAt(i) + " ");	
		}System.out.println("");
	}
}

