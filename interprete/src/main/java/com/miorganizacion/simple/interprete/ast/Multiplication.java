package com.miorganizacion.simple.interprete.ast;

public class Multiplication implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	//constructor to initialize atributes
	public Multiplication(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	
	
	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return (int) operand1.execute() * (int)operand2.execute();
	}


}
