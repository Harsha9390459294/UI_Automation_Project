package CustomExceptions;

public class TestCaseException extends Exception{
	
	public TestCaseException() {
		super("Exception found");
	}
	
	public TestCaseException(String message) {
		super("Exception found"+ message);
	}
	
	public TestCaseException(Throwable cause) {
		super(cause);
	}

}
