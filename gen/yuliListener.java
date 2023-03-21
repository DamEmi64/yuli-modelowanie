// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link yuliParser}.
 */
public interface yuliListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link yuliParser#file_}.
	 * @param ctx the parse tree
	 */
	void enterFile_(yuliParser.File_Context ctx);
	/**
	 * Exit a parse tree produced by {@link yuliParser#file_}.
	 * @param ctx the parse tree
	 */
	void exitFile_(yuliParser.File_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code funinit}
	 * labeled alternative in {@link yuliParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFuninit(yuliParser.FuninitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funinit}
	 * labeled alternative in {@link yuliParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFuninit(yuliParser.FuninitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code global}
	 * labeled alternative in {@link yuliParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(yuliParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code global}
	 * labeled alternative in {@link yuliParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(yuliParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link yuliParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(yuliParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link yuliParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(yuliParser.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setvariable}
	 * labeled alternative in {@link yuliParser#setargs}.
	 * @param ctx the parse tree
	 */
	void enterSetvariable(yuliParser.SetvariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setvariable}
	 * labeled alternative in {@link yuliParser#setargs}.
	 * @param ctx the parse tree
	 */
	void exitSetvariable(yuliParser.SetvariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifgroup}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterIfgroup(yuliParser.IfgroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifgroup}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitIfgroup(yuliParser.IfgroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callfun}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterCallfun(yuliParser.CallfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callfun}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitCallfun(yuliParser.CallfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopgroup}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterLoopgroup(yuliParser.LoopgroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopgroup}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitLoopgroup(yuliParser.LoopgroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setargument}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterSetargument(yuliParser.SetargumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setargument}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitSetargument(yuliParser.SetargumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialfunc}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterSpecialfunc(yuliParser.SpecialfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialfunc}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitSpecialfunc(yuliParser.SpecialfuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equ}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterEqu(yuliParser.EquContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equ}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitEqu(yuliParser.EquContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printfun}
	 * labeled alternative in {@link yuliParser#specialfun}.
	 * @param ctx the parse tree
	 */
	void enterPrintfun(yuliParser.PrintfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printfun}
	 * labeled alternative in {@link yuliParser#specialfun}.
	 * @param ctx the parse tree
	 */
	void exitPrintfun(yuliParser.PrintfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelsestatement}
	 * labeled alternative in {@link yuliParser#ifstatements}.
	 * @param ctx the parse tree
	 */
	void enterIfelsestatement(yuliParser.IfelsestatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelsestatement}
	 * labeled alternative in {@link yuliParser#ifstatements}.
	 * @param ctx the parse tree
	 */
	void exitIfelsestatement(yuliParser.IfelsestatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstatement}
	 * labeled alternative in {@link yuliParser#ifstatements}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(yuliParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstatement}
	 * labeled alternative in {@link yuliParser#ifstatements}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(yuliParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whilestatement}
	 * labeled alternative in {@link yuliParser#loopstatements}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(yuliParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whilestatement}
	 * labeled alternative in {@link yuliParser#loopstatements}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(yuliParser.WhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forstatementwithcondition}
	 * labeled alternative in {@link yuliParser#loopstatements}.
	 * @param ctx the parse tree
	 */
	void enterForstatementwithcondition(yuliParser.ForstatementwithconditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forstatementwithcondition}
	 * labeled alternative in {@link yuliParser#loopstatements}.
	 * @param ctx the parse tree
	 */
	void exitForstatementwithcondition(yuliParser.ForstatementwithconditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whilestatementwithoutcondition}
	 * labeled alternative in {@link yuliParser#loopstatements}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatementwithoutcondition(yuliParser.WhilestatementwithoutconditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whilestatementwithoutcondition}
	 * labeled alternative in {@link yuliParser#loopstatements}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatementwithoutcondition(yuliParser.WhilestatementwithoutconditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whilestatementwithoutconditionindex}
	 * labeled alternative in {@link yuliParser#loopstatements}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatementwithoutconditionindex(yuliParser.WhilestatementwithoutconditionindexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whilestatementwithoutconditionindex}
	 * labeled alternative in {@link yuliParser#loopstatements}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatementwithoutconditionindex(yuliParser.WhilestatementwithoutconditionindexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cal}
	 * labeled alternative in {@link yuliParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterCal(yuliParser.CalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cal}
	 * labeled alternative in {@link yuliParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitCal(yuliParser.CalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link yuliParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterCompare(yuliParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link yuliParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitCompare(yuliParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomexpr(yuliParser.AtomexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomexpr(yuliParser.AtomexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timesordivexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTimesordivexpr(yuliParser.TimesordivexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timesordivexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTimesordivexpr(yuliParser.TimesordivexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusorminusexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusorminusexpr(yuliParser.PlusorminusexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusorminusexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusorminusexpr(yuliParser.PlusorminusexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowexpr(yuliParser.PowexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowexpr(yuliParser.PowexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenexpr(yuliParser.ParenexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenexpr(yuliParser.ParenexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link yuliParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(yuliParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link yuliParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(yuliParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link yuliParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(yuliParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link yuliParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(yuliParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link yuliParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(yuliParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link yuliParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(yuliParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link yuliParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(yuliParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link yuliParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(yuliParser.RelopContext ctx);
}