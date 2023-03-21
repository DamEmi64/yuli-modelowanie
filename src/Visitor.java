import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Visitor extends yuliBaseVisitor<Double>{

    public  List<HashMap<String,Double>> variables = new LinkedList<HashMap<String,Double>>();

    public  HashMap<String, ParseTree> functions = new HashMap<>();

    public HashMap<String, List<String>> funcargs = new HashMap<String, List<String>>();

    public String buf;

    public CharStream input;

    public Visitor()
    {
        variables.add(new HashMap<String,Double>());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
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

        for ( int i = variables.size() - 1 ; i >= 0; i--)
        {
            if (variables.get(i).containsKey(ctx.VARIABLE().getText()))
            {
                return variables.get(i).get(ctx.VARIABLE().getText());
            }
        }

        return Double.valueOf(0);
    }
    @Override public Double visitSetvariable(yuliParser.SetvariableContext ctx) {

        for ( int i = variables.size() - 1 ; i >= 0; i--)
        {
            if (variables.get(i).containsKey(ctx.left.getText()))
            {
                return variables.get(i).put(ctx.left.getText(), Double.valueOf(visit(ctx.right)));
            }
        }

        return variables.get(variables.size()-1).put(ctx.left.getText(), Double.valueOf(visit(ctx.right)));
    }
    @Override public Double visitCal(yuliParser.CalContext ctx) { return visit(ctx.result); }

    @Override public Double visitPrintfun(yuliParser.PrintfunContext ctx) {
        System.out.println( visit(ctx.inside));
        return  Double.valueOf(0);
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
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Double visitForstatementwithcondition(yuliParser.ForstatementwithconditionContext ctx)
    {
        Double a = Double.valueOf(0);
        var begin = visit(ctx.startwhile);
        var end = visit(ctx.endwhile);
        while ( Math.round(begin) != Math.round(end) )
        {
            a = visit(ctx.inside);
            begin = visit(ctx.condition);
        }

        return a;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Double visitWhilestatementwithoutcondition(yuliParser.WhilestatementwithoutconditionContext ctx) {

        Double a = Double.valueOf(0);
        var begin = visit(ctx.startwhile);
        var end = visit(ctx.endwhile);
        while ( Math.round(begin) != Math.round(end) )
        {
            a = visit(ctx.inside);
            if (begin < end)
            {
                begin++;

            }
            else
            {
                begin--;
            }
        }

        return a;
    }


    @Override public Double visitWhilestatementwithoutconditionindex(yuliParser.WhilestatementwithoutconditionindexContext ctx) {
        Double a = Double.valueOf(0);
        var begin = visit(ctx.startwhile);
        var end = visit(ctx.endwhile);
        while ( Math.round(begin) != Math.round(end) )
        {
            a = visit(ctx.inside);
            if (begin < end)
            {
                variables.get(variables.size()-1).put(ctx.startwhile.getText(), Double.valueOf(begin));
                begin++;

            }
            else
            {
                variables.get(variables.size()-1).put(ctx.startwhile.getText(), Double.valueOf(begin));
                begin--;
            }
        }

        return a;
    }
    /**
     *
     * @param ctx
     * @return
     */
    @Override public Double visitCallfun(yuliParser.CallfunContext ctx) {
        var hashmap = new HashMap<String,Double>();
        for (int i =0; i < funcargs.get(ctx.name.getText()).size(); i++) {
            hashmap.put(funcargs.get(ctx.name.getText()).get(i),Double.valueOf(0));
        }
        variables.add(hashmap);
        var func = functions.get(ctx.name.getText());
        if (ctx.args!= null)
        {
            visit(ctx.args);
        }

        if (func != null)
        {
            var a =  visit(func);
            variables.remove(hashmap);
            return  a;
        }
        return Double.valueOf(0);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Double visitFuninit(yuliParser.FuninitContext ctx) {

        if (ctx.inside != null)
        {
            buf = ctx.VARIABLE().getText();
            functions.put(buf,ctx.funcbody());
            var list =  new LinkedList<String>();
            for (int i =0; i < ctx.atom().size();i++)
            {
                list.add(ctx.atom(i).getText());
            }
            funcargs.put(ctx.VARIABLE().getText(),list);
        }
        return  Double.valueOf(0);
    }
/*    private String GetText(ParserRuleContext ctx)
    {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        if (input == null) throw new NullPointerException();
        return  input.getText(new interval(a,b));
    }*/
}