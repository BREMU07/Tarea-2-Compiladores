package com.miorganizacion.simple.interprete.ast;

import java.util.Map;

public class Equal implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	//constructor to initialize atributes
	public Equal(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		if (operand1.execute(symbolTable) instanceof Number && operand2.execute(symbolTable) instanceof Number) {
			return ((Number)operand1.execute(symbolTable)).doubleValue() == ((Number)operand2.execute(symbolTable)).doubleValue();
		}
		return  operand1.execute(symbolTable) == operand2.execute(symbolTable);
	}


}
