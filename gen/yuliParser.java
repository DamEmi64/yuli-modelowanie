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
		T__0=1, T__1=2, T__2=3, STARTBLOCK=4, ENDBLOCK=5, IFKW=6, ELSEKW=7, VARIABLE=8, 
		SCIENTIFIC_NUMBER=9, LPAREN=10, RPAREN=11, PLUS=12, MINUS=13, TIMES=14, 
		DIV=15, GT=16, LT=17, EQ=18, POINT=19, POW=20, WS=21;
	public static final int
		RULE_file_ = 0, RULE_functions = 1, RULE_operation = 2, RULE_ifstatements = 3, 
		RULE_loopstatements = 4, RULE_equation = 5, RULE_expression = 6, RULE_atom = 7, 
		RULE_scientific = 8, RULE_variable = 9, RULE_relop = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_", "functions", "operation", "ifstatements", "loopstatements", 
			"equation", "expression", "atom", "scientific", "variable", "relop"
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 14158L) != 0) {
				{
				{
				setState(22);
				functions();
				}
				}
				setState(27);
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
	public static class FunContext extends FunctionsContext {
		public OperationContext inside;
		public TerminalNode VARIABLE() { return getToken(yuliParser.VARIABLE, 0); }
		public TerminalNode STARTBLOCK() { return getToken(yuliParser.STARTBLOCK, 0); }
		public TerminalNode ENDBLOCK() { return getToken(yuliParser.ENDBLOCK, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public FunContext(FunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yuliListener ) ((yuliListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yuliVisitor ) return ((yuliVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		int _la;
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new FunContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__0);
				setState(29);
				match(VARIABLE);
				setState(30);
				match(STARTBLOCK);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 14156L) != 0) {
					{
					{
					setState(31);
					((FunContext)_localctx).inside = operation();
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				match(ENDBLOCK);
				}
				break;
			case T__1:
			case T__2:
			case IFKW:
			case VARIABLE:
			case SCIENTIFIC_NUMBER:
			case LPAREN:
			case PLUS:
			case MINUS:
				_localctx = new GlobalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
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
	public static class SetvariableContext extends OperationContext {
		public VariableContext left;
		public ExpressionContext right;
		public TerminalNode EQ() { return getToken(yuliParser.EQ, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetvariableContext(OperationContext ctx) { copyFrom(ctx); }
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
	public static class PrintfunContext extends OperationContext {
		public VariableContext inside;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PrintfunContext(OperationContext ctx) { copyFrom(ctx); }
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
		enterRule(_localctx, 4, RULE_operation);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new IfgroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				ifstatements();
				}
				break;
			case 2:
				_localctx = new LoopgroupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				loopstatements();
				}
				break;
			case 3:
				_localctx = new SetvariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				((SetvariableContext)_localctx).left = variable();
				setState(44);
				match(EQ);
				setState(45);
				((SetvariableContext)_localctx).right = expression(0);
				}
				break;
			case 4:
				_localctx = new PrintfunContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(T__1);
				setState(48);
				((PrintfunContext)_localctx).inside = variable();
				}
				break;
			case 5:
				_localctx = new EquContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
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
		public TerminalNode ELSEKW() { return getToken(yuliParser.ELSEKW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 6, RULE_ifstatements);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IfelsestatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(IFKW);
				setState(53);
				match(LPAREN);
				setState(54);
				((IfelsestatementContext)_localctx).condition = expression(0);
				setState(55);
				match(RPAREN);
				setState(56);
				match(STARTBLOCK);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 14156L) != 0) {
					{
					{
					setState(57);
					((IfelsestatementContext)_localctx).inside = operation();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(ENDBLOCK);
				setState(64);
				match(ELSEKW);
				setState(65);
				match(STARTBLOCK);
				setState(66);
				((IfelsestatementContext)_localctx).elseinside = expression(0);
				setState(67);
				match(ENDBLOCK);
				}
				break;
			case 2:
				_localctx = new IfstatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(IFKW);
				setState(70);
				match(LPAREN);
				setState(71);
				((IfstatementContext)_localctx).condition = expression(0);
				setState(72);
				match(RPAREN);
				setState(73);
				match(STARTBLOCK);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 14156L) != 0) {
					{
					{
					setState(74);
					((IfstatementContext)_localctx).inside = operation();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
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

	public final LoopstatementsContext loopstatements() throws RecognitionException {
		LoopstatementsContext _localctx = new LoopstatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loopstatements);
		int _la;
		try {
			_localctx = new WhilestatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__2);
			setState(85);
			((WhilestatementContext)_localctx).condition = equation();
			setState(86);
			match(STARTBLOCK);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 14156L) != 0) {
				{
				{
				setState(87);
				((WhilestatementContext)_localctx).inside = operation();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(ENDBLOCK);
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
		enterRule(_localctx, 10, RULE_equation);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new CalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				((CalContext)_localctx).result = expression(0);
				}
				break;
			case 2:
				_localctx = new CompareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				((CompareContext)_localctx).left = expression(0);
				setState(97);
				((CompareContext)_localctx).sign = relop();
				setState(98);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				match(LPAREN);
				setState(104);
				((ParenexprContext)_localctx).inside = expression(0);
				setState(105);
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
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(107);
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
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PowexprContext(new ExpressionContext(_parentctx, _parentState));
						((PowexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(117);
						match(POW);
						setState(118);
						((PowexprContext)_localctx).right = expression(5);
						}
						break;
					case 2:
						{
						_localctx = new TimesordivexprContext(new ExpressionContext(_parentctx, _parentState));
						((TimesordivexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(120);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(121);
						((TimesordivexprContext)_localctx).right = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new PlusorminusexprContext(new ExpressionContext(_parentctx, _parentState));
						((PlusorminusexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(123);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						((PlusorminusexprContext)_localctx).right = expression(4);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 14, RULE_atom);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				scientific();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
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
		enterRule(_localctx, 16, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
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
		enterRule(_localctx, 18, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		enterRule(_localctx, 20, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0) ) {
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
		case 6:
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
		"\u0004\u0001\u0015\u008d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000"+
		"\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00023\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003;\b\u0003\n\u0003\f\u0003>\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003S\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004Y\b\u0004\n\u0004\f\u0004\\\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005e\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006m\b\u0006\n\u0006\f\u0006p\t\u0006\u0001"+
		"\u0006\u0003\u0006s\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006~\b\u0006\n\u0006\f\u0006\u0081\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0085\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0000\u0001\f\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0003\u0001\u0000\f\r\u0001\u0000\u000e\u000f\u0001"+
		"\u0000\u0010\u0012\u0093\u0000\u0019\u0001\u0000\u0000\u0000\u0002\'\u0001"+
		"\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006R\u0001\u0000\u0000"+
		"\u0000\bT\u0001\u0000\u0000\u0000\nd\u0001\u0000\u0000\u0000\fr\u0001"+
		"\u0000\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010\u0086\u0001"+
		"\u0000\u0000\u0000\u0012\u0088\u0001\u0000\u0000\u0000\u0014\u008a\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0001\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005"+
		"\u0001\u0000\u0000\u001d\u001e\u0005\b\u0000\u0000\u001e\"\u0005\u0004"+
		"\u0000\u0000\u001f!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#%\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%(\u0005\u0005"+
		"\u0000\u0000&(\u0003\u0004\u0002\u0000\'\u001c\u0001\u0000\u0000\u0000"+
		"\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)3\u0003\u0006"+
		"\u0003\u0000*3\u0003\b\u0004\u0000+,\u0003\u0012\t\u0000,-\u0005\u0012"+
		"\u0000\u0000-.\u0003\f\u0006\u0000.3\u0001\u0000\u0000\u0000/0\u0005\u0002"+
		"\u0000\u000003\u0003\u0012\t\u000013\u0003\n\u0005\u00002)\u0001\u0000"+
		"\u0000\u00002*\u0001\u0000\u0000\u00002+\u0001\u0000\u0000\u00002/\u0001"+
		"\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0005\u0001\u0000\u0000"+
		"\u000045\u0005\u0006\u0000\u000056\u0005\n\u0000\u000067\u0003\f\u0006"+
		"\u000078\u0005\u000b\u0000\u00008<\u0005\u0004\u0000\u00009;\u0003\u0004"+
		"\u0002\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000?@\u0005\u0005\u0000\u0000@A\u0005\u0007\u0000"+
		"\u0000AB\u0005\u0004\u0000\u0000BC\u0003\f\u0006\u0000CD\u0005\u0005\u0000"+
		"\u0000DS\u0001\u0000\u0000\u0000EF\u0005\u0006\u0000\u0000FG\u0005\n\u0000"+
		"\u0000GH\u0003\f\u0006\u0000HI\u0005\u000b\u0000\u0000IM\u0005\u0004\u0000"+
		"\u0000JL\u0003\u0004\u0002\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0005\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000R4\u0001\u0000\u0000\u0000RE\u0001\u0000\u0000"+
		"\u0000S\u0007\u0001\u0000\u0000\u0000TU\u0005\u0003\u0000\u0000UV\u0003"+
		"\n\u0005\u0000VZ\u0005\u0004\u0000\u0000WY\u0003\u0004\u0002\u0000XW\u0001"+
		"\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000]^\u0005\u0005\u0000\u0000^\t\u0001\u0000\u0000\u0000_e\u0003\f"+
		"\u0006\u0000`a\u0003\f\u0006\u0000ab\u0003\u0014\n\u0000bc\u0003\f\u0006"+
		"\u0000ce\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000d`\u0001\u0000"+
		"\u0000\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0006\u0006\uffff\uffff"+
		"\u0000gh\u0005\n\u0000\u0000hi\u0003\f\u0006\u0000ij\u0005\u000b\u0000"+
		"\u0000js\u0001\u0000\u0000\u0000km\u0007\u0000\u0000\u0000lk\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qs\u0003\u000e\u0007\u0000rf\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000"+
		"\u0000s\u007f\u0001\u0000\u0000\u0000tu\n\u0005\u0000\u0000uv\u0005\u0014"+
		"\u0000\u0000v~\u0003\f\u0006\u0005wx\n\u0004\u0000\u0000xy\u0007\u0001"+
		"\u0000\u0000y~\u0003\f\u0006\u0005z{\n\u0003\u0000\u0000{|\u0007\u0000"+
		"\u0000\u0000|~\u0003\f\u0006\u0004}t\u0001\u0000\u0000\u0000}w\u0001\u0000"+
		"\u0000\u0000}z\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\r\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0003\u0010\b\u0000\u0083\u0085\u0003\u0012\t\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u000f\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087\u0011\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005\b\u0000\u0000\u0089\u0013\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0007\u0002\u0000\u0000\u008b\u0015\u0001\u0000\u0000"+
		"\u0000\u000e\u0019\"\'2<MRZdnr}\u007f\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}