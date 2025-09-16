package com.miorganizacion.simple.interprete.ast;

import java.util.Map;

public class RandFlip implements ASTNode {
	private Object percent;
	
	//constructor to initialize atributes
	public RandFlip(Object percent) {
		super();
		this.percent = percent;
	}
	
	
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {

		if (percent instanceof Number) {
			double p = ((Number)percent).doubleValue();
			if (p < 0.0 || p > 100.0) {
				throw new RuntimeException("Probability must be between 0 and 100");
			}
			return Math.random() * 100 < p;
		}

		throw new RuntimeException("Invalid type for probability in RandFlip");
		
	}


}
