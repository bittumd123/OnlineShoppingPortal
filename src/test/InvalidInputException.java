package test;

@SuppressWarnings("serial")
public class InvalidInputException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		String exc = "INVALID INPUT";
		return exc;
	}

}
