package kodlamaio.hrms.core.utilities;

public class Result {
	private boolean succes;
	private String message;
	
	public Result (boolean succes) {
		this.succes = succes;
		
	}
	public Result(boolean succes , String message) {
		this(succes);
		this.message = message;
		
	}
	public String getMessage() {
		return message;
	}
	public boolean isSucces() {
		return succes;
	}
	

}
