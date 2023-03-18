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
		T__0=1, T__1=2, T__2=3, STARTBLOCK=4, ENDBLOCK=5, IFKW=6, ELSEKW=7, VARIABLE=8, 
		SCIENTIFIC_NUMBER=9, LPAREN=10, RPAREN=11, PLUS=12, MINUS=13, TIMES=14, 
		DIV=15, GT=16, LT=17, EQ=18, POINT=19, POW=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "STARTBLOCK", "ENDBLOCK", "IFKW", "ELSEKW", "VARIABLE", 
			"VALID_ID_START", "VALID_ID_CHAR", "SCIENTIFIC_NUMBER", "NUMBER", "UNSIGNED_INTEGER", 
			"E", "SIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", 
			"LT", "EQ", "POINT", "POW", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func '", "'print '", "'while'", "'['", "']'", "'if'", "'else'", 
			null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'='", 
			"'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "STARTBLOCK", "ENDBLOCK", "IFKW", "ELSEKW", "VARIABLE", 
			"SCIENTIFIC_NUMBER", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", 
			"GT", "LT", "EQ", "POINT", "POW", "WS"
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
		"\u0004\u0000\u0015\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007Y\b\u0007\n\u0007\f\u0007"+
		"\\\t\u0007\u0001\b\u0003\b_\b\b\u0001\t\u0001\t\u0003\tc\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0003\nh\b\n\u0001\n\u0001\n\u0003\nl\b\n\u0001\u000b\u0004"+
		"\u000bo\b\u000b\u000b\u000b\f\u000bp\u0001\u000b\u0001\u000b\u0004\u000b"+
		"u\b\u000b\u000b\u000b\f\u000bv\u0003\u000by\b\u000b\u0001\f\u0004\f|\b"+
		"\f\u000b\f\f\f}\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u009b\b\u001a\u000b"+
		"\u001a\f\u001a\u009c\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\u0000\u0013\u0000\u0015\t\u0017\u0000\u0019\u0000\u001b\u0000"+
		"\u001d\u0000\u001f\n!\u000b#\f%\r\'\u000e)\u000f+\u0010-\u0011/\u0012"+
		"1\u00133\u00145\u0015\u0001\u0000\u0004\u0003\u0000AZ__az\u0002\u0000"+
		"EEee\u0002\u0000++--\u0003\u0000\t\n\r\r  \u00a2\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u0003=\u0001\u0000\u0000"+
		"\u0000\u0005D\u0001\u0000\u0000\u0000\u0007J\u0001\u0000\u0000\u0000\t"+
		"L\u0001\u0000\u0000\u0000\u000bN\u0001\u0000\u0000\u0000\rQ\u0001\u0000"+
		"\u0000\u0000\u000fV\u0001\u0000\u0000\u0000\u0011^\u0001\u0000\u0000\u0000"+
		"\u0013b\u0001\u0000\u0000\u0000\u0015d\u0001\u0000\u0000\u0000\u0017n"+
		"\u0001\u0000\u0000\u0000\u0019{\u0001\u0000\u0000\u0000\u001b\u007f\u0001"+
		"\u0000\u0000\u0000\u001d\u0081\u0001\u0000\u0000\u0000\u001f\u0083\u0001"+
		"\u0000\u0000\u0000!\u0085\u0001\u0000\u0000\u0000#\u0087\u0001\u0000\u0000"+
		"\u0000%\u0089\u0001\u0000\u0000\u0000\'\u008b\u0001\u0000\u0000\u0000"+
		")\u008d\u0001\u0000\u0000\u0000+\u008f\u0001\u0000\u0000\u0000-\u0091"+
		"\u0001\u0000\u0000\u0000/\u0093\u0001\u0000\u0000\u00001\u0095\u0001\u0000"+
		"\u0000\u00003\u0097\u0001\u0000\u0000\u00005\u009a\u0001\u0000\u0000\u0000"+
		"78\u0005f\u0000\u000089\u0005u\u0000\u00009:\u0005n\u0000\u0000:;\u0005"+
		"c\u0000\u0000;<\u0005 \u0000\u0000<\u0002\u0001\u0000\u0000\u0000=>\u0005"+
		"p\u0000\u0000>?\u0005r\u0000\u0000?@\u0005i\u0000\u0000@A\u0005n\u0000"+
		"\u0000AB\u0005t\u0000\u0000BC\u0005 \u0000\u0000C\u0004\u0001\u0000\u0000"+
		"\u0000DE\u0005w\u0000\u0000EF\u0005h\u0000\u0000FG\u0005i\u0000\u0000"+
		"GH\u0005l\u0000\u0000HI\u0005e\u0000\u0000I\u0006\u0001\u0000\u0000\u0000"+
		"JK\u0005[\u0000\u0000K\b\u0001\u0000\u0000\u0000LM\u0005]\u0000\u0000"+
		"M\n\u0001\u0000\u0000\u0000NO\u0005i\u0000\u0000OP\u0005f\u0000\u0000"+
		"P\f\u0001\u0000\u0000\u0000QR\u0005e\u0000\u0000RS\u0005l\u0000\u0000"+
		"ST\u0005s\u0000\u0000TU\u0005e\u0000\u0000U\u000e\u0001\u0000\u0000\u0000"+
		"VZ\u0003\u0011\b\u0000WY\u0003\u0013\t\u0000XW\u0001\u0000\u0000\u0000"+
		"Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\u0010\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0007"+
		"\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\u0012\u0001\u0000\u0000"+
		"\u0000`c\u0003\u0011\b\u0000ac\u000209\u0000b`\u0001\u0000\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000c\u0014\u0001\u0000\u0000\u0000dk\u0003\u0017"+
		"\u000b\u0000eg\u0003\u001b\r\u0000fh\u0003\u001d\u000e\u0000gf\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0003"+
		"\u0019\f\u0000jl\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000l\u0016\u0001\u0000\u0000\u0000mo\u000209\u0000nm\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qx\u0001\u0000\u0000\u0000rt\u0005.\u0000\u0000"+
		"su\u000209\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v"+
		"t\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xr\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0018\u0001"+
		"\u0000\u0000\u0000z|\u000209\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u001a"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0007\u0001\u0000\u0000\u0080\u001c"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0002\u0000\u0000\u0082\u001e"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005(\u0000\u0000\u0084 \u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005)\u0000\u0000\u0086\"\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005+\u0000\u0000\u0088$\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005-\u0000\u0000\u008a&\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"*\u0000\u0000\u008c(\u0001\u0000\u0000\u0000\u008d\u008e\u0005/\u0000"+
		"\u0000\u008e*\u0001\u0000\u0000\u0000\u008f\u0090\u0005>\u0000\u0000\u0090"+
		",\u0001\u0000\u0000\u0000\u0091\u0092\u0005<\u0000\u0000\u0092.\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005=\u0000\u0000\u00940\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005.\u0000\u0000\u00962\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005^\u0000\u0000\u00984\u0001\u0000\u0000\u0000\u0099\u009b\u0007"+
		"\u0003\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0006"+
		"\u001a\u0000\u0000\u009f6\u0001\u0000\u0000\u0000\u000b\u0000Z^bgkpvx"+
		"}\u009c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}