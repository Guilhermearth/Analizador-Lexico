package src;

import java.io.IOException;
import java.io.StringReader;

public class Testador {

	public static void main(String[] args) throws IOException {
		
		String string = "Teste Funcionamento Analisador + @ @ # if then";
        AnalisadorLexico lexical = new AnalisadorLexico(new StringReader(string));
        lexical.yylex();
    
	}

}
