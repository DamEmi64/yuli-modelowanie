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
		RULE_file_ = 0, RULE_functions = 1, RULE_funcbody = 2, RULE_setargs = 3, 
		RULE_operation = 4, RULE_specialfun = 5, RULE_ifstatements = 6, RULE_loopstatements = 7, 
		RULE_equation = 8, RULE_expression = 9, RULE_atom = 10, RULE_scientific = 11, 
		RULE_variable = 12, RULE_relop = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_", "functions", "funcbody", "setargs", "operation", "specialfun", 
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
		public FuncbodyContext inside;
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
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
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
			setState(60);
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
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(55);
					((FuninitContext)_localctx).inside = funcbody();
					}
					break;
				}
				setState(58);
				match(ENDBLOCK);
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
				setState(59);
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
	public static class FuncbodyContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterFuncbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitFuncbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
				{
				{
				setState(62);
				operation();
				}
				}
				setState(67);
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
		enterRule(_localctx, 6, RULE_setargs);
		try {
			_localctx = new SetvariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((SetvariableContext)_localctx).left = variable();
			setState(69);
			match(SETVAR);
			setState(70);
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
		public SetargsContext args;
		public TerminalNode LPAREN() { return getToken(yuliParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(yuliParser.RPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<SetargsContext> setargs() {
			return getRuleContexts(SetargsContext.class);
		}
		public SetargsContext setargs(int i) {
			return getRuleContext(SetargsContext.class,i);
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
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new IfgroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				ifstatements();
				}
				break;
			case 2:
				_localctx = new CallfunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((CallfunContext)_localctx).name = variable();
				setState(74);
				match(LPAREN);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VARIABLE) {
					{
					{
					setState(75);
					((CallfunContext)_localctx).args = setargs();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new LoopgroupContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				loopstatements();
				}
				break;
			case 4:
				_localctx = new SetargumentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				setargs();
				}
				break;
			case 5:
				_localctx = new SpecialfuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				specialfun();
				}
				break;
			case 6:
				_localctx = new EquContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
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
			setState(89);
			match(T__1);
			setState(90);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IfelsestatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(IFKW);
				setState(93);
				match(LPAREN);
				setState(94);
				((IfelsestatementContext)_localctx).condition = expression(0);
				setState(95);
				match(RPAREN);
				setState(96);
				match(STARTBLOCK);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(97);
					((IfelsestatementContext)_localctx).inside = operation();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(ENDBLOCK);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEKW) {
					{
					{
					setState(104);
					match(ELSEKW);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STARTBLOCK) {
					{
					{
					setState(110);
					match(STARTBLOCK);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(116);
						((IfelsestatementContext)_localctx).elseinside = expression(0);
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						match(ENDBLOCK);
						}
						} 
					}
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new IfstatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(IFKW);
				setState(129);
				match(LPAREN);
				setState(130);
				((IfstatementContext)_localctx).condition = expression(0);
				setState(131);
				match(RPAREN);
				setState(132);
				match(STARTBLOCK);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(133);
					((IfstatementContext)_localctx).inside = operation();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
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
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new WhilestatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__2);
				setState(144);
				((WhilestatementContext)_localctx).condition = equation();
				setState(145);
				match(STARTBLOCK);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(146);
					((WhilestatementContext)_localctx).inside = operation();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(ENDBLOCK);
				}
				break;
			case 2:
				_localctx = new ForstatementwithconditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__3);
				setState(155);
				match(LPAREN);
				setState(156);
				((ForstatementwithconditionContext)_localctx).startwhile = atom();
				setState(157);
				match(SETVAR);
				setState(158);
				((ForstatementwithconditionContext)_localctx).endwhile = atom();
				setState(159);
				match(SETVAR);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(160);
					((ForstatementwithconditionContext)_localctx).condition = operation();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(RPAREN);
				setState(167);
				match(STARTBLOCK);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(168);
					((ForstatementwithconditionContext)_localctx).inside = operation();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(ENDBLOCK);
				}
				break;
			case 3:
				_localctx = new WhilestatementwithoutconditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(T__2);
				setState(177);
				match(LPAREN);
				setState(178);
				((WhilestatementwithoutconditionContext)_localctx).startwhile = scientific();
				setState(179);
				match(SETVAR);
				setState(180);
				((WhilestatementwithoutconditionContext)_localctx).endwhile = atom();
				setState(181);
				match(RPAREN);
				setState(182);
				match(STARTBLOCK);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(183);
					((WhilestatementwithoutconditionContext)_localctx).inside = operation();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(ENDBLOCK);
				}
				break;
			case 4:
				_localctx = new WhilestatementwithoutconditionindexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(T__2);
				setState(192);
				match(LPAREN);
				setState(193);
				((WhilestatementwithoutconditionindexContext)_localctx).startwhile = variable();
				setState(194);
				match(SETVAR);
				setState(195);
				((WhilestatementwithoutconditionindexContext)_localctx).endwhile = atom();
				setState(196);
				match(RPAREN);
				setState(197);
				match(STARTBLOCK);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28316L) != 0) {
					{
					{
					setState(198);
					((WhilestatementwithoutconditionindexContext)_localctx).inside = operation();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new CalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				((CalContext)_localctx).result = expression(0);
				}
				break;
			case 2:
				_localctx = new CompareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				((CompareContext)_localctx).left = expression(0);
				setState(210);
				((CompareContext)_localctx).sign = relop();
				setState(211);
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
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(216);
				match(LPAREN);
				setState(217);
				((ParenexprContext)_localctx).inside = expression(0);
				setState(218);
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
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(220);
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
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new PowexprContext(new ExpressionContext(_parentctx, _parentState));
						((PowexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(230);
						match(POW);
						setState(231);
						((PowexprContext)_localctx).right = expression(5);
						}
						break;
					case 2:
						{
						_localctx = new TimesordivexprContext(new ExpressionContext(_parentctx, _parentState));
						((TimesordivexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(233);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(234);
						((TimesordivexprContext)_localctx).right = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new PlusorminusexprContext(new ExpressionContext(_parentctx, _parentState));
						((PlusorminusexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(236);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(237);
						((PlusorminusexprContext)_localctx).right = expression(4);
						}
						break;
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				scientific();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
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
			setState(247);
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
			setState(249);
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
			setState(251);
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
		"\u0004\u0001\u0017\u00fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0001\u0005\u0001,\b\u0001\n"+
		"\u0001\f\u0001/\t\u0001\u0001\u0001\u0005\u00012\b\u0001\n\u0001\f\u0001"+
		"5\t\u0001\u0001\u0001\u0001\u0001\u0003\u00019\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001=\b\u0001\u0001\u0002\u0005\u0002@\b\u0002\n\u0002\f"+
		"\u0002C\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004M\b\u0004\n\u0004"+
		"\f\u0004P\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004X\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006c\b\u0006\n\u0006\f\u0006f\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006j\b\u0006\n\u0006\f\u0006m\t\u0006\u0001\u0006\u0005"+
		"\u0006p\b\u0006\n\u0006\f\u0006s\t\u0006\u0001\u0006\u0005\u0006v\b\u0006"+
		"\n\u0006\f\u0006y\t\u0006\u0001\u0006\u0005\u0006|\b\u0006\n\u0006\f\u0006"+
		"\u007f\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0087\b\u0006\n\u0006\f\u0006\u008a\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u008e\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0094\b\u0007\n\u0007\f\u0007\u0097\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a2\b\u0007\n\u0007"+
		"\f\u0007\u00a5\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00aa\b\u0007\n\u0007\f\u0007\u00ad\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00b9\b\u0007\n\u0007\f\u0007\u00bc\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c8\b\u0007"+
		"\n\u0007\f\u0007\u00cb\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00cf"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d6\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00de\b\t\n\t\f\t\u00e1"+
		"\t\t\u0001\t\u0003\t\u00e4\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ef\b\t\n\t\f\t\u00f2\t\t\u0001"+
		"\n\u0001\n\u0003\n\u00f6\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0000\u0001\u0012\u000e\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0003\u0001\u0000\r"+
		"\u000e\u0001\u0000\u000f\u0010\u0002\u0000\u0011\u0012\u0014\u0014\u0112"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004"+
		"A\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bW\u0001\u0000"+
		"\u0000\u0000\nY\u0001\u0000\u0000\u0000\f\u008d\u0001\u0000\u0000\u0000"+
		"\u000e\u00ce\u0001\u0000\u0000\u0000\u0010\u00d5\u0001\u0000\u0000\u0000"+
		"\u0012\u00e3\u0001\u0000\u0000\u0000\u0014\u00f5\u0001\u0000\u0000\u0000"+
		"\u0016\u00f7\u0001\u0000\u0000\u0000\u0018\u00f9\u0001\u0000\u0000\u0000"+
		"\u001a\u00fb\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000"+
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
		"\u0000\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000068\u0005"+
		"\u0005\u0000\u000079\u0003\u0004\u0002\u000087\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:=\u0005\u0006\u0000"+
		"\u0000;=\u0003\b\u0004\u0000<\"\u0001\u0000\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>@\u0003\b\u0004\u0000?>\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000B\u0005\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DE\u0003\u0018\f\u0000EF\u0005\u0013\u0000\u0000FG\u0003\b"+
		"\u0004\u0000G\u0007\u0001\u0000\u0000\u0000HX\u0003\f\u0006\u0000IJ\u0003"+
		"\u0018\f\u0000JN\u0005\u000b\u0000\u0000KM\u0003\u0006\u0003\u0000LK\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000QR\u0005\f\u0000\u0000RX\u0001\u0000\u0000\u0000SX\u0003\u000e\u0007"+
		"\u0000TX\u0003\u0006\u0003\u0000UX\u0003\n\u0005\u0000VX\u0003\u0010\b"+
		"\u0000WH\u0001\u0000\u0000\u0000WI\u0001\u0000\u0000\u0000WS\u0001\u0000"+
		"\u0000\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001"+
		"\u0000\u0000\u0000X\t\u0001\u0000\u0000\u0000YZ\u0005\u0002\u0000\u0000"+
		"Z[\u0003\b\u0004\u0000[\u000b\u0001\u0000\u0000\u0000\\]\u0005\u0007\u0000"+
		"\u0000]^\u0005\u000b\u0000\u0000^_\u0003\u0012\t\u0000_`\u0005\f\u0000"+
		"\u0000`d\u0005\u0005\u0000\u0000ac\u0003\b\u0004\u0000ba\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gk\u0005"+
		"\u0006\u0000\u0000hj\u0005\b\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"lq\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0005\u0005\u0000"+
		"\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rw\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tv\u0003\u0012\t\u0000ut\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x}\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0005\u0006\u0000"+
		"\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u008e\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0007\u0000\u0000"+
		"\u0081\u0082\u0005\u000b\u0000\u0000\u0082\u0083\u0003\u0012\t\u0000\u0083"+
		"\u0084\u0005\f\u0000\u0000\u0084\u0088\u0005\u0005\u0000\u0000\u0085\u0087"+
		"\u0003\b\u0004\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u0006\u0000\u0000\u008c\u008e\u0001"+
		"\u0000\u0000\u0000\u008d\\\u0001\u0000\u0000\u0000\u008d\u0080\u0001\u0000"+
		"\u0000\u0000\u008e\r\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0003\u0000"+
		"\u0000\u0090\u0091\u0003\u0010\b\u0000\u0091\u0095\u0005\u0005\u0000\u0000"+
		"\u0092\u0094\u0003\b\u0004\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0006\u0000\u0000\u0099"+
		"\u00cf\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0004\u0000\u0000\u009b"+
		"\u009c\u0005\u000b\u0000\u0000\u009c\u009d\u0003\u0014\n\u0000\u009d\u009e"+
		"\u0005\u0013\u0000\u0000\u009e\u009f\u0003\u0014\n\u0000\u009f\u00a3\u0005"+
		"\u0013\u0000\u0000\u00a0\u00a2\u0003\b\u0004\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\f\u0000"+
		"\u0000\u00a7\u00ab\u0005\u0005\u0000\u0000\u00a8\u00aa\u0003\b\u0004\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u0006\u0000\u0000\u00af\u00cf\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005\u0003\u0000\u0000\u00b1\u00b2\u0005\u000b\u0000\u0000"+
		"\u00b2\u00b3\u0003\u0016\u000b\u0000\u00b3\u00b4\u0005\u0013\u0000\u0000"+
		"\u00b4\u00b5\u0003\u0014\n\u0000\u00b5\u00b6\u0005\f\u0000\u0000\u00b6"+
		"\u00ba\u0005\u0005\u0000\u0000\u00b7\u00b9\u0003\b\u0004\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0005\u0006\u0000\u0000\u00be\u00cf\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0003\u0000\u0000\u00c0\u00c1\u0005\u000b\u0000\u0000\u00c1\u00c2"+
		"\u0003\u0018\f\u0000\u00c2\u00c3\u0005\u0013\u0000\u0000\u00c3\u00c4\u0003"+
		"\u0014\n\u0000\u00c4\u00c5\u0005\f\u0000\u0000\u00c5\u00c9\u0005\u0005"+
		"\u0000\u0000\u00c6\u00c8\u0003\b\u0004\u0000\u00c7\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0006\u0000"+
		"\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u008f\u0001\u0000\u0000"+
		"\u0000\u00ce\u009a\u0001\u0000\u0000\u0000\u00ce\u00b0\u0001\u0000\u0000"+
		"\u0000\u00ce\u00bf\u0001\u0000\u0000\u0000\u00cf\u000f\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d6\u0003\u0012\t\u0000\u00d1\u00d2\u0003\u0012\t\u0000"+
		"\u00d2\u00d3\u0003\u001a\r\u0000\u00d3\u00d4\u0003\u0012\t\u0000\u00d4"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d6\u0011\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0006\t\uffff\uffff\u0000\u00d8\u00d9\u0005\u000b\u0000\u0000\u00d9"+
		"\u00da\u0003\u0012\t\u0000\u00da\u00db\u0005\f\u0000\u0000\u00db\u00e4"+
		"\u0001\u0000\u0000\u0000\u00dc\u00de\u0007\u0000\u0000\u0000\u00dd\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e4"+
		"\u0003\u0014\n\u0000\u00e3\u00d7\u0001\u0000\u0000\u0000\u00e3\u00df\u0001"+
		"\u0000\u0000\u0000\u00e4\u00f0\u0001\u0000\u0000\u0000\u00e5\u00e6\n\u0005"+
		"\u0000\u0000\u00e6\u00e7\u0005\u0016\u0000\u0000\u00e7\u00ef\u0003\u0012"+
		"\t\u0005\u00e8\u00e9\n\u0004\u0000\u0000\u00e9\u00ea\u0007\u0001\u0000"+
		"\u0000\u00ea\u00ef\u0003\u0012\t\u0005\u00eb\u00ec\n\u0003\u0000\u0000"+
		"\u00ec\u00ed\u0007\u0000\u0000\u0000\u00ed\u00ef\u0003\u0012\t\u0004\u00ee"+
		"\u00e5\u0001\u0000\u0000\u0000\u00ee\u00e8\u0001\u0000\u0000\u0000\u00ee"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u0013\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f6\u0003\u0016\u000b\u0000\u00f4\u00f6\u0003\u0018\f\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u0015"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\n\u0000\u0000\u00f8\u0017\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005\t\u0000\u0000\u00fa\u0019\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0007\u0002\u0000\u0000\u00fc\u001b\u0001\u0000"+
		"\u0000\u0000\u001c\u001f\'-38<ANWdkqw}\u0088\u008d\u0095\u00a3\u00ab\u00ba"+
		"\u00c9\u00ce\u00d5\u00df\u00e3\u00ee\u00f0\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}