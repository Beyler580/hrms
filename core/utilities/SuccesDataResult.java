package kodlamaio.hrms.core.utilities;

public class SuccesDataResult<T> extends DataResult<T> {

	public SuccesDataResult(T data) {
		super(true,data);
	}
	public SuccesDataResult(T data,String message) {
		super(true,message,data);
	}
	public SuccesDataResult(String message) {
		super(true,message,null);
	}
	
	

}
