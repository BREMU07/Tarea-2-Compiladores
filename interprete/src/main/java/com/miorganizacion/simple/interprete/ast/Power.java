package com.miorganizacion.simple.interprete.ast;

import java.util.Map;

public class Power implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	//constructor to initialize atributes
	public Power(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		Object base = operand1.execute(symbolTable);
		Object exponent = operand2.execute(symbolTable);

		if (base instanceof Number && exponent instanceof Number) {
			return Math.pow(((Number)base).doubleValue(), ((Number)exponent).doubleValue());
		}

		throw new RuntimeException("Invalid types for power operation");
	}


}
