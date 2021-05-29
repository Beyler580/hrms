package kodlamaio.hrms.core.utilities;

public class DataResult<T> extends Result {
	private T data;
	public DataResult(boolean succes,T data) {
		super(succes);
		this.data = data;
		
	}
	public DataResult(boolean succes,String message,T data) {
		super(succes,message);
		
		this.data = data;
		
	}
	public T getData() {
		return data;
	}

	
	


	

	

}
