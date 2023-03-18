import org.antlr.v4.runtime.CharStream;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Visitor extends yuliBaseVisitor<Double>{

    public static HashMap<String,Double> globalVariable = new HashMap<String,Double>();

    public static List<HashMap<String,Double>> localVariable = new LinkedList<HashMap<String,Double>>();

    public static Boolean isLocal = false;

    public CharStream input;

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Double visitFun(yuliParser.FunContext ctx) {

        localVariable.add(new HashMap<>());
        var a = visit(ctx.inside);
     //   localVariable.get(localVariable.size()-1);
        localVariable.remove(localVariable.get(localVariable.size()-1));
        return  a;
    }
    @Override public Double visitGlobal(yuliParser.GlobalContext ctx) {
        return  visit(ctx.inside);
    }

    @Override public Double visitTimesordivexpr(yuliParser.TimesordivexprContext ctx) {
        if (ctx.TIMES() != null)
        {
            return visit(ctx.left) *  visit(ctx.right);
        }

        return visit(ctx.left) /  visit(ctx.right);
    }

    @Override public Double visitPlusorminusexpr(yuliParser.PlusorminusexprContext ctx) {
        if (ctx.PLUS() != null)
        {
            return visit(ctx.left) + visit(ctx.right);
        }

        return visit(ctx.left) - visit(ctx.right);
    }

    @Override public Double visitScientific(yuliParser.ScientificContext ctx) { return Double.parseDouble(ctx.SCIENTIFIC_NUMBER().getText()); }

    @Override public Double visitPowexpr(yuliParser.PowexprContext ctx) {
        return Math.pow(visit(ctx.left),visit(ctx.right));
    }

    @Override public Double visitParenexpr(yuliParser.ParenexprContext ctx) {
        return visit(ctx.expression());
    }

    @Override public Double visitVariable(yuliParser.VariableContext ctx) {
        var variable  = ctx.VARIABLE().getText();
        var locals = localVariable.get(localVariable.size()-1);
        if (locals.containsKey(variable))
        {
            return locals.get(variable);
        }
        if (globalVariable.containsKey(variable))
        {
            return  globalVariable.get(variable);
        }

        return Double.valueOf(0);
    }
    @Override public Double visitSetvariable(yuliParser.SetvariableContext ctx) {

        var variable  = ctx.left.getText();
        if (isLocal)
        {
            var locals = localVariable.get(localVariable.size()-1);
            locals.put(variable,visit(ctx.right));
        }
        else
        {
            globalVariable.put(variable,visit(ctx.right));
        }
        return Double.parseDouble(variable);
    }
    @Override public Double visitCal(yuliParser.CalContext ctx) { return visit(ctx.result); }

    @Override public Double visitPrintfun(yuliParser.PrintfunContext ctx) {
        System.out.println(ctx.inside.getText());
        return visitChildren(ctx);
    }

    @Override public Double visitCompare(yuliParser.CompareContext ctx) {
        if (ctx.relop().EQ() != null)
        {
            if (Math.round(visit(ctx.left)) == Math.round(visit(ctx.right)))
            {
                return Double.valueOf(1);
            }
            return Double.valueOf(0);
        }
        else if (ctx.relop().LT() != null)
        {
            if (visit(ctx.left) < visit(ctx.right))
            {
                return Double.valueOf(1);
            }
            return Double.valueOf(0);
        }
        else
        {
            if (visit(ctx.left) > visit(ctx.right))
            {
                return Double.valueOf(1);
            }
            return Double.valueOf(0);
        }
    }

    @Override public Double visitIfstatement(yuliParser.IfstatementContext ctx) {
        if (Math.round(visit(ctx.condition)) > 0)
        {
            if (ctx.inside == null) {
                return Double.valueOf(0);
            }
            return visit(ctx.inside);
        }
        else {
            return Double.valueOf(0);
        }

    }

    @Override public Double visitIfelsestatement(yuliParser.IfelsestatementContext ctx) {
        if (Math.round(visit(ctx.condition)) > 0)
        {
            if (ctx.inside == null) {
                return Double.valueOf(0);
            }
            return visit(ctx.inside);
        }
        else
        {
            if (ctx.elseinside == null) {
                return Double.valueOf(0);
            }
            return visit(ctx.elseinside);
        }
    }
    @Override public Double visitWhilestatement(yuliParser.WhilestatementContext ctx) {
        Double a = Double.valueOf(0);
        while (Math.round(visit(ctx.condition))>0)
        {
            a = visit(ctx.inside);
        }

        return a;
    }

/*    private String GetText(ParserRuleContext ctx)
    {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        if (input == null) throw new NullPointerException();
        return  input.getText(new interval(a,b));
    }*/
}