package com.curso.jpa.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;

	private List<FieldMessage> list = new ArrayList<>();

	public ValidationError(Long timestamp, Integer status, String mensagem, String path) {
		super(timestamp, status, mensagem, path);
	}

	public List<FieldMessage> getErrors() {
		return list;
	}

	public void addError(String fieldName, String mensagem) {
		list.add(new FieldMessage(fieldName, mensagem));
	}
}