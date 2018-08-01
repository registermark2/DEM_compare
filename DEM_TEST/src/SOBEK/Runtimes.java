package SOBEK;

import java.io.File;
import java.io.IOException;

public class Runtimes {

	public Runtimes() throws IOException {

		// run the sobek modle
		// and the model.exe should be under this index

		String command[] = new String[] { "cmd.exe", "/c","sbkBatch.exe sbkbatch.ini /batch Sobek_Forecast.xml" };
		ProcessBuilder builder = new ProcessBuilder();
		builder.directory(new File("C:\\code\\javaWorkspace\\Fews\\ICCBE_IOTSensor\\"));
		builder.command(command);
		builder.start();
	}

}
