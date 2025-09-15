package com.miorganizacion.simple.interprete.ast;

public class Constant implements ASTNode {

	private Object value;
	

	public Constant(Object value) {
		super();
		this.value = value;
	}


	@Override
	public Object execute() {
		return value;
	}

}
