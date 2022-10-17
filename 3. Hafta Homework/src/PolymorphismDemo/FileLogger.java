package PolymorphismDemo;

public class FileLogger extends BaseLogger {
	public void Log(String message) {
		System.out.println("Logger to FileLogger : " + message);
	}

}
