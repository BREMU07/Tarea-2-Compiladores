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
		RAND_FLIP=10, POWER=11, AND=12, OR=13, NOT=14, GT=15, LT=16, GEQ=17, LEQ=18, 
		EQ=19, NEQ=20, ASSIGN=21, BRACKET_OPEN=22, BRACKET_CLOSE=23, PAR_OPEN=24, 
		PAR_CLOSE=25, SEMICOLON=26, BOOLEAN=27, ID=28, NUMBER=29, WS=30;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_println = 4, RULE_conditional = 5, RULE_logic_ope = 6, RULE_expression = 7, 
		RULE_factor = 8, RULE_power = 9, RULE_term = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "var_decl", "var_assign", "println", "conditional", 
			"logic_ope", "expression", "factor", "power", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'if'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'?'", "'^'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MINUS", "MULT", 
			"DIV", "RAND_FLIP", "POWER", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", 
			"EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", 
			"SEMICOLON", "BOOLEAN", "ID", "NUMBER", "WS"
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
			setState(22);
			match(PROGRAM);
			setState(23);
			match(ID);
			setState(24);
			match(BRACKET_OPEN);

					List<ASTNode> body = new ArrayList <ASTNode>();
					Map<String, Object> symbolTable = new HashMap<String, Object>();
				
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268435484L) != 0)) {
				{
				{
				setState(26);
				((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((SentenceContext)_localctx).println = println();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).println.node;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				((SentenceContext)_localctx).conditional = conditional();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node;
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				((SentenceContext)_localctx).var_decl = var_decl();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
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
			setState(51);
			match(VAR);
			setState(52);
			((Var_declContext)_localctx).ID = match(ID);
			setState(53);
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
		public Logic_opeContext logic_ope;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleParser.ASSIGN, 0); }
		public Logic_opeContext logic_ope() {
			return getRuleContext(Logic_opeContext.class,0);
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
			setState(56);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(57);
			match(ASSIGN);
			setState(58);
			((Var_assignContext)_localctx).logic_ope = logic_ope();
			setState(59);
			match(SEMICOLON);
			((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).logic_ope.node);
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
		public Logic_opeContext logic_ope;
		public TerminalNode PRINTLN() { return getToken(SimpleParser.PRINTLN, 0); }
		public Logic_opeContext logic_ope() {
			return getRuleContext(Logic_opeContext.class,0);
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
			setState(62);
			match(PRINTLN);
			setState(63);
			((PrintlnContext)_localctx).logic_ope = logic_ope();
			setState(64);
			match(SEMICOLON);
			((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).logic_ope.node);
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
		public Logic_opeContext logic_ope;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF() { return getToken(SimpleParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpleParser.PAR_OPEN, 0); }
		public Logic_opeContext logic_ope() {
			return getRuleContext(Logic_opeContext.class,0);
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
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IF);
			setState(68);
			match(PAR_OPEN);
			setState(69);
			((ConditionalContext)_localctx).logic_ope = logic_ope();
			setState(70);
			match(PAR_CLOSE);

						 	List<ASTNode> body = new ArrayList <ASTNode>();
						 
			setState(72);
			match(BRACKET_OPEN);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268435484L) != 0)) {
				{
				{
				setState(73);
				((ConditionalContext)_localctx).s1 = sentence();
				 body.add(((ConditionalContext)_localctx).s1.node);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(BRACKET_CLOSE);
			setState(82);
			match(ELSE);

						 	List<ASTNode> elseBody = new ArrayList <ASTNode>();
						 
			setState(84);
			match(BRACKET_OPEN);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268435484L) != 0)) {
				{
				{
				setState(85);
				((ConditionalContext)_localctx).s2 = sentence();
				 elseBody.add(((ConditionalContext)_localctx).s2.node);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(BRACKET_CLOSE);

						 	((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).logic_ope.node, body, elseBody);

						 
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
	public static class Logic_opeContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext t1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(SimpleParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(SimpleParser.EQ, i);
		}
		public Logic_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_ope; }
	}

	public final Logic_opeContext logic_ope() throws RecognitionException {
		Logic_opeContext _localctx = new Logic_opeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logic_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			((Logic_opeContext)_localctx).t1 = expression();
			((Logic_opeContext)_localctx).node =  ((Logic_opeContext)_localctx).t1.node;
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ) {
				{
				{
				setState(98);
				match(EQ);
				setState(99);
				((Logic_opeContext)_localctx).e2 = expression();
				((Logic_opeContext)_localctx).node =  new Equal(_localctx.node, ((Logic_opeContext)_localctx).e2.node);
				}
				}
				setState(106);
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
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((ExpressionContext)_localctx).t1 = factor();
			((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node;
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(109);
				match(PLUS);
				setState(110);
				((ExpressionContext)_localctx).t2 = factor();
				((ExpressionContext)_localctx).node =  new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node);
				}
				}
				setState(117);
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
	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public PowerContext p1;
		public PowerContext p2;
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
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
		enterRule(_localctx, 16, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((FactorContext)_localctx).p1 = power();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).p1.node;
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(120);
				match(MULT);
				setState(121);
				((FactorContext)_localctx).p2 = power();
				((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).p2.node);
				}
				}
				setState(128);
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
	public static class PowerContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> POWER() { return getTokens(SimpleParser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(SimpleParser.POWER, i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((PowerContext)_localctx).t1 = term();
			((PowerContext)_localctx).node =  ((PowerContext)_localctx).t1.node;
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POWER) {
				{
				{
				setState(131);
				match(POWER);
				setState(132);
				((PowerContext)_localctx).t2 = term();
				((PowerContext)_localctx).node =  new Power(_localctx.node, ((PowerContext)_localctx).t2.node);
				}
				}
				setState(139);
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
		public TerminalNode RAND_FLIP() { return getToken(SimpleParser.RAND_FLIP, 0); }
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
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case RAND_FLIP:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(RAND_FLIP);
				setState(147);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new RandFlip(Double.parseDouble((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null))); 
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(PAR_OPEN);
				setState(150);
				((TermContext)_localctx).expression = expression();
				((TermContext)_localctx).node =  ((TermContext)_localctx).expression.node;
				setState(152);
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
		"\u0004\u0001\u001e\u009d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u001e\b\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005M\b\u0005\n\u0005"+
		"\f\u0005P\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005Y\b\u0005\n\u0005\f\u0005\\"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006g\b\u0006\n\u0006"+
		"\f\u0006j\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007r\b\u0007\n\u0007\f\u0007u\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b}\b\b\n\b\f\b\u0080"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0088\b\t"+
		"\n\t\f\t\u008b\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009b"+
		"\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0000\u009f\u0000\u0016\u0001\u0000\u0000\u0000\u0002"+
		"1\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u00068\u0001"+
		"\u0000\u0000\u0000\b>\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000"+
		"\f`\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010v\u0001"+
		"\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u009a\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005"+
		"\u001c\u0000\u0000\u0018\u0019\u0005\u0016\u0000\u0000\u0019\u001f\u0006"+
		"\u0000\uffff\uffff\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001c"+
		"\u0006\u0000\uffff\uffff\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d"+
		"\u001a\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0017\u0000\u0000"+
		"#$\u0006\u0000\uffff\uffff\u0000$\u0001\u0001\u0000\u0000\u0000%&\u0003"+
		"\b\u0004\u0000&\'\u0006\u0001\uffff\uffff\u0000\'2\u0001\u0000\u0000\u0000"+
		"()\u0003\n\u0005\u0000)*\u0006\u0001\uffff\uffff\u0000*2\u0001\u0000\u0000"+
		"\u0000+,\u0003\u0004\u0002\u0000,-\u0006\u0001\uffff\uffff\u0000-2\u0001"+
		"\u0000\u0000\u0000./\u0003\u0006\u0003\u0000/0\u0006\u0001\uffff\uffff"+
		"\u000002\u0001\u0000\u0000\u00001%\u0001\u0000\u0000\u00001(\u0001\u0000"+
		"\u0000\u00001+\u0001\u0000\u0000\u00001.\u0001\u0000\u0000\u00002\u0003"+
		"\u0001\u0000\u0000\u000034\u0005\u0002\u0000\u000045\u0005\u001c\u0000"+
		"\u000056\u0005\u001a\u0000\u000067\u0006\u0002\uffff\uffff\u00007\u0005"+
		"\u0001\u0000\u0000\u000089\u0005\u001c\u0000\u00009:\u0005\u0015\u0000"+
		"\u0000:;\u0003\f\u0006\u0000;<\u0005\u001a\u0000\u0000<=\u0006\u0003\uffff"+
		"\uffff\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\u0003\u0000\u0000"+
		"?@\u0003\f\u0006\u0000@A\u0005\u001a\u0000\u0000AB\u0006\u0004\uffff\uffff"+
		"\u0000B\t\u0001\u0000\u0000\u0000CD\u0005\u0004\u0000\u0000DE\u0005\u0018"+
		"\u0000\u0000EF\u0003\f\u0006\u0000FG\u0005\u0019\u0000\u0000GH\u0006\u0005"+
		"\uffff\uffff\u0000HN\u0005\u0016\u0000\u0000IJ\u0003\u0002\u0001\u0000"+
		"JK\u0006\u0005\uffff\uffff\u0000KM\u0001\u0000\u0000\u0000LI\u0001\u0000"+
		"\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"QR\u0005\u0017\u0000\u0000RS\u0005\u0005\u0000\u0000ST\u0006\u0005\uffff"+
		"\uffff\u0000TZ\u0005\u0016\u0000\u0000UV\u0003\u0002\u0001\u0000VW\u0006"+
		"\u0005\uffff\uffff\u0000WY\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005"+
		"\u0017\u0000\u0000^_\u0006\u0005\uffff\uffff\u0000_\u000b\u0001\u0000"+
		"\u0000\u0000`a\u0003\u000e\u0007\u0000ah\u0006\u0006\uffff\uffff\u0000"+
		"bc\u0005\u0013\u0000\u0000cd\u0003\u000e\u0007\u0000de\u0006\u0006\uffff"+
		"\uffff\u0000eg\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i\r\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0003\u0010\b"+
		"\u0000ls\u0006\u0007\uffff\uffff\u0000mn\u0005\u0006\u0000\u0000no\u0003"+
		"\u0010\b\u0000op\u0006\u0007\uffff\uffff\u0000pr\u0001\u0000\u0000\u0000"+
		"qm\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000t\u000f\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0003\u0012\t\u0000w~\u0006\b\uffff\uffff\u0000x"+
		"y\u0005\b\u0000\u0000yz\u0003\u0012\t\u0000z{\u0006\b\uffff\uffff\u0000"+
		"{}\u0001\u0000\u0000\u0000|x\u0001\u0000\u0000\u0000}\u0080\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0011\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0003\u0014\n\u0000\u0082\u0089\u0006\t\uffff\uffff\u0000\u0083"+
		"\u0084\u0005\u000b\u0000\u0000\u0084\u0085\u0003\u0014\n\u0000\u0085\u0086"+
		"\u0006\t\uffff\uffff\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0083"+
		"\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0013"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u001d\u0000\u0000\u008d\u009b\u0006\n\uffff\uffff\u0000\u008e\u008f"+
		"\u0005\u001b\u0000\u0000\u008f\u009b\u0006\n\uffff\uffff\u0000\u0090\u0091"+
		"\u0005\u001c\u0000\u0000\u0091\u009b\u0006\n\uffff\uffff\u0000\u0092\u0093"+
		"\u0005\n\u0000\u0000\u0093\u0094\u0005\u001d\u0000\u0000\u0094\u009b\u0006"+
		"\n\uffff\uffff\u0000\u0095\u0096\u0005\u0018\u0000\u0000\u0096\u0097\u0003"+
		"\u000e\u0007\u0000\u0097\u0098\u0006\n\uffff\uffff\u0000\u0098\u0099\u0005"+
		"\u0019\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u008c\u0001"+
		"\u0000\u0000\u0000\u009a\u008e\u0001\u0000\u0000\u0000\u009a\u0090\u0001"+
		"\u0000\u0000\u0000\u009a\u0092\u0001\u0000\u0000\u0000\u009a\u0095\u0001"+
		"\u0000\u0000\u0000\u009b\u0015\u0001\u0000\u0000\u0000\t\u001f1NZhs~\u0089"+
		"\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}