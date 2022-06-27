package jv251com.xtz.jv001.exception;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends EntityNotFountException{
	public CustomerNotFoundException(String msg){
		super(msg);
	}

}
