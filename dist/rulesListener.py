# Generated from rules.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .rulesParser import rulesParser
else:
    from rulesParser import rulesParser

# This class defines a complete listener for a parse tree produced by rulesParser.
class rulesListener(ParseTreeListener):

    # Enter a parse tree produced by rulesParser#def.
    def enterDef(self, ctx:rulesParser.DefContext):
        pass

    # Exit a parse tree produced by rulesParser#def.
    def exitDef(self, ctx:rulesParser.DefContext):
        pass



del rulesParser