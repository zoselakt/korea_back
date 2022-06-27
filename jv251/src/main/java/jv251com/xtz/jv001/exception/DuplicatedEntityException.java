package jv251com.xtz.jv001.exception;

@SuppressWarnings("serial")
public class DuplicatedEntityException extends RuntimeException{
	public DuplicatedEntityException(String msg) {
		super(msg);
	}
}
