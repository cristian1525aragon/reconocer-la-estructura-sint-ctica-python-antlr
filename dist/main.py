import sys
from antlr4 import *
from rulesLexer import rulesLexer
from rulesParser import rulesParser
from errListener import MyErrorListener

def main():
    error_listener = MyErrorListener()
    while 1:
        texto = input(">>> ").lower()
        input_stream = InputStream(texto)
        lexer = rulesLexer(input_stream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(error_listener)
        stream = CommonTokenStream(lexer)
        parser = rulesParser(stream)
        parser.removeErrorListeners()
        parser.addErrorListener(error_listener)
        try:
            parser.def_()
            print("La sentencia hace parte del lenguaje")
        except:
            print("La sentencia no hace parte del lenguaje")
 
if __name__ == '__main__':
    main()