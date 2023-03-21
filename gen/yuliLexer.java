// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class yuliLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, STARTBLOCK=5, ENDBLOCK=6, IFKW=7, ELSEKW=8, 
		VARIABLE=9, SCIENTIFIC_NUMBER=10, LPAREN=11, RPAREN=12, PLUS=13, MINUS=14, 
		TIMES=15, DIV=16, GT=17, LT=18, SETVAR=19, EQ=20, POINT=21, POW=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "STARTBLOCK", "ENDBLOCK", "IFKW", "ELSEKW", 
			"VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", "SCIENTIFIC_NUMBER", "NUMBER", 
			"UNSIGNED_INTEGER", "E", "SIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", 
			"TIMES", "DIV", "GT", "LT", "SETVAR", "EQ", "POINT", "POW", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func '", "'print '", "'while '", "'for '", "'['", "']'", "'if'", 
			"'else'", null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'>'", 
			"'<'", "':'", "'='", "'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "STARTBLOCK", "ENDBLOCK", "IFKW", "ELSEKW", 
			"VARIABLE", "SCIENTIFIC_NUMBER", "LPAREN", "RPAREN", "PLUS", "MINUS", 
			"TIMES", "DIV", "GT", "LT", "SETVAR", "EQ", "POINT", "POW", "WS"
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


	public yuliLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "yuli.g4"; }

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
		"\u0004\u0000\u0017\u00ac\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0005\bc\b\b\n\b\f\bf\t\b\u0001\t\u0003\ti\b\t\u0001\n\u0001\n\u0003"+
		"\nm\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000br\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000bv\b\u000b\u0001\f\u0004\fy\b\f\u000b\f\f"+
		"\fz\u0001\f\u0001\f\u0004\f\u007f\b\f\u000b\f\f\f\u0080\u0003\f\u0083"+
		"\b\f\u0001\r\u0004\r\u0086\b\r\u000b\r\f\r\u0087\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u00a7\b\u001c\u000b\u001c"+
		"\f\u001c\u00a8\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\u0000\u0015\u0000\u0017\n\u0019\u0000\u001b\u0000\u001d\u0000"+
		"\u001f\u0000!\u000b#\f%\r\'\u000e)\u000f+\u0010-\u0011/\u00121\u00133"+
		"\u00145\u00157\u00169\u0017\u0001\u0000\u0004\u0003\u0000AZ__az\u0002"+
		"\u0000EEee\u0002\u0000++--\u0003\u0000\t\n\r\r  \u00ae\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003A\u0001\u0000\u0000\u0000"+
		"\u0005H\u0001\u0000\u0000\u0000\u0007O\u0001\u0000\u0000\u0000\tT\u0001"+
		"\u0000\u0000\u0000\u000bV\u0001\u0000\u0000\u0000\rX\u0001\u0000\u0000"+
		"\u0000\u000f[\u0001\u0000\u0000\u0000\u0011`\u0001\u0000\u0000\u0000\u0013"+
		"h\u0001\u0000\u0000\u0000\u0015l\u0001\u0000\u0000\u0000\u0017n\u0001"+
		"\u0000\u0000\u0000\u0019x\u0001\u0000\u0000\u0000\u001b\u0085\u0001\u0000"+
		"\u0000\u0000\u001d\u0089\u0001\u0000\u0000\u0000\u001f\u008b\u0001\u0000"+
		"\u0000\u0000!\u008d\u0001\u0000\u0000\u0000#\u008f\u0001\u0000\u0000\u0000"+
		"%\u0091\u0001\u0000\u0000\u0000\'\u0093\u0001\u0000\u0000\u0000)\u0095"+
		"\u0001\u0000\u0000\u0000+\u0097\u0001\u0000\u0000\u0000-\u0099\u0001\u0000"+
		"\u0000\u0000/\u009b\u0001\u0000\u0000\u00001\u009d\u0001\u0000\u0000\u0000"+
		"3\u009f\u0001\u0000\u0000\u00005\u00a1\u0001\u0000\u0000\u00007\u00a3"+
		"\u0001\u0000\u0000\u00009\u00a6\u0001\u0000\u0000\u0000;<\u0005f\u0000"+
		"\u0000<=\u0005u\u0000\u0000=>\u0005n\u0000\u0000>?\u0005c\u0000\u0000"+
		"?@\u0005 \u0000\u0000@\u0002\u0001\u0000\u0000\u0000AB\u0005p\u0000\u0000"+
		"BC\u0005r\u0000\u0000CD\u0005i\u0000\u0000DE\u0005n\u0000\u0000EF\u0005"+
		"t\u0000\u0000FG\u0005 \u0000\u0000G\u0004\u0001\u0000\u0000\u0000HI\u0005"+
		"w\u0000\u0000IJ\u0005h\u0000\u0000JK\u0005i\u0000\u0000KL\u0005l\u0000"+
		"\u0000LM\u0005e\u0000\u0000MN\u0005 \u0000\u0000N\u0006\u0001\u0000\u0000"+
		"\u0000OP\u0005f\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005r\u0000\u0000"+
		"RS\u0005 \u0000\u0000S\b\u0001\u0000\u0000\u0000TU\u0005[\u0000\u0000"+
		"U\n\u0001\u0000\u0000\u0000VW\u0005]\u0000\u0000W\f\u0001\u0000\u0000"+
		"\u0000XY\u0005i\u0000\u0000YZ\u0005f\u0000\u0000Z\u000e\u0001\u0000\u0000"+
		"\u0000[\\\u0005e\u0000\u0000\\]\u0005l\u0000\u0000]^\u0005s\u0000\u0000"+
		"^_\u0005e\u0000\u0000_\u0010\u0001\u0000\u0000\u0000`d\u0003\u0013\t\u0000"+
		"ac\u0003\u0015\n\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u0012\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000gi\u0007\u0000\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000i\u0014\u0001\u0000\u0000\u0000jm\u0003\u0013\t\u0000"+
		"km\u000209\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m"+
		"\u0016\u0001\u0000\u0000\u0000nu\u0003\u0019\f\u0000oq\u0003\u001d\u000e"+
		"\u0000pr\u0003\u001f\u000f\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0003\u001b\r\u0000tv\u0001\u0000"+
		"\u0000\u0000uo\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0018"+
		"\u0001\u0000\u0000\u0000wy\u000209\u0000xw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\u0082\u0001\u0000\u0000\u0000|~\u0005.\u0000\u0000}\u007f\u000209\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082|\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u001a\u0001\u0000\u0000\u0000\u0084\u0086\u0002"+
		"09\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u001c\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0001\u0000"+
		"\u0000\u008a\u001e\u0001\u0000\u0000\u0000\u008b\u008c\u0007\u0002\u0000"+
		"\u0000\u008c \u0001\u0000\u0000\u0000\u008d\u008e\u0005(\u0000\u0000\u008e"+
		"\"\u0001\u0000\u0000\u0000\u008f\u0090\u0005)\u0000\u0000\u0090$\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005+\u0000\u0000\u0092&\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005-\u0000\u0000\u0094(\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005*\u0000\u0000\u0096*\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"/\u0000\u0000\u0098,\u0001\u0000\u0000\u0000\u0099\u009a\u0005>\u0000"+
		"\u0000\u009a.\u0001\u0000\u0000\u0000\u009b\u009c\u0005<\u0000\u0000\u009c"+
		"0\u0001\u0000\u0000\u0000\u009d\u009e\u0005:\u0000\u0000\u009e2\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005=\u0000\u0000\u00a04\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005.\u0000\u0000\u00a26\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0005^\u0000\u0000\u00a48\u0001\u0000\u0000\u0000\u00a5\u00a7\u0007"+
		"\u0003\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0006"+
		"\u001c\u0000\u0000\u00ab:\u0001\u0000\u0000\u0000\u000b\u0000dhlquz\u0080"+
		"\u0082\u0087\u00a8\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}