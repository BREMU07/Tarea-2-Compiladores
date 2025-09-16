// Generated from /home/jeremy/Semestre/Compiladores/Tarea-2-Compiladores/interprete/src/main/antlr4/com/miorganizacion/simple/interprete/Simple.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, PLUS=6, MINUS=7, MULT=8, DIV=9, 
		RAND_FLIP=10, POWER=11, AND=12, OR=13, NOT=14, GT=15, LT=16, GEQ=17, LEQ=18, 
		EQ=19, NEQ=20, ASSIGN=21, BRACKET_OPEN=22, BRACKET_CLOSE=23, PAR_OPEN=24, 
		PAR_CLOSE=25, SEMICOLON=26, BOOLEAN=27, ID=28, NUMBER=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MINUS", "MULT", "DIV", 
			"RAND_FLIP", "POWER", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", 
			"NEQ", "ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", 
			"SEMICOLON", "BOOLEAN", "ID", "NUMBER", "WS"
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001e\u00a7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0093\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u0097\b\u001b\n\u001b\f\u001b\u009a\t\u001b"+
		"\u0001\u001c\u0004\u001c\u009d\b\u001c\u000b\u001c\f\u001c\u009e\u0001"+
		"\u001d\u0004\u001d\u00a2\b\u001d\u000b\u001d\f\u001d\u00a3\u0001\u001d"+
		"\u0001\u001d\u0000\u0000\u001e\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e\u0001\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u00aa\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000\u0000\u0003E\u0001"+
		"\u0000\u0000\u0000\u0005I\u0001\u0000\u0000\u0000\u0007Q\u0001\u0000\u0000"+
		"\u0000\tT\u0001\u0000\u0000\u0000\u000bY\u0001\u0000\u0000\u0000\r[\u0001"+
		"\u0000\u0000\u0000\u000f]\u0001\u0000\u0000\u0000\u0011_\u0001\u0000\u0000"+
		"\u0000\u0013a\u0001\u0000\u0000\u0000\u0015c\u0001\u0000\u0000\u0000\u0017"+
		"e\u0001\u0000\u0000\u0000\u0019h\u0001\u0000\u0000\u0000\u001bk\u0001"+
		"\u0000\u0000\u0000\u001dm\u0001\u0000\u0000\u0000\u001fo\u0001\u0000\u0000"+
		"\u0000!q\u0001\u0000\u0000\u0000#t\u0001\u0000\u0000\u0000%w\u0001\u0000"+
		"\u0000\u0000\'z\u0001\u0000\u0000\u0000)}\u0001\u0000\u0000\u0000+\u007f"+
		"\u0001\u0000\u0000\u0000-\u0081\u0001\u0000\u0000\u0000/\u0083\u0001\u0000"+
		"\u0000\u00001\u0085\u0001\u0000\u0000\u00003\u0087\u0001\u0000\u0000\u0000"+
		"5\u0092\u0001\u0000\u0000\u00007\u0094\u0001\u0000\u0000\u00009\u009c"+
		"\u0001\u0000\u0000\u0000;\u00a1\u0001\u0000\u0000\u0000=>\u0005p\u0000"+
		"\u0000>?\u0005r\u0000\u0000?@\u0005o\u0000\u0000@A\u0005g\u0000\u0000"+
		"AB\u0005r\u0000\u0000BC\u0005a\u0000\u0000CD\u0005m\u0000\u0000D\u0002"+
		"\u0001\u0000\u0000\u0000EF\u0005v\u0000\u0000FG\u0005a\u0000\u0000GH\u0005"+
		"r\u0000\u0000H\u0004\u0001\u0000\u0000\u0000IJ\u0005p\u0000\u0000JK\u0005"+
		"r\u0000\u0000KL\u0005i\u0000\u0000LM\u0005n\u0000\u0000MN\u0005t\u0000"+
		"\u0000NO\u0005l\u0000\u0000OP\u0005n\u0000\u0000P\u0006\u0001\u0000\u0000"+
		"\u0000QR\u0005i\u0000\u0000RS\u0005f\u0000\u0000S\b\u0001\u0000\u0000"+
		"\u0000TU\u0005e\u0000\u0000UV\u0005l\u0000\u0000VW\u0005s\u0000\u0000"+
		"WX\u0005e\u0000\u0000X\n\u0001\u0000\u0000\u0000YZ\u0005+\u0000\u0000"+
		"Z\f\u0001\u0000\u0000\u0000[\\\u0005-\u0000\u0000\\\u000e\u0001\u0000"+
		"\u0000\u0000]^\u0005*\u0000\u0000^\u0010\u0001\u0000\u0000\u0000_`\u0005"+
		"/\u0000\u0000`\u0012\u0001\u0000\u0000\u0000ab\u0005?\u0000\u0000b\u0014"+
		"\u0001\u0000\u0000\u0000cd\u0005^\u0000\u0000d\u0016\u0001\u0000\u0000"+
		"\u0000ef\u0005&\u0000\u0000fg\u0005&\u0000\u0000g\u0018\u0001\u0000\u0000"+
		"\u0000hi\u0005|\u0000\u0000ij\u0005|\u0000\u0000j\u001a\u0001\u0000\u0000"+
		"\u0000kl\u0005!\u0000\u0000l\u001c\u0001\u0000\u0000\u0000mn\u0005>\u0000"+
		"\u0000n\u001e\u0001\u0000\u0000\u0000op\u0005<\u0000\u0000p \u0001\u0000"+
		"\u0000\u0000qr\u0005>\u0000\u0000rs\u0005=\u0000\u0000s\"\u0001\u0000"+
		"\u0000\u0000tu\u0005<\u0000\u0000uv\u0005=\u0000\u0000v$\u0001\u0000\u0000"+
		"\u0000wx\u0005=\u0000\u0000xy\u0005=\u0000\u0000y&\u0001\u0000\u0000\u0000"+
		"z{\u0005!\u0000\u0000{|\u0005=\u0000\u0000|(\u0001\u0000\u0000\u0000}"+
		"~\u0005=\u0000\u0000~*\u0001\u0000\u0000\u0000\u007f\u0080\u0005{\u0000"+
		"\u0000\u0080,\u0001\u0000\u0000\u0000\u0081\u0082\u0005}\u0000\u0000\u0082"+
		".\u0001\u0000\u0000\u0000\u0083\u0084\u0005(\u0000\u0000\u00840\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005)\u0000\u0000\u00862\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005;\u0000\u0000\u00884\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005t\u0000\u0000\u008a\u008b\u0005r\u0000\u0000\u008b\u008c\u0005"+
		"u\u0000\u0000\u008c\u0093\u0005e\u0000\u0000\u008d\u008e\u0005f\u0000"+
		"\u0000\u008e\u008f\u0005a\u0000\u0000\u008f\u0090\u0005l\u0000\u0000\u0090"+
		"\u0091\u0005s\u0000\u0000\u0091\u0093\u0005e\u0000\u0000\u0092\u0089\u0001"+
		"\u0000\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u00936\u0001\u0000"+
		"\u0000\u0000\u0094\u0098\u0007\u0000\u0000\u0000\u0095\u0097\u0007\u0001"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u00998\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009d\u0007\u0002\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f:\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0007\u0003\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0006\u001d\u0000\u0000\u00a6<\u0001\u0000\u0000\u0000\u0005"+
		"\u0000\u0092\u0098\u009e\u00a3\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}