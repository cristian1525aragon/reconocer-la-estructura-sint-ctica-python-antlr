// Generated from c:\Users\Lenovo\Documents\compiladores\proyecto final\rules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LOGIC=3, SEPARATOR=4, OPERATOR=5, INT=6, DECIMAL=7, VAR=8, 
		ELEMENT=9, CONDITION=10, C1=11, OPERATION=12, O1=13, ALPHA=14, UNDERSCORE=15, 
		WS=16, SPACE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "LOGIC", "SEPARATOR", "OPERATOR", "INT", "DECIMAL", "VAR", 
			"ELEMENT", "CONDITION", "C1", "OPERATION", "O1", "ALPHA", "UNDERSCORE", 
			"WS", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'end'", null, null, null, null, null, null, null, null, 
			null, null, null, null, "'_'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "LOGIC", "SEPARATOR", "OPERATOR", "INT", "DECIMAL", 
			"VAR", "ELEMENT", "CONDITION", "C1", "OPERATION", "O1", "ALPHA", "UNDERSCORE", 
			"WS", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public rulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00c8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\7\6\7D\n\7\r"+
		"\7\16\7E\3\b\5\bI\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\tX\n\t\f\t\16\t[\13\t\3\t\5\t^\n\t\3\n\3\n\3\n\5\nc\n\n\3\n\5\n"+
		"f\n\n\3\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\13\3\13\7\13q\n\13\f\13"+
		"\16\13t\13\13\3\13\3\13\3\13\5\13y\n\13\3\13\7\13|\n\13\f\13\16\13\177"+
		"\13\13\3\13\3\13\7\13\u0083\n\13\f\13\16\13\u0086\13\13\3\13\3\13\5\13"+
		"\u008a\n\13\7\13\u008c\n\13\f\13\16\13\u008f\13\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\7\r\u0097\n\r\f\r\16\r\u009a\13\r\3\r\3\r\7\r\u009e\n\r\f\r\16\r"+
		"\u00a1\13\r\3\r\3\r\7\r\u00a5\n\r\f\r\16\r\u00a8\13\r\3\r\3\r\7\r\u00ac"+
		"\n\r\f\r\16\r\u00af\13\r\3\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21\u00c1\n\21\r\21\16\21\u00c2"+
		"\3\21\3\21\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\7\4\2>>@@\6\2,-//\61\61``"+
		"\3\2\62;\4\2C\\c|\5\2\f\f\17\17\"\"\2\u00e3\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5+\3\2\2\2"+
		"\78\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rC\3\2\2\2\17H\3\2\2\2\21N\3\2\2\2"+
		"\23e\3\2\2\2\25x\3\2\2\2\27\u0090\3\2\2\2\31\u0094\3\2\2\2\33\u00b7\3"+
		"\2\2\2\35\u00bb\3\2\2\2\37\u00bd\3\2\2\2!\u00c0\3\2\2\2#\u00c6\3\2\2\2"+
		"%&\7y\2\2&\'\7j\2\2\'(\7k\2\2()\7n\2\2)*\7g\2\2*\4\3\2\2\2+,\7g\2\2,-"+
		"\7p\2\2-.\7f\2\2.\6\3\2\2\2/\60\7?\2\2\609\7?\2\2\61\62\7@\2\2\629\7?"+
		"\2\2\63\64\7>\2\2\649\7?\2\2\659\t\2\2\2\66\67\7\u0080\2\2\679\7?\2\2"+
		"8/\3\2\2\28\61\3\2\2\28\63\3\2\2\28\65\3\2\2\28\66\3\2\2\29\b\3\2\2\2"+
		":;\7(\2\2;?\7(\2\2<=\7~\2\2=?\7~\2\2>:\3\2\2\2><\3\2\2\2?\n\3\2\2\2@A"+
		"\t\3\2\2A\f\3\2\2\2BD\t\4\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2"+
		"F\16\3\2\2\2GI\7/\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\5\r\7\2KL\7\60\2"+
		"\2LM\5\r\7\2M\20\3\2\2\2NY\5\35\17\2OX\5\35\17\2PQ\5\37\20\2QR\5\35\17"+
		"\2RX\3\2\2\2ST\5\37\20\2TU\5\r\7\2UX\3\2\2\2VX\5\r\7\2WO\3\2\2\2WP\3\2"+
		"\2\2WS\3\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2"+
		"\2\2\\^\5\37\20\2]\\\3\2\2\2]^\3\2\2\2^\22\3\2\2\2_f\5\21\t\2`f\5\17\b"+
		"\2ac\7/\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2df\5\r\7\2e_\3\2\2\2e`\3\2\2"+
		"\2eb\3\2\2\2f\24\3\2\2\2gk\5\23\n\2hj\5#\22\2ih\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2nr\5\7\4\2oq\5#\22\2po\3\2\2\2qt\3"+
		"\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\5\23\n\2vy\3\2\2\2wy"+
		"\5\27\f\2xg\3\2\2\2xw\3\2\2\2y\u008d\3\2\2\2z|\5#\22\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0084\5"+
		"\t\5\2\u0081\u0083\5#\22\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0089\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u008a\5\25\13\2\u0088\u008a\5\27\f\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008c\3\2\2\2\u008b}\3\2\2\2\u008c\u008f\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\26\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0091\7*\2\2\u0091\u0092\5\25\13\2\u0092\u0093\7+\2\2\u0093"+
		"\30\3\2\2\2\u0094\u0098\5\23\n\2\u0095\u0097\5#\22\2\u0096\u0095\3\2\2"+
		"\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009f\5\13\6\2\u009c\u009e\5#\22\2"+
		"\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00b4\5\23\n\2"+
		"\u00a3\u00a5\5#\22\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ad\5\13\6\2\u00aa\u00ac\5#\22\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3"+
		"\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\5\23\n\2\u00b1\u00b3\3\2\2\2\u00b2\u00a6\3"+
		"\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\32\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\u00b9\5\31\r"+
		"\2\u00b9\u00ba\7+\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\t\5\2\2\u00bc\36\3"+
		"\2\2\2\u00bd\u00be\7a\2\2\u00be \3\2\2\2\u00bf\u00c1\t\6\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\b\21\2\2\u00c5\"\3\2\2\2\u00c6\u00c7\7\"\2"+
		"\2\u00c7$\3\2\2\2\31\28>EHWY]bekrx}\u0084\u0089\u008d\u0098\u009f\u00a6"+
		"\u00ad\u00b4\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}