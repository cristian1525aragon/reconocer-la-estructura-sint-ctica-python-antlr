# Generated from rules.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .rulesParser import rulesParser
else:
    from rulesParser import rulesParser

# This class defines a complete generic visitor for a parse tree produced by rulesParser.

class rulesVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by rulesParser#def.
    def visitDef(self, ctx:rulesParser.DefContext):
        return self.visitChildren(ctx)



del rulesParser