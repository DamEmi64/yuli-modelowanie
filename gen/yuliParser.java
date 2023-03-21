// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class yuliParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, STARTBLOCK=5, ENDBLOCK=6, IFKW=7, ELSEKW=8, 
		VARIABLE=9, SCIENTIFIC_NUMBER=10, LPAREN=11, RPAREN=12, PLUS=13, MINUS=14, 
		TIMES=15, DIV=16, GT=17, LT=18, SETVAR=19, EQ=20, POINT=21, POW=22, WS=23;
	public static final int
		RULE_file_ = 0, RULE_functions = 1, RULE_setargs = 2, RULE_argumentsinit = 3, 
		RULE_operation = 4, RULE_specialfun = 5, RULE_ifstatements = 6, RULE_loopstatements = 7, 
		RULE_equation = 8, RULE_expression = 9, RULE_atom = 10, RULE_scientific = 11, 
		RULE_variable = 12, RULE_relop = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_", "functions", "setargs", "argumentsinit", "operation", "specialfun", 
			"ifstatements", "loopstatements", "equation", "expression", "atom", "scientific", 
			"variable", "relop"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public yuliParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_Context extends ParserRuleContext {
		public List<FunctionsContext> functions() {
			return getRuleContexts(FunctionsContext.class);
		}
		public FunctionsContext functions(int i) {
			return getRuleContext(FunctionsContext.class,i);
		}
		public File_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterFile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitFile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitFile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_Context file_() throws RecognitionException {
		File_Context _localctx = new File_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28318L) != 0) {
				{
				{
				setState(28);
				functions();
				}
				}
				setState(33);
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
	public static class FunctionsContext extends ParserRuleContext {
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	 
		public FunctionsContext() { }
		public void copyFrom(FunctionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalContext extends FunctionsContext {
		public OperationContext inside;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public GlobalContext(FunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuninitContext extends FunctionsContext {
		public AtomContext arguments;
		public OperationContext inside;
		public FunctionsContext next;
		public TerminalNode VARIABLE() { return getToken(yuliParser.VARIABLE, 0); }
		public TerminalNode STARTBLOCK() { return getToken(yuliParser.STARTBLOCK, 0); }
		public TerminalNode ENDBLOCK() { return getToken(yuliParser.ENDBLOCK, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(yuliParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(yuliParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(yuliParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(yuliParser.RPAREN, i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<FunctionsContext> functions() {
			return getRuleContexts(FunctionsContext.class);
		}
		public FunctionsContext functions(int i) {
			return getRuleContext(FunctionsContext.class,i);
		}
		public FuninitContext(FunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterFuninit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitFuninit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitFuninit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		int _la;
		try {
			int _alt;
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new FuninitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(T__0);
				setState(35);
				match(VARIABLE);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(36);
					match(LPAREN);
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VARIABLE || _la==SCIENTIFIC_NUMBER) {
					{
					{
					setState(42);
					((FuninitContext)_localctx).arguments = atom();
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RPAREN) {
					{
					{
					setState(48);
					match(RPAREN);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(STARTBLOCK);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(55);
					((FuninitContext)_localctx).inside = operation();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				match(ENDBLOCK);
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(62);
						((FuninitContext)_localctx).next = functions();
						}
						} 
					}
					setState(67);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case IFKW:
			case VARIABLE:
			case SCIENTIFIC_NUMBER:
			case LPAREN:
			case PLUS:
			case MINUS:
				_localctx = new GlobalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				((GlobalContext)_localctx).inside = operation();
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
	public static class SetargsContext extends ParserRuleContext {
		public SetargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setargs; }
	 
		public SetargsContext() { }
		public void copyFrom(SetargsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetvariableContext extends SetargsContext {
		public VariableContext left;
		public OperationContext right;
		public TerminalNode SETVAR() { return getToken(yuliParser.SETVAR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public SetvariableContext(SetargsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterSetvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitSetvariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitSetvariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetargsContext setargs() throws RecognitionException {
		SetargsContext _localctx = new SetargsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setargs);
		try {
			_localctx = new SetvariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((SetvariableContext)_localctx).left = variable();
			setState(72);
			match(SETVAR);
			setState(73);
			((SetvariableContext)_localctx).right = operation();
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
	public static class ArgumentsinitContext extends ParserRuleContext {
		public List<SetargsContext> setargs() {
			return getRuleContexts(SetargsContext.class);
		}
		public SetargsContext setargs(int i) {
			return getRuleContext(SetargsContext.class,i);
		}
		public ArgumentsinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsinit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterArgumentsinit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitArgumentsinit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitArgumentsinit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsinitContext argumentsinit() throws RecognitionException {
		ArgumentsinitContext _localctx = new ArgumentsinitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentsinit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLE) {
				{
				{
				setState(75);
				setargs();
				}
				}
				setState(80);
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
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallfunContext extends OperationContext {
		public VariableContext name;
		public ArgumentsinitContext args;
		public TerminalNode LPAREN() { return getToken(yuliParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(yuliParser.RPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArgumentsinitContext argumentsinit() {
			return getRuleContext(ArgumentsinitContext.class,0);
		}
		public CallfunContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterCallfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitCallfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitCallfun(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpecialfuncContext extends OperationContext {
		public SpecialfunContext specialfun() {
			return getRuleContext(SpecialfunContext.class,0);
		}
		public SpecialfuncContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterSpecialfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitSpecialfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitSpecialfunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetargumentContext extends OperationContext {
		public SetargsContext setargs() {
			return getRuleContext(SetargsContext.class,0);
		}
		public SetargumentContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterSetargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitSetargument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitSetargument(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EquContext extends OperationContext {
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public EquContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterEqu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitEqu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitEqu(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfgroupContext extends OperationContext {
		public IfstatementsContext ifstatements() {
			return getRuleContext(IfstatementsContext.class,0);
		}
		public IfgroupContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterIfgroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitIfgroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitIfgroup(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopgroupContext extends OperationContext {
		public LoopstatementsContext loopstatements() {
			return getRuleContext(LoopstatementsContext.class,0);
		}
		public LoopgroupContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterLoopgroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitLoopgroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitLoopgroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operation);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IfgroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				ifstatements();
				}
				break;
			case 2:
				_localctx = new CallfunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				((CallfunContext)_localctx).name = variable();
				setState(83);
				match(LPAREN);
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(84);
					((CallfunContext)_localctx).args = argumentsinit();
					}
					break;
				}
				setState(87);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new LoopgroupContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				loopstatements();
				}
				break;
			case 4:
				_localctx = new SetargumentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				setargs();
				}
				break;
			case 5:
				_localctx = new SpecialfuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				specialfun();
				}
				break;
			case 6:
				_localctx = new EquContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				equation();
				}
				break;
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
	public static class SpecialfunContext extends ParserRuleContext {
		public SpecialfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialfun; }
	 
		public SpecialfunContext() { }
		public void copyFrom(SpecialfunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintfunContext extends SpecialfunContext {
		public OperationContext inside;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public PrintfunContext(SpecialfunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterPrintfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitPrintfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitPrintfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialfunContext specialfun() throws RecognitionException {
		SpecialfunContext _localctx = new SpecialfunContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_specialfun);
		try {
			_localctx = new PrintfunContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__1);
			setState(96);
			((PrintfunContext)_localctx).inside = operation();
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
	public static class IfstatementsContext extends ParserRuleContext {
		public IfstatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatements; }
	 
		public IfstatementsContext() { }
		public void copyFrom(IfstatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfelsestatementContext extends IfstatementsContext {
		public ExpressionContext condition;
		public OperationContext inside;
		public ExpressionContext elseinside;
		public TerminalNode IFKW() { return getToken(yuliParser.IFKW, 0); }
		public TerminalNode LPAREN() { return getToken(yuliParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(yuliParser.RPAREN, 0); }
		public List<TerminalNode> STARTBLOCK() { return getTokens(yuliParser.STARTBLOCK); }
		public TerminalNode STARTBLOCK(int i) {
			return getToken(yuliParser.STARTBLOCK, i);
		}
		public List<TerminalNode> ENDBLOCK() { return getTokens(yuliParser.ENDBLOCK); }
		public TerminalNode ENDBLOCK(int i) {
			return getToken(yuliParser.ENDBLOCK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ELSEKW() { return getTokens(yuliParser.ELSEKW); }
		public TerminalNode ELSEKW(int i) {
			return getToken(yuliParser.ELSEKW, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public IfelsestatementContext(IfstatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterIfelsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitIfelsestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitIfelsestatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfstatementContext extends IfstatementsContext {
		public ExpressionContext condition;
		public OperationContext inside;
		public TerminalNode IFKW() { return getToken(yuliParser.IFKW, 0); }
		public TerminalNode LPAREN() { return getToken(yuliParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(yuliParser.RPAREN, 0); }
		public TerminalNode STARTBLOCK() { return getToken(yuliParser.STARTBLOCK, 0); }
		public TerminalNode ENDBLOCK() { return getToken(yuliParser.ENDBLOCK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public IfstatementContext(IfstatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementsContext ifstatements() throws RecognitionException {
		IfstatementsContext _localctx = new IfstatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifstatements);
		int _la;
		try {
			int _alt;
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new IfelsestatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(IFKW);
				setState(99);
				match(LPAREN);
				setState(100);
				((IfelsestatementContext)_localctx).condition = expression(0);
				setState(101);
				match(RPAREN);
				setState(102);
				match(STARTBLOCK);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(103);
					((IfelsestatementContext)_localctx).inside = operation();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(ENDBLOCK);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEKW) {
					{
					{
					setState(110);
					match(ELSEKW);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STARTBLOCK) {
					{
					{
					setState(116);
					match(STARTBLOCK);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						((IfelsestatementContext)_localctx).elseinside = expression(0);
						}
						} 
					}
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						match(ENDBLOCK);
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new IfstatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(IFKW);
				setState(135);
				match(LPAREN);
				setState(136);
				((IfstatementContext)_localctx).condition = expression(0);
				setState(137);
				match(RPAREN);
				setState(138);
				match(STARTBLOCK);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(139);
					((IfstatementContext)_localctx).inside = operation();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(ENDBLOCK);
				}
				break;
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
	public static class LoopstatementsContext extends ParserRuleContext {
		public LoopstatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopstatements; }
	 
		public LoopstatementsContext() { }
		public void copyFrom(LoopstatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilestatementwithoutconditionindexContext extends LoopstatementsContext {
		public VariableContext startwhile;
		public AtomContext endwhile;
		public OperationContext inside;
		public TerminalNode LPAREN() { return getToken(yuliParser.LPAREN, 0); }
		public TerminalNode SETVAR() { return getToken(yuliParser.SETVAR, 0); }
		public TerminalNode RPAREN() { return getToken(yuliParser.RPAREN, 0); }
		public TerminalNode STARTBLOCK() { return getToken(yuliParser.STARTBLOCK, 0); }
		public TerminalNode ENDBLOCK() { return getToken(yuliParser.ENDBLOCK, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public WhilestatementwithoutconditionindexContext(LoopstatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterWhilestatementwithoutconditionindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitWhilestatementwithoutconditionindex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitWhilestatementwithoutconditionindex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilestatementContext extends LoopstatementsContext {
		public EquationContext condition;
		public OperationContext inside;
		public TerminalNode STARTBLOCK() { return getToken(yuliParser.STARTBLOCK, 0); }
		public TerminalNode ENDBLOCK() { return getToken(yuliParser.ENDBLOCK, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public WhilestatementContext(LoopstatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitWhilestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilestatementwithoutconditionContext extends LoopstatementsContext {
		public ScientificContext startwhile;
		public AtomContext endwhile;
		public OperationContext inside;
		public TerminalNode LPAREN() { return getToken(yuliParser.LPAREN, 0); }
		public TerminalNode SETVAR() { return getToken(yuliParser.SETVAR, 0); }
		public TerminalNode RPAREN() { return getToken(yuliParser.RPAREN, 0); }
		public TerminalNode STARTBLOCK() { return getToken(yuliParser.STARTBLOCK, 0); }
		public TerminalNode ENDBLOCK() { return getToken(yuliParser.ENDBLOCK, 0); }
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public WhilestatementwithoutconditionContext(LoopstatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterWhilestatementwithoutcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitWhilestatementwithoutcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitWhilestatementwithoutcondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForstatementwithconditionContext extends LoopstatementsContext {
		public AtomContext startwhile;
		public AtomContext endwhile;
		public OperationContext condition;
		public OperationContext inside;
		public TerminalNode LPAREN() { return getToken(yuliParser.LPAREN, 0); }
		public List<TerminalNode> SETVAR() { return getTokens(yuliParser.SETVAR); }
		public TerminalNode SETVAR(int i) {
			return getToken(yuliParser.SETVAR, i);
		}
		public TerminalNode RPAREN() { return getToken(yuliParser.RPAREN, 0); }
		public TerminalNode STARTBLOCK() { return getToken(yuliParser.STARTBLOCK, 0); }
		public TerminalNode ENDBLOCK() { return getToken(yuliParser.ENDBLOCK, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public ForstatementwithconditionContext(LoopstatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterForstatementwithcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitForstatementwithcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitForstatementwithcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopstatementsContext loopstatements() throws RecognitionException {
		LoopstatementsContext _localctx = new LoopstatementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopstatements);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new WhilestatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__2);
				setState(150);
				((WhilestatementContext)_localctx).condition = equation();
				setState(151);
				match(STARTBLOCK);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(152);
					((WhilestatementContext)_localctx).inside = operation();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(ENDBLOCK);
				}
				break;
			case 2:
				_localctx = new ForstatementwithconditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__3);
				setState(161);
				match(LPAREN);
				setState(162);
				((ForstatementwithconditionContext)_localctx).startwhile = atom();
				setState(163);
				match(SETVAR);
				setState(164);
				((ForstatementwithconditionContext)_localctx).endwhile = atom();
				setState(165);
				match(SETVAR);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(166);
					((ForstatementwithconditionContext)_localctx).condition = operation();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(RPAREN);
				setState(173);
				match(STARTBLOCK);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(174);
					((ForstatementwithconditionContext)_localctx).inside = operation();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(ENDBLOCK);
				}
				break;
			case 3:
				_localctx = new WhilestatementwithoutconditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(T__2);
				setState(183);
				match(LPAREN);
				setState(184);
				((WhilestatementwithoutconditionContext)_localctx).startwhile = scientific();
				setState(185);
				match(SETVAR);
				setState(186);
				((WhilestatementwithoutconditionContext)_localctx).endwhile = atom();
				setState(187);
				match(RPAREN);
				setState(188);
				match(STARTBLOCK);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(189);
					((WhilestatementwithoutconditionContext)_localctx).inside = operation();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(ENDBLOCK);
				}
				break;
			case 4:
				_localctx = new WhilestatementwithoutconditionindexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(T__2);
				setState(198);
				match(LPAREN);
				setState(199);
				((WhilestatementwithoutconditionindexContext)_localctx).startwhile = variable();
				setState(200);
				match(SETVAR);
				setState(201);
				((WhilestatementwithoutconditionindexContext)_localctx).endwhile = atom();
				setState(202);
				match(RPAREN);
				setState(203);
				match(STARTBLOCK);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(204);
					((WhilestatementwithoutconditionindexContext)_localctx).inside = operation();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(ENDBLOCK);
				}
				break;
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
	public static class EquationContext extends ParserRuleContext {
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
	 
		public EquationContext() { }
		public void copyFrom(EquationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends EquationContext {
		public ExpressionContext left;
		public RelopContext sign;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CompareContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalContext extends EquationContext {
		public ExpressionContext result;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CalContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterCal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitCal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitCal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_equation);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new CalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				((CalContext)_localctx).result = expression(0);
				}
				break;
			case 2:
				_localctx = new CompareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				((CompareContext)_localctx).left = expression(0);
				setState(216);
				((CompareContext)_localctx).sign = relop();
				setState(217);
				((CompareContext)_localctx).right = expression(0);
				}
				break;
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomexprContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(yuliParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(yuliParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(yuliParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(yuliParser.MINUS, i);
		}
		public AtomexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterAtomexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitAtomexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitAtomexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimesordivexprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(yuliParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(yuliParser.DIV, 0); }
		public TimesordivexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterTimesordivexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitTimesordivexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitTimesordivexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusorminusexprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(yuliParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(yuliParser.MINUS, 0); }
		public PlusorminusexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterPlusorminusexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitPlusorminusexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitPlusorminusexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowexprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode POW() { return getToken(yuliParser.POW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PowexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterPowexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitPowexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitPowexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenexprContext extends ExpressionContext {
		public ExpressionContext inside;
		public TerminalNode LPAREN() { return getToken(yuliParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(yuliParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterParenexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitParenexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitParenexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(222);
				match(LPAREN);
				setState(223);
				((ParenexprContext)_localctx).inside = expression(0);
				setState(224);
				match(RPAREN);
				}
				break;
			case VARIABLE:
			case SCIENTIFIC_NUMBER:
			case PLUS:
			case MINUS:
				{
				_localctx = new AtomexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(226);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new PowexprContext(new ExpressionContext(_parentctx, _parentState));
						((PowexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(236);
						match(POW);
						setState(237);
						((PowexprContext)_localctx).right = expression(5);
						}
						break;
					case 2:
						{
						_localctx = new TimesordivexprContext(new ExpressionContext(_parentctx, _parentState));
						((TimesordivexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(239);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(240);
						((TimesordivexprContext)_localctx).right = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new PlusorminusexprContext(new ExpressionContext(_parentctx, _parentState));
						((PlusorminusexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(242);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(243);
						((PlusorminusexprContext)_localctx).right = expression(4);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atom);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				scientific();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				variable();
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
	public static class ScientificContext extends ParserRuleContext {
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(yuliParser.SCIENTIFIC_NUMBER, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterScientific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitScientific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(SCIENTIFIC_NUMBER);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(yuliParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(VARIABLE);
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
	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(yuliParser.EQ, 0); }
		public TerminalNode GT() { return getToken(yuliParser.GT, 0); }
		public TerminalNode LT() { return getToken(yuliParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1441792L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u0104\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0001\u0005\u0001,\b\u0001\n"+
		"\u0001\f\u0001/\t\u0001\u0001\u0001\u0005\u00012\b\u0001\n\u0001\f\u0001"+
		"5\t\u0001\u0001\u0001\u0001\u0001\u0005\u00019\b\u0001\n\u0001\f\u0001"+
		"<\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001@\b\u0001\n\u0001\f\u0001"+
		"C\t\u0001\u0001\u0001\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004V\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004^\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006i\b\u0006\n\u0006\f\u0006l\t\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006p\b\u0006\n\u0006\f\u0006s\t\u0006\u0001\u0006\u0005\u0006v\b\u0006"+
		"\n\u0006\f\u0006y\t\u0006\u0001\u0006\u0005\u0006|\b\u0006\n\u0006\f\u0006"+
		"\u007f\t\u0006\u0001\u0006\u0005\u0006\u0082\b\u0006\n\u0006\f\u0006\u0085"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u008d\b\u0006\n\u0006\f\u0006\u0090\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0094\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u009a\b\u0007\n\u0007\f\u0007\u009d\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a8\b\u0007\n\u0007\f\u0007"+
		"\u00ab\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b0\b"+
		"\u0007\n\u0007\f\u0007\u00b3\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00bf\b\u0007\n\u0007\f\u0007\u00c2\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ce\b\u0007\n"+
		"\u0007\f\u0007\u00d1\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d5"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00dc\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00e4\b\t\n\t\f\t\u00e7"+
		"\t\t\u0001\t\u0003\t\u00ea\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00f5\b\t\n\t\f\t\u00f8\t\t\u0001"+
		"\n\u0001\n\u0003\n\u00fc\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0000\u0001\u0012\u000e\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0003\u0001\u0000\r"+
		"\u000e\u0001\u0000\u000f\u0010\u0002\u0000\u0011\u0012\u0014\u0014\u0119"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0002E\u0001\u0000\u0000\u0000\u0004"+
		"G\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\b]\u0001\u0000"+
		"\u0000\u0000\n_\u0001\u0000\u0000\u0000\f\u0093\u0001\u0000\u0000\u0000"+
		"\u000e\u00d4\u0001\u0000\u0000\u0000\u0010\u00db\u0001\u0000\u0000\u0000"+
		"\u0012\u00e9\u0001\u0000\u0000\u0000\u0014\u00fb\u0001\u0000\u0000\u0000"+
		"\u0016\u00fd\u0001\u0000\u0000\u0000\u0018\u00ff\u0001\u0000\u0000\u0000"+
		"\u001a\u0101\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000"+
		"\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0001\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0001\u0000"+
		"\u0000#\'\u0005\t\u0000\u0000$&\u0005\u000b\u0000\u0000%$\u0001\u0000"+
		"\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(-\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		"*,\u0003\u0014\n\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.3\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000002\u0005\f\u0000\u000010\u0001\u0000\u0000"+
		"\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u00006:\u0005"+
		"\u0005\u0000\u000079\u0003\b\u0004\u000087\u0001\u0000\u0000\u00009<\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=A\u0005\u0006\u0000"+
		"\u0000>@\u0003\u0002\u0001\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BF\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0003\b\u0004\u0000E\""+
		"\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000F\u0003\u0001\u0000"+
		"\u0000\u0000GH\u0003\u0018\f\u0000HI\u0005\u0013\u0000\u0000IJ\u0003\b"+
		"\u0004\u0000J\u0005\u0001\u0000\u0000\u0000KM\u0003\u0004\u0002\u0000"+
		"LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000O\u0007\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000Q^\u0003\f\u0006\u0000RS\u0003\u0018\f\u0000SU\u0005"+
		"\u000b\u0000\u0000TV\u0003\u0006\u0003\u0000UT\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0005\f\u0000\u0000"+
		"X^\u0001\u0000\u0000\u0000Y^\u0003\u000e\u0007\u0000Z^\u0003\u0004\u0002"+
		"\u0000[^\u0003\n\u0005\u0000\\^\u0003\u0010\b\u0000]Q\u0001\u0000\u0000"+
		"\u0000]R\u0001\u0000\u0000\u0000]Y\u0001\u0000\u0000\u0000]Z\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\t\u0001"+
		"\u0000\u0000\u0000_`\u0005\u0002\u0000\u0000`a\u0003\b\u0004\u0000a\u000b"+
		"\u0001\u0000\u0000\u0000bc\u0005\u0007\u0000\u0000cd\u0005\u000b\u0000"+
		"\u0000de\u0003\u0012\t\u0000ef\u0005\f\u0000\u0000fj\u0005\u0005\u0000"+
		"\u0000gi\u0003\b\u0004\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000mq\u0005\u0006\u0000\u0000np\u0005"+
		"\b\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rw\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tv\u0005\u0005\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x}\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0003"+
		"\u0012\t\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0083\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0082\u0005\u0006\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0094\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u0007\u0000\u0000\u0087\u0088\u0005\u000b\u0000"+
		"\u0000\u0088\u0089\u0003\u0012\t\u0000\u0089\u008a\u0005\f\u0000\u0000"+
		"\u008a\u008e\u0005\u0005\u0000\u0000\u008b\u008d\u0003\b\u0004\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005\u0006\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093"+
		"b\u0001\u0000\u0000\u0000\u0093\u0086\u0001\u0000\u0000\u0000\u0094\r"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0003\u0000\u0000\u0096\u0097"+
		"\u0003\u0010\b\u0000\u0097\u009b\u0005\u0005\u0000\u0000\u0098\u009a\u0003"+
		"\b\u0004\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u0006\u0000\u0000\u009f\u00d5\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0004\u0000\u0000\u00a1\u00a2\u0005\u000b"+
		"\u0000\u0000\u00a2\u00a3\u0003\u0014\n\u0000\u00a3\u00a4\u0005\u0013\u0000"+
		"\u0000\u00a4\u00a5\u0003\u0014\n\u0000\u00a5\u00a9\u0005\u0013\u0000\u0000"+
		"\u00a6\u00a8\u0003\b\u0004\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\f\u0000\u0000\u00ad\u00b1"+
		"\u0005\u0005\u0000\u0000\u00ae\u00b0\u0003\b\u0004\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"\u0006\u0000\u0000\u00b5\u00d5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		"\u0003\u0000\u0000\u00b7\u00b8\u0005\u000b\u0000\u0000\u00b8\u00b9\u0003"+
		"\u0016\u000b\u0000\u00b9\u00ba\u0005\u0013\u0000\u0000\u00ba\u00bb\u0003"+
		"\u0014\n\u0000\u00bb\u00bc\u0005\f\u0000\u0000\u00bc\u00c0\u0005\u0005"+
		"\u0000\u0000\u00bd\u00bf\u0003\b\u0004\u0000\u00be\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0006\u0000"+
		"\u0000\u00c4\u00d5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0003\u0000"+
		"\u0000\u00c6\u00c7\u0005\u000b\u0000\u0000\u00c7\u00c8\u0003\u0018\f\u0000"+
		"\u00c8\u00c9\u0005\u0013\u0000\u0000\u00c9\u00ca\u0003\u0014\n\u0000\u00ca"+
		"\u00cb\u0005\f\u0000\u0000\u00cb\u00cf\u0005\u0005\u0000\u0000\u00cc\u00ce"+
		"\u0003\b\u0004\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\u0006\u0000\u0000\u00d3\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d4\u0095\u0001\u0000\u0000\u0000\u00d4\u00a0\u0001"+
		"\u0000\u0000\u0000\u00d4\u00b6\u0001\u0000\u0000\u0000\u00d4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00d5\u000f\u0001\u0000\u0000\u0000\u00d6\u00dc\u0003"+
		"\u0012\t\u0000\u00d7\u00d8\u0003\u0012\t\u0000\u00d8\u00d9\u0003\u001a"+
		"\r\u0000\u00d9\u00da\u0003\u0012\t\u0000\u00da\u00dc\u0001\u0000\u0000"+
		"\u0000\u00db\u00d6\u0001\u0000\u0000\u0000\u00db\u00d7\u0001\u0000\u0000"+
		"\u0000\u00dc\u0011\u0001\u0000\u0000\u0000\u00dd\u00de\u0006\t\uffff\uffff"+
		"\u0000\u00de\u00df\u0005\u000b\u0000\u0000\u00df\u00e0\u0003\u0012\t\u0000"+
		"\u00e0\u00e1\u0005\f\u0000\u0000\u00e1\u00ea\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e4\u0007\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ea\u0003\u0014\n\u0000\u00e9\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e5\u0001\u0000\u0000\u0000\u00ea\u00f6"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\n\u0005\u0000\u0000\u00ec\u00ed\u0005"+
		"\u0016\u0000\u0000\u00ed\u00f5\u0003\u0012\t\u0005\u00ee\u00ef\n\u0004"+
		"\u0000\u0000\u00ef\u00f0\u0007\u0001\u0000\u0000\u00f0\u00f5\u0003\u0012"+
		"\t\u0005\u00f1\u00f2\n\u0003\u0000\u0000\u00f2\u00f3\u0007\u0000\u0000"+
		"\u0000\u00f3\u00f5\u0003\u0012\t\u0004\u00f4\u00eb\u0001\u0000\u0000\u0000"+
		"\u00f4\u00ee\u0001\u0000\u0000\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u0013\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc\u0003\u0016\u000b\u0000"+
		"\u00fa\u00fc\u0003\u0018\f\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc\u0015\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005\n\u0000\u0000\u00fe\u0017\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005\t\u0000\u0000\u0100\u0019\u0001\u0000\u0000\u0000\u0101\u0102\u0007"+
		"\u0002\u0000\u0000\u0102\u001b\u0001\u0000\u0000\u0000\u001d\u001f\'-"+
		"3:AENU]jqw}\u0083\u008e\u0093\u009b\u00a9\u00b1\u00c0\u00cf\u00d4\u00db"+
		"\u00e5\u00e9\u00f4\u00f6\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}