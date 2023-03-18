// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link yuliParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface yuliVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link yuliParser#file_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_(yuliParser.File_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code fun}
	 * labeled alternative in {@link yuliParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(yuliParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code global}
	 * labeled alternative in {@link yuliParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(yuliParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifgroup}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfgroup(yuliParser.IfgroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopgroup}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopgroup(yuliParser.LoopgroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setvariable}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetvariable(yuliParser.SetvariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printfun}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintfun(yuliParser.PrintfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equ}
	 * labeled alternative in {@link yuliParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqu(yuliParser.EquContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelsestatement}
	 * labeled alternative in {@link yuliParser#ifstatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelsestatement(yuliParser.IfelsestatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifstatement}
	 * labeled alternative in {@link yuliParser#ifstatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(yuliParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whilestatement}
	 * labeled alternative in {@link yuliParser#loopstatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(yuliParser.WhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cal}
	 * labeled alternative in {@link yuliParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCal(yuliParser.CalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link yuliParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(yuliParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomexpr(yuliParser.AtomexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timesordivexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesordivexpr(yuliParser.TimesordivexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusorminusexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusorminusexpr(yuliParser.PlusorminusexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowexpr(yuliParser.PowexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenexpr}
	 * labeled alternative in {@link yuliParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenexpr(yuliParser.ParenexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link yuliParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(yuliParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link yuliParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(yuliParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link yuliParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(yuliParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link yuliParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(yuliParser.RelopContext ctx);
}