package exceptions;

import java.io.FileNotFoundException;

public class MyFileNotFoundException extends FileNotFoundException {

	@Override
	public String getMessage() {
		return "We are sorry, but the requested file does not exist";
	}
	
}
