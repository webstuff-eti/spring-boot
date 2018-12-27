package br.eti.webstuff.api.responses;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {

	/*
	 *   data: use to case of success
	 *   errors: use to case of validation
	 */
	
	private T data;
	
	
	private List<String> errors;

	public Response() {

	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getErrors() {
		if(this.errors == null) {
			this.errors = new ArrayList<>();
		}
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

}
