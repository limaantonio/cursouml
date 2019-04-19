package com.cursomc.services.exeptions;

public class DataIntegrateExecption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DataIntegrateExecption(String msg) {
		super(msg);
	}
	public DataIntegrateExecption(String msg, Throwable cause) {
		super(msg, cause);
	}

}
