package homeweek3kodlamaio.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {

		System.out.println("Sistem loglandı"+data);
	}

}
