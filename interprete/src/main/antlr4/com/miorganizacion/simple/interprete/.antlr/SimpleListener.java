// Generated from /home/jeremy/Semestre/Compiladores/Tarea-2-Compiladores/interprete/src/main/antlr4/com/miorganizacion/simple/interprete/Simple.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(SimpleParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(SimpleParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(SimpleParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(SimpleParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(SimpleParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(SimpleParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SimpleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SimpleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SimpleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SimpleParser.TermContext ctx);
}