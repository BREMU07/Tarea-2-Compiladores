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
		AND=10, OR=11, NOT=12, GT=13, LT=14, GEQ=15, LEQ=16, EQ=17, NEQ=18, ASSIGN=19, 
		BRACKET_OPEN=20, BRACKET_CLOSE=21, PAR_OPEN=22, PAR_CLOSE=23, SEMICOLON=24, 
		BOOLEAN=25, ID=26, NUMBER=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MINUS", "MULT", "DIV", 
			"AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
			"BOOLEAN", "ID", "NUMBER", "WS"
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
		"\u0004\u0000\u001c\u009f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u008b\b\u0018\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u008f\b\u0019\n\u0019\f\u0019\u0092\t\u0019\u0001\u001a\u0004\u001a\u0095"+
		"\b\u001a\u000b\u001a\f\u001a\u0096\u0001\u001b\u0004\u001b\u009a\b\u001b"+
		"\u000b\u001b\f\u001b\u009b\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c\u0001\u0000\u0004\u0003\u0000AZ__a"+
		"z\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u00a2\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00019\u0001\u0000\u0000\u0000\u0003A\u0001\u0000\u0000\u0000\u0005E"+
		"\u0001\u0000\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\tP\u0001\u0000"+
		"\u0000\u0000\u000bU\u0001\u0000\u0000\u0000\rW\u0001\u0000\u0000\u0000"+
		"\u000fY\u0001\u0000\u0000\u0000\u0011[\u0001\u0000\u0000\u0000\u0013]"+
		"\u0001\u0000\u0000\u0000\u0015`\u0001\u0000\u0000\u0000\u0017c\u0001\u0000"+
		"\u0000\u0000\u0019e\u0001\u0000\u0000\u0000\u001bg\u0001\u0000\u0000\u0000"+
		"\u001di\u0001\u0000\u0000\u0000\u001fl\u0001\u0000\u0000\u0000!o\u0001"+
		"\u0000\u0000\u0000#r\u0001\u0000\u0000\u0000%u\u0001\u0000\u0000\u0000"+
		"\'w\u0001\u0000\u0000\u0000)y\u0001\u0000\u0000\u0000+{\u0001\u0000\u0000"+
		"\u0000-}\u0001\u0000\u0000\u0000/\u007f\u0001\u0000\u0000\u00001\u008a"+
		"\u0001\u0000\u0000\u00003\u008c\u0001\u0000\u0000\u00005\u0094\u0001\u0000"+
		"\u0000\u00007\u0099\u0001\u0000\u0000\u00009:\u0005p\u0000\u0000:;\u0005"+
		"r\u0000\u0000;<\u0005o\u0000\u0000<=\u0005g\u0000\u0000=>\u0005r\u0000"+
		"\u0000>?\u0005a\u0000\u0000?@\u0005m\u0000\u0000@\u0002\u0001\u0000\u0000"+
		"\u0000AB\u0005v\u0000\u0000BC\u0005a\u0000\u0000CD\u0005r\u0000\u0000"+
		"D\u0004\u0001\u0000\u0000\u0000EF\u0005p\u0000\u0000FG\u0005r\u0000\u0000"+
		"GH\u0005i\u0000\u0000HI\u0005n\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005"+
		"l\u0000\u0000KL\u0005n\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005"+
		"i\u0000\u0000NO\u0005f\u0000\u0000O\b\u0001\u0000\u0000\u0000PQ\u0005"+
		"e\u0000\u0000QR\u0005l\u0000\u0000RS\u0005s\u0000\u0000ST\u0005e\u0000"+
		"\u0000T\n\u0001\u0000\u0000\u0000UV\u0005+\u0000\u0000V\f\u0001\u0000"+
		"\u0000\u0000WX\u0005-\u0000\u0000X\u000e\u0001\u0000\u0000\u0000YZ\u0005"+
		"*\u0000\u0000Z\u0010\u0001\u0000\u0000\u0000[\\\u0005/\u0000\u0000\\\u0012"+
		"\u0001\u0000\u0000\u0000]^\u0005&\u0000\u0000^_\u0005&\u0000\u0000_\u0014"+
		"\u0001\u0000\u0000\u0000`a\u0005|\u0000\u0000ab\u0005|\u0000\u0000b\u0016"+
		"\u0001\u0000\u0000\u0000cd\u0005!\u0000\u0000d\u0018\u0001\u0000\u0000"+
		"\u0000ef\u0005>\u0000\u0000f\u001a\u0001\u0000\u0000\u0000gh\u0005<\u0000"+
		"\u0000h\u001c\u0001\u0000\u0000\u0000ij\u0005>\u0000\u0000jk\u0005=\u0000"+
		"\u0000k\u001e\u0001\u0000\u0000\u0000lm\u0005<\u0000\u0000mn\u0005=\u0000"+
		"\u0000n \u0001\u0000\u0000\u0000op\u0005=\u0000\u0000pq\u0005=\u0000\u0000"+
		"q\"\u0001\u0000\u0000\u0000rs\u0005!\u0000\u0000st\u0005=\u0000\u0000"+
		"t$\u0001\u0000\u0000\u0000uv\u0005=\u0000\u0000v&\u0001\u0000\u0000\u0000"+
		"wx\u0005{\u0000\u0000x(\u0001\u0000\u0000\u0000yz\u0005}\u0000\u0000z"+
		"*\u0001\u0000\u0000\u0000{|\u0005(\u0000\u0000|,\u0001\u0000\u0000\u0000"+
		"}~\u0005)\u0000\u0000~.\u0001\u0000\u0000\u0000\u007f\u0080\u0005;\u0000"+
		"\u0000\u00800\u0001\u0000\u0000\u0000\u0081\u0082\u0005t\u0000\u0000\u0082"+
		"\u0083\u0005r\u0000\u0000\u0083\u0084\u0005u\u0000\u0000\u0084\u008b\u0005"+
		"e\u0000\u0000\u0085\u0086\u0005f\u0000\u0000\u0086\u0087\u0005a\u0000"+
		"\u0000\u0087\u0088\u0005l\u0000\u0000\u0088\u0089\u0005s\u0000\u0000\u0089"+
		"\u008b\u0005e\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008a\u0085"+
		"\u0001\u0000\u0000\u0000\u008b2\u0001\u0000\u0000\u0000\u008c\u0090\u0007"+
		"\u0000\u0000\u0000\u008d\u008f\u0007\u0001\u0000\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u00914\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0095\u0007\u0002"+
		"\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u00976\u0001\u0000\u0000\u0000\u0098\u009a\u0007\u0003\u0000"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0006\u001b\u0000"+
		"\u0000\u009e8\u0001\u0000\u0000\u0000\u0005\u0000\u008a\u0090\u0096\u009b"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}