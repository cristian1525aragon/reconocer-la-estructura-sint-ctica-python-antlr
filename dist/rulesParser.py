# Generated from rules.g4 by ANTLR 4.10.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,17,26,2,0,7,0,1,0,1,0,5,0,5,8,0,10,0,12,0,8,9,0,1,0,1,0,5,0,
        12,8,0,10,0,12,0,15,9,0,1,0,1,0,5,0,19,8,0,10,0,12,0,22,9,0,1,0,
        1,0,1,0,0,0,1,0,0,2,1,0,10,11,1,0,12,13,27,0,2,1,0,0,0,2,6,5,1,0,
        0,3,5,5,17,0,0,4,3,1,0,0,0,5,8,1,0,0,0,6,4,1,0,0,0,6,7,1,0,0,0,7,
        9,1,0,0,0,8,6,1,0,0,0,9,13,7,0,0,0,10,12,5,17,0,0,11,10,1,0,0,0,
        12,15,1,0,0,0,13,11,1,0,0,0,13,14,1,0,0,0,14,16,1,0,0,0,15,13,1,
        0,0,0,16,20,7,1,0,0,17,19,5,17,0,0,18,17,1,0,0,0,19,22,1,0,0,0,20,
        18,1,0,0,0,20,21,1,0,0,0,21,23,1,0,0,0,22,20,1,0,0,0,23,24,5,2,0,
        0,24,1,1,0,0,0,3,6,13,20
    ]

class rulesParser ( Parser ):

    grammarFileName = "rules.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'while'", "'end'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'_'", "<INVALID>", "' '" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "LOGIC", "SEPARATOR", 
                      "OPERATOR", "INT", "DECIMAL", "VAR", "ELEMENT", "CONDITION", 
                      "C1", "OPERATION", "O1", "ALPHA", "UNDERSCORE", "WS", 
                      "SPACE" ]

    RULE_def = 0

    ruleNames =  [ "def" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    LOGIC=3
    SEPARATOR=4
    OPERATOR=5
    INT=6
    DECIMAL=7
    VAR=8
    ELEMENT=9
    CONDITION=10
    C1=11
    OPERATION=12
    O1=13
    ALPHA=14
    UNDERSCORE=15
    WS=16
    SPACE=17

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class DefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CONDITION(self):
            return self.getToken(rulesParser.CONDITION, 0)

        def C1(self):
            return self.getToken(rulesParser.C1, 0)

        def OPERATION(self):
            return self.getToken(rulesParser.OPERATION, 0)

        def O1(self):
            return self.getToken(rulesParser.O1, 0)

        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(rulesParser.SPACE)
            else:
                return self.getToken(rulesParser.SPACE, i)

        def getRuleIndex(self):
            return rulesParser.RULE_def

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDef" ):
                listener.enterDef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDef" ):
                listener.exitDef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDef" ):
                return visitor.visitDef(self)
            else:
                return visitor.visitChildren(self)




    def def_(self):

        localctx = rulesParser.DefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_def)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(rulesParser.T__0)
            self.state = 6
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==rulesParser.SPACE:
                self.state = 3
                self.match(rulesParser.SPACE)
                self.state = 8
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 9
            _la = self._input.LA(1)
            if not(_la==rulesParser.CONDITION or _la==rulesParser.C1):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 13
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==rulesParser.SPACE:
                self.state = 10
                self.match(rulesParser.SPACE)
                self.state = 15
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 16
            _la = self._input.LA(1)
            if not(_la==rulesParser.OPERATION or _la==rulesParser.O1):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 20
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==rulesParser.SPACE:
                self.state = 17
                self.match(rulesParser.SPACE)
                self.state = 22
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 23
            self.match(rulesParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





