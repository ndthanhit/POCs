package dev.danvega;

import org.zeroturnaround.exec.ProcessExecutor;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class CommandLineApplication {

	public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {

		System.out.println("Command line application...");
		String separator = System.getProperty("file.separator");
		String path = System.getProperty("java.home") + separator + "bin" + separator + "java";
		String classpath = System.getProperty("java.class.path");
		ProcessExecutor processExecutor = new ProcessExecutor(path, "-cp", classpath, Application.class.getName());
		String output = processExecutor.readOutput(true).execute().outputUTF8();
		System.out.println(output);
	}

}
