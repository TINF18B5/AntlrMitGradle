import org.antlr.v4.runtime.*;

public class AntlrWithGradleMain {
    
    public static void main(String[] args) throws Exception {
        if(args.length == 0) {
            System.err.println("No file was provided as Runtime Parameter!");
            System.exit(1);
        }
    
        System.out.println("===============");
        System.out.println("==== BEGIN ====");
    
        final CharStream inputStream = CharStreams.fromFileName(args[0]);
        final HelloWorldLexer lexer = new HelloWorldLexer(inputStream);
    
        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    
        final HelloWorldParser parser = new HelloWorldParser(tokenStream);
    
        //Root of AST
        final HelloWorldParser.GreetingsContext greetingsNT = parser.greetings();
    
        //Print Parse Tree
        System.out.println(greetingsNT.toStringTree(parser));
        
        
        System.out.println("====  END  ====");
        System.out.println("===============");
    }
}
