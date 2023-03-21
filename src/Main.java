import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        try {
 /*           Scanner scanner = new Scanner(System.in);
            CharStream input = CharStreams.fromStream(new FileInputStream(scanner.nextLine()));*/
            CharStream input = CharStreams.fromStream(System.in);

            // create a lexer that feeds off of input CharStream
            yuliLexer lexer = new yuliLexer(input);

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            yuliParser parser = new yuliParser(tokens);

            // start parsing at the program rule
            ParseTree tree = parser.file_();
            //    System.out.println(tree.toStringTree());

            // create a visitor to traverse the parse tree
            Visitor visitor = new Visitor();

            Double result = (Double)visitor.visit(tree);
            if (result != null)
            {
                System.out.println(result.toString());
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}