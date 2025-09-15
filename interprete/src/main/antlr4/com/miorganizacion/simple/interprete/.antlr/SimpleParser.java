// Generated from /home/jeremy/Semestre/Compiladores/Tarea-2-Compiladores/interprete/src/main/antlr4/com/miorganizacion/simple/interprete/Simple.g4 by ANTLR 4.13.1

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.miorganizacion.simple.interprete.ast.*;

	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, PLUS=6, MINUS=7, MULT=8, DIV=9, 
		AND=10, OR=11, NOT=12, GT=13, LT=14, GEQ=15, LEQ=16, EQ=17, NEQ=18, ASSIGN=19, 
		BRACKET_OPEN=20, BRACKET_CLOSE=21, PAR_OPEN=22, PAR_CLOSE=23, SEMICOLON=24, 
		BOOLEAN=25, ID=26, NUMBER=27, WS=28;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_println = 4, RULE_expression = 5, RULE_conditional = 6, RULE_factor = 7, 
		RULE_term = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "var_decl", "var_assign", "println", "expression", 
			"conditional", "factor", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'if'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MINUS", "MULT", 
			"DIV", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
			"BOOLEAN", "ID", "NUMBER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SentenceContext sentence;
		public TerminalNode PROGRAM() { return getToken(SimpleParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(SimpleParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpleParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(PROGRAM);
			setState(19);
			match(ID);
			setState(20);
			match(BRACKET_OPEN);

					List<ASTNode> body = new ArrayList <ASTNode>();
					Map<String, Object> symbolTable = new HashMap<String, Object>();
				
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67108892L) != 0)) {
				{
				{
				setState(22);
				((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(BRACKET_CLOSE);

					for(ASTNode n : body) {
						n.execute(symbolTable);
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public PrintlnContext println;
		public ConditionalContext conditional;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((SentenceContext)_localctx).println = println();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).println.node;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				((SentenceContext)_localctx).conditional = conditional();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node;
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				((SentenceContext)_localctx).var_decl = var_decl();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				((SentenceContext)_localctx).var_assign = var_assign();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assign.node;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(VAR);
			setState(48);
			((Var_declContext)_localctx).ID = match(ID);
			setState(49);
			match(SEMICOLON);
			 ((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(53);
			match(ASSIGN);
			setState(54);
			((Var_assignContext)_localctx).expression = expression();
			setState(55);
			match(SEMICOLON);
			((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).expression.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintlnContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode PRINTLN() { return getToken(SimpleParser.PRINTLN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PRINTLN);
			setState(59);
			((PrintlnContext)_localctx).expression = expression();
			setState(60);
			match(SEMICOLON);
			((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).expression.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleParser.PLUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((ExpressionContext)_localctx).t1 = factor();
			((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node;
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(65);
				match(PLUS);
				setState(66);
				((ExpressionContext)_localctx).t2 = factor();
				((ExpressionContext)_localctx).node =  new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF() { return getToken(SimpleParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(SimpleParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(SimpleParser.BRACKET_OPEN, i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(SimpleParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(SimpleParser.BRACKET_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IF);
			setState(75);
			match(PAR_OPEN);
			setState(76);
			((ConditionalContext)_localctx).expression = expression();
			setState(77);
			match(PAR_CLOSE);

						 	List<ASTNode> body = new ArrayList <ASTNode>();
						 
			setState(79);
			match(BRACKET_OPEN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67108892L) != 0)) {
				{
				{
				setState(80);
				((ConditionalContext)_localctx).s1 = sentence();
				 body.add(((ConditionalContext)_localctx).s1.node);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(BRACKET_CLOSE);
			setState(89);
			match(ELSE);

						 	List<ASTNode> elseBody = new ArrayList <ASTNode>();
						 
			setState(91);
			match(BRACKET_OPEN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67108892L) != 0)) {
				{
				{
				setState(92);
				((ConditionalContext)_localctx).s2 = sentence();
				 elseBody.add(((ConditionalContext)_localctx).s2.node);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(BRACKET_CLOSE);

						 	((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).expression.node, body, elseBody);
						 	
						 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SimpleParser.MULT, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(105);
				match(MULT);
				setState(106);
				((FactorContext)_localctx).t2 = term();
				((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public Token BOOLEAN;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(SimpleParser.PAR_CLOSE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(PAR_OPEN);
				setState(121);
				((TermContext)_localctx).expression = expression();
				((TermContext)_localctx).node =  ((TermContext)_localctx).expression.node;
				setState(123);
				match(PAR_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u0080\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000"+
		"\u001d\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001.\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005F\b\u0005"+
		"\n\u0005\f\u0005I\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"T\b\u0006\n\u0006\f\u0006W\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006`\b\u0006"+
		"\n\u0006\f\u0006c\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"n\b\u0007\n\u0007\f\u0007q\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b~\b\b\u0001"+
		"\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000"+
		"\u0081\u0000\u0012\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000"+
		"\u0004/\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b:\u0001"+
		"\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000"+
		"\u000eg\u0001\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0001\u0000\u0000\u0013\u0014\u0005\u001a\u0000\u0000\u0014\u0015"+
		"\u0005\u0014\u0000\u0000\u0015\u001b\u0006\u0000\uffff\uffff\u0000\u0016"+
		"\u0017\u0003\u0002\u0001\u0000\u0017\u0018\u0006\u0000\uffff\uffff\u0000"+
		"\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000"+
		"\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0015\u0000\u0000"+
		"\u001f \u0006\u0000\uffff\uffff\u0000 \u0001\u0001\u0000\u0000\u0000!"+
		"\"\u0003\b\u0004\u0000\"#\u0006\u0001\uffff\uffff\u0000#.\u0001\u0000"+
		"\u0000\u0000$%\u0003\f\u0006\u0000%&\u0006\u0001\uffff\uffff\u0000&.\u0001"+
		"\u0000\u0000\u0000\'(\u0003\u0004\u0002\u0000()\u0006\u0001\uffff\uffff"+
		"\u0000).\u0001\u0000\u0000\u0000*+\u0003\u0006\u0003\u0000+,\u0006\u0001"+
		"\uffff\uffff\u0000,.\u0001\u0000\u0000\u0000-!\u0001\u0000\u0000\u0000"+
		"-$\u0001\u0000\u0000\u0000-\'\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000"+
		"\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005\u0002\u0000\u000001\u0005"+
		"\u001a\u0000\u000012\u0005\u0018\u0000\u000023\u0006\u0002\uffff\uffff"+
		"\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u001a\u0000\u000056\u0005"+
		"\u0013\u0000\u000067\u0003\n\u0005\u000078\u0005\u0018\u0000\u000089\u0006"+
		"\u0003\uffff\uffff\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\u0003"+
		"\u0000\u0000;<\u0003\n\u0005\u0000<=\u0005\u0018\u0000\u0000=>\u0006\u0004"+
		"\uffff\uffff\u0000>\t\u0001\u0000\u0000\u0000?@\u0003\u000e\u0007\u0000"+
		"@G\u0006\u0005\uffff\uffff\u0000AB\u0005\u0006\u0000\u0000BC\u0003\u000e"+
		"\u0007\u0000CD\u0006\u0005\uffff\uffff\u0000DF\u0001\u0000\u0000\u0000"+
		"EA\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000H\u000b\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JK\u0005\u0004\u0000\u0000KL\u0005\u0016\u0000\u0000"+
		"LM\u0003\n\u0005\u0000MN\u0005\u0017\u0000\u0000NO\u0006\u0006\uffff\uffff"+
		"\u0000OU\u0005\u0014\u0000\u0000PQ\u0003\u0002\u0001\u0000QR\u0006\u0006"+
		"\uffff\uffff\u0000RT\u0001\u0000\u0000\u0000SP\u0001\u0000\u0000\u0000"+
		"TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\u0015"+
		"\u0000\u0000YZ\u0005\u0005\u0000\u0000Z[\u0006\u0006\uffff\uffff\u0000"+
		"[a\u0005\u0014\u0000\u0000\\]\u0003\u0002\u0001\u0000]^\u0006\u0006\uffff"+
		"\uffff\u0000^`\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u0015\u0000"+
		"\u0000ef\u0006\u0006\uffff\uffff\u0000f\r\u0001\u0000\u0000\u0000gh\u0003"+
		"\u0010\b\u0000ho\u0006\u0007\uffff\uffff\u0000ij\u0005\b\u0000\u0000j"+
		"k\u0003\u0010\b\u0000kl\u0006\u0007\uffff\uffff\u0000ln\u0001\u0000\u0000"+
		"\u0000mi\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000p\u000f\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000rs\u0005\u001b\u0000\u0000s~\u0006\b\uffff\uffff"+
		"\u0000tu\u0005\u0019\u0000\u0000u~\u0006\b\uffff\uffff\u0000vw\u0005\u001a"+
		"\u0000\u0000w~\u0006\b\uffff\uffff\u0000xy\u0005\u0016\u0000\u0000yz\u0003"+
		"\n\u0005\u0000z{\u0006\b\uffff\uffff\u0000{|\u0005\u0017\u0000\u0000|"+
		"~\u0001\u0000\u0000\u0000}r\u0001\u0000\u0000\u0000}t\u0001\u0000\u0000"+
		"\u0000}v\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000\u0000~\u0011\u0001"+
		"\u0000\u0000\u0000\u0007\u001b-GUao}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}