// Generated from F:/Julian/Universidad/2024-1/Lenguajes de programación/Analizador Semántico/AnalizadorSemanticoV1/grammar/GramaticaLatino.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaLatinoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, OPASIG=51, OPREL=52, 
		ID=53, CADENA_DE_CARACTERES=54, VALOR_REAL=55, ESP=56, BlockComment=57, 
		LineComment=58;
	public static final int
		RULE_s = 0, RULE_statement = 1, RULE_builtin = 2, RULE_contimprimirf = 3, 
		RULE_auxcontimprimirf = 4, RULE_condicionales = 5, RULE_osi = 6, RULE_sino = 7, 
		RULE_contelegir = 8, RULE_eleccioncaso = 9, RULE_casoexp = 10, RULE_dospara = 11, 
		RULE_trespara = 12, RULE_declfunciones = 13, RULE_returnstat = 14, RULE_idrelated = 15, 
		RULE_dicc = 16, RULE_incdec = 17, RULE_func = 18, RULE_contdeclfunciones = 19, 
		RULE_asig = 20, RULE_auxcual = 21, RULE_auxidasig = 22, RULE_cual = 23, 
		RULE_lista = 24, RULE_auxlista = 25, RULE_dic = 26, RULE_auxdic = 27, 
		RULE_exp = 28, RULE_e = 29, RULE_builtinexp = 30, RULE_auxid = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "statement", "builtin", "contimprimirf", "auxcontimprimirf", "condicionales", 
			"osi", "sino", "contelegir", "eleccioncaso", "casoexp", "dospara", "trespara", 
			"declfunciones", "returnstat", "idrelated", "dicc", "incdec", "func", 
			"contdeclfunciones", "asig", "auxcual", "auxidasig", "cual", "lista", 
			"auxlista", "dic", "auxdic", "exp", "e", "builtinexp", "auxid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'romper'", "'imprimir'", "'('", "')'", "'escribir'", "'poner'", 
			"'imprimirf'", "'limpiar'", "'acadena'", "','", "'si'", "'fin'", "'elegir'", 
			"'desde'", "';'", "'mientras'", "'para'", "'en'", "'rango'", "'repetir'", 
			"'hasta'", "'osi'", "'sino'", "'caso'", "':'", "'defecto'", "'otro'", 
			"'funcion'", "'fun'", "'retornar'", "'ret'", "'retorno'", "'.'", "'++'", 
			"'--'", "'['", "']'", "'leer'", "'{'", "'}'", "'+'", "'-'", "'verdadero'", 
			"'cierto'", "'falso'", "'nulo'", "'!'", "'alogico'", "'anumero'", "'tipo'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "OPASIG", "OPREL", "ID", "CADENA_DE_CARACTERES", "VALOR_REAL", 
			"ESP", "BlockComment", "LineComment"
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

	@Override
	public String getGrammarFileName() { return "GramaticaLatino.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaLatinoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			statement();
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					s();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IdrelatedContext idrelated() {
			return getRuleContext(IdrelatedContext.class,0);
		}
		public BuiltinContext builtin() {
			return getRuleContext(BuiltinContext.class,0);
		}
		public CondicionalesContext condicionales() {
			return getRuleContext(CondicionalesContext.class,0);
		}
		public DeclfuncionesContext declfunciones() {
			return getRuleContext(DeclfuncionesContext.class,0);
		}
		public ReturnstatContext returnstat() {
			return getRuleContext(ReturnstatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				idrelated();
				}
				break;
			case T__0:
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				builtin();
				}
				break;
			case T__10:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				condicionales();
				}
				break;
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				declfunciones();
				}
				break;
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				returnstat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltinContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ContimprimirfContext contimprimirf() {
			return getRuleContext(ContimprimirfContext.class,0);
		}
		public BuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterBuiltin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitBuiltin(this);
		}
	}

	public final BuiltinContext builtin() throws RecognitionException {
		BuiltinContext _localctx = new BuiltinContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_builtin);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__1);
				setState(80);
				match(T__2);
				setState(81);
				exp(0);
				setState(82);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(T__4);
				setState(85);
				match(T__2);
				setState(86);
				exp(0);
				setState(87);
				match(T__3);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(T__5);
				setState(90);
				match(T__2);
				setState(91);
				exp(0);
				setState(92);
				match(T__3);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(T__6);
				setState(95);
				match(T__2);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65300614854214152L) != 0)) {
					{
					setState(96);
					contimprimirf();
					}
				}

				setState(99);
				match(T__3);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(T__7);
				setState(101);
				match(T__2);
				setState(102);
				match(T__3);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				match(T__8);
				setState(104);
				match(T__2);
				setState(105);
				exp(0);
				setState(106);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContimprimirfContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<AuxcontimprimirfContext> auxcontimprimirf() {
			return getRuleContexts(AuxcontimprimirfContext.class);
		}
		public AuxcontimprimirfContext auxcontimprimirf(int i) {
			return getRuleContext(AuxcontimprimirfContext.class,i);
		}
		public ContimprimirfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contimprimirf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterContimprimirf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitContimprimirf(this);
		}
	}

	public final ContimprimirfContext contimprimirf() throws RecognitionException {
		ContimprimirfContext _localctx = new ContimprimirfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_contimprimirf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			exp(0);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(111);
				auxcontimprimirf();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AuxcontimprimirfContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AuxcontimprimirfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxcontimprimirf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterAuxcontimprimirf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitAuxcontimprimirf(this);
		}
	}

	public final AuxcontimprimirfContext auxcontimprimirf() throws RecognitionException {
		AuxcontimprimirfContext _localctx = new AuxcontimprimirfContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_auxcontimprimirf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__9);
			setState(118);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalesContext extends ParserRuleContext {
		public CondicionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionales; }
	 
		public CondicionalesContext() { }
		public void copyFrom(CondicionalesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MientrasContext extends CondicionalesContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MientrasContext(CondicionalesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitMientras(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaContext extends CondicionalesContext {
		public TerminalNode ID() { return getToken(GramaticaLatinoParser.ID, 0); }
		public TerminalNode VALOR_REAL() { return getToken(GramaticaLatinoParser.VALOR_REAL, 0); }
		public DosparaContext dospara() {
			return getRuleContext(DosparaContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParaContext(CondicionalesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitPara(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SiContext extends CondicionalesContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<OsiContext> osi() {
			return getRuleContexts(OsiContext.class);
		}
		public OsiContext osi(int i) {
			return getRuleContext(OsiContext.class,i);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public SiContext(CondicionalesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitSi(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepetirContext extends CondicionalesContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RepetirContext(CondicionalesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitRepetir(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElegirContext extends CondicionalesContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ContelegirContext contelegir() {
			return getRuleContext(ContelegirContext.class,0);
		}
		public ElegirContext(CondicionalesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterElegir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitElegir(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DesdeContext extends CondicionalesContext {
		public TerminalNode ID() { return getToken(GramaticaLatinoParser.ID, 0); }
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DesdeContext(CondicionalesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterDesde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitDesde(this);
		}
	}

	public final CondicionalesContext condicionales() throws RecognitionException {
		CondicionalesContext _localctx = new CondicionalesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicionales);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new SiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__10);
				setState(121);
				exp(0);
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					statement();
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(127);
					osi();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(133);
					sino();
					}
				}

				setState(136);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new ElegirContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__12);
				setState(139);
				exp(0);
				setState(140);
				contelegir();
				setState(141);
				match(T__11);
				}
				break;
			case T__13:
				_localctx = new DesdeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(T__13);
				setState(144);
				match(T__2);
				setState(145);
				match(ID);
				setState(146);
				asig();
				setState(147);
				match(T__14);
				setState(148);
				exp(0);
				setState(149);
				match(T__14);
				setState(150);
				statement();
				setState(151);
				match(T__3);
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(152);
					statement();
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
				setState(157);
				match(T__11);
				}
				break;
			case T__15:
				_localctx = new MientrasContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(T__15);
				setState(160);
				exp(0);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					statement();
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
				setState(166);
				match(T__11);
				}
				break;
			case T__16:
				_localctx = new ParaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(T__16);
				setState(169);
				match(ID);
				setState(170);
				match(T__17);
				setState(171);
				match(T__18);
				setState(172);
				match(T__2);
				setState(173);
				match(VALOR_REAL);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(174);
					dospara();
					}
				}

				setState(177);
				match(T__3);
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					statement();
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
				setState(183);
				match(T__11);
				}
				break;
			case T__19:
				_localctx = new RepetirContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				match(T__19);
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					statement();
					}
					}
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
				setState(191);
				match(T__20);
				setState(192);
				exp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OsiContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public OsiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_osi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterOsi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitOsi(this);
		}
	}

	public final OsiContext osi() throws RecognitionException {
		OsiContext _localctx = new OsiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_osi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__21);
			setState(197);
			exp(0);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				statement();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SinoContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitSino(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__22);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				statement();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContelegirContext extends ParserRuleContext {
		public CasoexpContext casoexp() {
			return getRuleContext(CasoexpContext.class,0);
		}
		public EleccioncasoContext eleccioncaso() {
			return getRuleContext(EleccioncasoContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ContelegirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contelegir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterContelegir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitContelegir(this);
		}
	}

	public final ContelegirContext contelegir() throws RecognitionException {
		ContelegirContext _localctx = new ContelegirContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_contelegir);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(T__23);
				setState(210);
				casoexp();
				setState(211);
				match(T__24);
				setState(212);
				eleccioncaso();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(T__25);
				setState(215);
				match(T__24);
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(216);
					statement();
					}
					}
					setState(219); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__26);
				setState(222);
				match(T__24);
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(223);
					statement();
					}
					}
					setState(226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EleccioncasoContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ContelegirContext contelegir() {
			return getRuleContext(ContelegirContext.class,0);
		}
		public CasoexpContext casoexp() {
			return getRuleContext(CasoexpContext.class,0);
		}
		public EleccioncasoContext eleccioncaso() {
			return getRuleContext(EleccioncasoContext.class,0);
		}
		public EleccioncasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eleccioncaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterEleccioncaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitEleccioncaso(this);
		}
	}

	public final EleccioncasoContext eleccioncaso() throws RecognitionException {
		EleccioncasoContext _localctx = new EleccioncasoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_eleccioncaso);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__19:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(230);
					statement();
					}
					}
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 218103808L) != 0)) {
					{
					setState(235);
					contelegir();
					}
				}

				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__23);
				setState(239);
				casoexp();
				setState(240);
				match(T__24);
				setState(241);
				eleccioncaso();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasoexpContext extends ParserRuleContext {
		public TerminalNode CADENA_DE_CARACTERES() { return getToken(GramaticaLatinoParser.CADENA_DE_CARACTERES, 0); }
		public TerminalNode VALOR_REAL() { return getToken(GramaticaLatinoParser.VALOR_REAL, 0); }
		public CasoexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casoexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterCasoexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitCasoexp(this);
		}
	}

	public final CasoexpContext casoexp() throws RecognitionException {
		CasoexpContext _localctx = new CasoexpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_casoexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==CADENA_DE_CARACTERES || _la==VALOR_REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DosparaContext extends ParserRuleContext {
		public TerminalNode VALOR_REAL() { return getToken(GramaticaLatinoParser.VALOR_REAL, 0); }
		public TresparaContext trespara() {
			return getRuleContext(TresparaContext.class,0);
		}
		public DosparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dospara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterDospara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitDospara(this);
		}
	}

	public final DosparaContext dospara() throws RecognitionException {
		DosparaContext _localctx = new DosparaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dospara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__9);
			setState(248);
			match(VALOR_REAL);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(249);
				trespara();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TresparaContext extends ParserRuleContext {
		public TerminalNode VALOR_REAL() { return getToken(GramaticaLatinoParser.VALOR_REAL, 0); }
		public TresparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trespara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterTrespara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitTrespara(this);
		}
	}

	public final TresparaContext trespara() throws RecognitionException {
		TresparaContext _localctx = new TresparaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_trespara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__9);
			setState(253);
			match(VALOR_REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclfuncionesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaLatinoParser.ID, 0); }
		public ContdeclfuncionesContext contdeclfunciones() {
			return getRuleContext(ContdeclfuncionesContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DeclfuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declfunciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterDeclfunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitDeclfunciones(this);
		}
	}

	public final DeclfuncionesContext declfunciones() throws RecognitionException {
		DeclfuncionesContext _localctx = new DeclfuncionesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declfunciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(256);
			match(ID);
			setState(257);
			match(T__2);
			setState(258);
			contdeclfunciones();
			setState(259);
			match(T__3);
			setState(261); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(260);
				statement();
				}
				}
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
			setState(265);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnstatContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterReturnstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitReturnstat(this);
		}
	}

	public final ReturnstatContext returnstat() throws RecognitionException {
		ReturnstatContext _localctx = new ReturnstatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(268);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdrelatedContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaLatinoParser.ID, 0); }
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public IncdecContext incdec() {
			return getRuleContext(IncdecContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public DiccContext dicc() {
			return getRuleContext(DiccContext.class,0);
		}
		public IdrelatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idrelated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterIdrelated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitIdrelated(this);
		}
	}

	public final IdrelatedContext idrelated() throws RecognitionException {
		IdrelatedContext _localctx = new IdrelatedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_idrelated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(271);
				asig();
				}
				break;
			case 2:
				{
				setState(272);
				incdec();
				}
				break;
			case 3:
				{
				setState(273);
				func();
				}
				break;
			case 4:
				{
				setState(274);
				dicc();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiccContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaLatinoParser.ID, 0); }
		public List<AuxidContext> auxid() {
			return getRuleContexts(AuxidContext.class);
		}
		public AuxidContext auxid(int i) {
			return getRuleContext(AuxidContext.class,i);
		}
		public DiccContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dicc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterDicc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitDicc(this);
		}
	}

	public final DiccContext dicc() throws RecognitionException {
		DiccContext _localctx = new DiccContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dicc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__32);
			setState(278);
			match(ID);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 77309411336L) != 0)) {
				{
				{
				setState(279);
				auxid();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncdecContext extends ParserRuleContext {
		public IncdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incdec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterIncdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitIncdec(this);
		}
	}

	public final IncdecContext incdec() throws RecognitionException {
		IncdecContext _localctx = new IncdecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_incdec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public ContdeclfuncionesContext contdeclfunciones() {
			return getRuleContext(ContdeclfuncionesContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__2);
			setState(288);
			contdeclfunciones();
			setState(289);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContdeclfuncionesContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ContdeclfuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contdeclfunciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterContdeclfunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitContdeclfunciones(this);
		}
	}

	public final ContdeclfuncionesContext contdeclfunciones() throws RecognitionException {
		ContdeclfuncionesContext _localctx = new ContdeclfuncionesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_contdeclfunciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65300614854214152L) != 0)) {
				{
				setState(291);
				exp(0);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(292);
					match(T__9);
					setState(293);
					exp(0);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsigContext extends ParserRuleContext {
		public TerminalNode OPASIG() { return getToken(GramaticaLatinoParser.OPASIG, 0); }
		public CualContext cual() {
			return getRuleContext(CualContext.class,0);
		}
		public List<AuxidasigContext> auxidasig() {
			return getRuleContexts(AuxidasigContext.class);
		}
		public AuxidasigContext auxidasig(int i) {
			return getRuleContext(AuxidasigContext.class,i);
		}
		public List<AuxcualContext> auxcual() {
			return getRuleContexts(AuxcualContext.class);
		}
		public AuxcualContext auxcual(int i) {
			return getRuleContext(AuxcualContext.class,i);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitAsig(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_asig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 77309412352L) != 0)) {
				{
				{
				setState(301);
				auxidasig();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(OPASIG);
			setState(308);
			cual();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(309);
				auxcual();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AuxcualContext extends ParserRuleContext {
		public CualContext cual() {
			return getRuleContext(CualContext.class,0);
		}
		public AuxcualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxcual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterAuxcual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitAuxcual(this);
		}
	}

	public final AuxcualContext auxcual() throws RecognitionException {
		AuxcualContext _localctx = new AuxcualContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_auxcual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__9);
			setState(316);
			cual();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AuxidasigContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaLatinoParser.ID, 0); }
		public AuxidasigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxidasig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterAuxidasig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitAuxidasig(this);
		}
	}

	public final AuxidasigContext auxidasig() throws RecognitionException {
		AuxidasigContext _localctx = new AuxidasigContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_auxidasig);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(T__35);
				setState(319);
				exp(0);
				setState(320);
				match(T__36);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(T__32);
				setState(323);
				match(ID);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(T__9);
				setState(325);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CualContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterCual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitCual(this);
		}
	}

	public final CualContext cual() throws RecognitionException {
		CualContext _localctx = new CualContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cual);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__8:
			case T__27:
			case T__28:
			case T__35:
			case T__38:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case ID:
			case CADENA_DE_CARACTERES:
			case VALOR_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				exp(0);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(T__37);
				setState(330);
				match(T__2);
				setState(331);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<AuxlistaContext> auxlista() {
			return getRuleContexts(AuxlistaContext.class);
		}
		public AuxlistaContext auxlista(int i) {
			return getRuleContext(AuxlistaContext.class,i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitLista(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__35);
			setState(335);
			exp(0);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(336);
				auxlista();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AuxlistaContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AuxlistaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxlista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterAuxlista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitAuxlista(this);
		}
	}

	public final AuxlistaContext auxlista() throws RecognitionException {
		AuxlistaContext _localctx = new AuxlistaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_auxlista);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(T__9);
				setState(345);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DicContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<AuxdicContext> auxdic() {
			return getRuleContexts(AuxdicContext.class);
		}
		public AuxdicContext auxdic(int i) {
			return getRuleContext(AuxdicContext.class,i);
		}
		public DicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterDic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitDic(this);
		}
	}

	public final DicContext dic() throws RecognitionException {
		DicContext _localctx = new DicContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__38);
			setState(350);
			exp(0);
			setState(351);
			match(T__24);
			setState(352);
			exp(0);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(353);
				auxdic();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AuxdicContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AuxdicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxdic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterAuxdic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitAuxdic(this);
		}
	}

	public final AuxdicContext auxdic() throws RecognitionException {
		AuxdicContext _localctx = new AuxdicContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_auxdic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__9);
			setState(362);
			exp(0);
			setState(363);
			match(T__24);
			setState(364);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(GramaticaLatinoParser.OPREL, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(367);
			e();
			}
			_ctx.stop = _input.LT(-1);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(369);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(370);
						match(OPREL);
						setState(371);
						exp(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(372);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(373);
						match(T__40);
						setState(374);
						exp(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(375);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(376);
						match(T__41);
						setState(377);
						exp(3);
						}
						break;
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEContext extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public NotEContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterNotE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitNotE(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CadenaCaracteresContext extends EContext {
		public TerminalNode CADENA_DE_CARACTERES() { return getToken(GramaticaLatinoParser.CADENA_DE_CARACTERES, 0); }
		public CadenaCaracteresContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterCadenaCaracteres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitCadenaCaracteres(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalsoContext extends EContext {
		public FalsoContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterFalso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitFalso(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusValorRealContext extends EContext {
		public TerminalNode VALOR_REAL() { return getToken(GramaticaLatinoParser.VALOR_REAL, 0); }
		public PlusValorRealContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterPlusValorReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitPlusValorReal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpListaContext extends EContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ExpListaContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterExpLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitExpLista(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpBuiltInContext extends EContext {
		public BuiltinexpContext builtinexp() {
			return getRuleContext(BuiltinexpContext.class,0);
		}
		public ExpBuiltInContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterExpBuiltIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitExpBuiltIn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CiertoContext extends EContext {
		public CiertoContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterCierto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitCierto(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpDicContext extends EContext {
		public DicContext dic() {
			return getRuleContext(DicContext.class,0);
		}
		public ExpDicContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterExpDic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitExpDic(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VerdaderoContext extends EContext {
		public VerdaderoContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterVerdadero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitVerdadero(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParIExpParDContext extends EContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParIExpParDContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterParIExpParD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitParIExpParD(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunAnonimaContext extends EContext {
		public ContdeclfuncionesContext contdeclfunciones() {
			return getRuleContext(ContdeclfuncionesContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunAnonimaContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterFunAnonima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitFunAnonima(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValorRealContext extends EContext {
		public TerminalNode VALOR_REAL() { return getToken(GramaticaLatinoParser.VALOR_REAL, 0); }
		public ValorRealContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterValorReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitValorReal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAuxIdContext extends EContext {
		public TerminalNode ID() { return getToken(GramaticaLatinoParser.ID, 0); }
		public List<AuxidContext> auxid() {
			return getRuleContexts(AuxidContext.class);
		}
		public AuxidContext auxid(int i) {
			return getRuleContext(AuxidContext.class,i);
		}
		public IdAuxIdContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterIdAuxId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitIdAuxId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NuloContext extends EContext {
		public NuloContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterNulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitNulo(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusValorRealContext extends EContext {
		public TerminalNode VALOR_REAL() { return getToken(GramaticaLatinoParser.VALOR_REAL, 0); }
		public MinusValorRealContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterMinusValorReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitMinusValorReal(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_e);
		int _la;
		try {
			int _alt;
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_DE_CARACTERES:
				_localctx = new CadenaCaracteresContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(CADENA_DE_CARACTERES);
				}
				break;
			case ID:
				_localctx = new IdAuxIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(ID);
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(385);
						auxid();
						}
						} 
					}
					setState(390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				break;
			case T__27:
			case T__28:
				_localctx = new FunAnonimaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(392);
				match(T__2);
				setState(393);
				contdeclfunciones();
				setState(394);
				match(T__3);
				setState(396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(395);
					statement();
					}
					}
					setState(398); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007207577512934L) != 0) );
				setState(400);
				match(T__11);
				}
				break;
			case VALOR_REAL:
				_localctx = new ValorRealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				match(VALOR_REAL);
				}
				break;
			case T__41:
				_localctx = new MinusValorRealContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(403);
				match(T__41);
				setState(404);
				match(VALOR_REAL);
				}
				break;
			case T__40:
				_localctx = new PlusValorRealContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(405);
				match(T__40);
				setState(406);
				match(VALOR_REAL);
				}
				break;
			case T__42:
				_localctx = new VerdaderoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(407);
				match(T__42);
				}
				break;
			case T__43:
				_localctx = new CiertoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(408);
				match(T__43);
				}
				break;
			case T__44:
				_localctx = new FalsoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(409);
				match(T__44);
				}
				break;
			case T__45:
				_localctx = new NuloContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(410);
				match(T__45);
				}
				break;
			case T__35:
				_localctx = new ExpListaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(411);
				lista();
				}
				break;
			case T__38:
				_localctx = new ExpDicContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(412);
				dic();
				}
				break;
			case T__8:
			case T__47:
			case T__48:
			case T__49:
				_localctx = new ExpBuiltInContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(413);
				builtinexp();
				}
				break;
			case T__46:
				_localctx = new NotEContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(414);
				match(T__46);
				setState(415);
				e();
				}
				break;
			case T__2:
				_localctx = new ParIExpParDContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(416);
				match(T__2);
				setState(417);
				exp(0);
				setState(418);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltinexpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BuiltinexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterBuiltinexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitBuiltinexp(this);
		}
	}

	public final BuiltinexpContext builtinexp() throws RecognitionException {
		BuiltinexpContext _localctx = new BuiltinexpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_builtinexp);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(T__8);
				setState(423);
				match(T__2);
				setState(424);
				exp(0);
				setState(425);
				match(T__3);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(T__47);
				setState(428);
				match(T__2);
				setState(429);
				exp(0);
				setState(430);
				match(T__3);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(T__48);
				setState(433);
				match(T__2);
				setState(434);
				exp(0);
				setState(435);
				match(T__3);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(T__49);
				setState(438);
				match(T__2);
				setState(439);
				exp(0);
				setState(440);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AuxidContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ContdeclfuncionesContext contdeclfunciones() {
			return getRuleContext(ContdeclfuncionesContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaLatinoParser.ID, 0); }
		public AuxidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).enterAuxid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaLatinoListener ) ((GramaticaLatinoListener)listener).exitAuxid(this);
		}
	}

	public final AuxidContext auxid() throws RecognitionException {
		AuxidContext _localctx = new AuxidContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_auxid);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(T__35);
				setState(445);
				exp(0);
				setState(446);
				match(T__36);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(T__2);
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(449);
					contdeclfunciones();
					}
					break;
				}
				setState(452);
				match(T__3);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(T__32);
				setState(454);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u01ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0005\u0000C\b\u0000"+
		"\n\u0000\f\u0000F\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002b\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002m\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003q\b\u0003\n\u0003\f\u0003t\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"|\b\u0005\u000b\u0005\f\u0005}\u0001\u0005\u0005\u0005\u0081\b\u0005\n"+
		"\u0005\f\u0005\u0084\t\u0005\u0001\u0005\u0003\u0005\u0087\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u009a"+
		"\b\u0005\u000b\u0005\f\u0005\u009b\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005\u00a3\b\u0005\u000b\u0005\f\u0005"+
		"\u00a4\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b0\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005\u00b4\b\u0005\u000b\u0005\f\u0005\u00b5"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00bc\b\u0005"+
		"\u000b\u0005\f\u0005\u00bd\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00c3\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00c8\b"+
		"\u0006\u000b\u0006\f\u0006\u00c9\u0001\u0007\u0001\u0007\u0004\u0007\u00ce"+
		"\b\u0007\u000b\u0007\f\u0007\u00cf\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\b\u00da\b\b\u000b\b\f\b\u00db\u0001\b"+
		"\u0001\b\u0001\b\u0004\b\u00e1\b\b\u000b\b\f\b\u00e2\u0003\b\u00e5\b\b"+
		"\u0001\t\u0004\t\u00e8\b\t\u000b\t\f\t\u00e9\u0001\t\u0003\t\u00ed\b\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f4\b\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00fb\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004"+
		"\r\u0106\b\r\u000b\r\f\r\u0107\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0114\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0119\b\u0010\n\u0010\f\u0010\u011c\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u0127\b\u0013\n\u0013\f\u0013\u012a\t\u0013\u0003\u0013"+
		"\u012c\b\u0013\u0001\u0014\u0005\u0014\u012f\b\u0014\n\u0014\f\u0014\u0132"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0137\b\u0014"+
		"\n\u0014\f\u0014\u013a\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0147\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u014d\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0152\b\u0018\n\u0018\f\u0018\u0155\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u015c\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0163\b\u001a\n\u001a\f\u001a\u0166\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u017b"+
		"\b\u001c\n\u001c\f\u001c\u017e\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u0183\b\u001d\n\u001d\f\u001d\u0186\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u018d\b\u001d\u000b"+
		"\u001d\f\u001d\u018e\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01a5\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01bb\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01c3\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01c8\b\u001f\u0001\u001f\u0000"+
		"\u00018 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0004\u0001\u000067\u0001\u0000"+
		"\u001c\u001d\u0001\u0000\u001e \u0001\u0000\"#\u01f5\u0000@\u0001\u0000"+
		"\u0000\u0000\u0002L\u0001\u0000\u0000\u0000\u0004l\u0001\u0000\u0000\u0000"+
		"\u0006n\u0001\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000\n\u00c2\u0001"+
		"\u0000\u0000\u0000\f\u00c4\u0001\u0000\u0000\u0000\u000e\u00cb\u0001\u0000"+
		"\u0000\u0000\u0010\u00e4\u0001\u0000\u0000\u0000\u0012\u00f3\u0001\u0000"+
		"\u0000\u0000\u0014\u00f5\u0001\u0000\u0000\u0000\u0016\u00f7\u0001\u0000"+
		"\u0000\u0000\u0018\u00fc\u0001\u0000\u0000\u0000\u001a\u00ff\u0001\u0000"+
		"\u0000\u0000\u001c\u010b\u0001\u0000\u0000\u0000\u001e\u010e\u0001\u0000"+
		"\u0000\u0000 \u0115\u0001\u0000\u0000\u0000\"\u011d\u0001\u0000\u0000"+
		"\u0000$\u011f\u0001\u0000\u0000\u0000&\u012b\u0001\u0000\u0000\u0000("+
		"\u0130\u0001\u0000\u0000\u0000*\u013b\u0001\u0000\u0000\u0000,\u0146\u0001"+
		"\u0000\u0000\u0000.\u014c\u0001\u0000\u0000\u00000\u014e\u0001\u0000\u0000"+
		"\u00002\u015b\u0001\u0000\u0000\u00004\u015d\u0001\u0000\u0000\u00006"+
		"\u0169\u0001\u0000\u0000\u00008\u016e\u0001\u0000\u0000\u0000:\u01a4\u0001"+
		"\u0000\u0000\u0000<\u01ba\u0001\u0000\u0000\u0000>\u01c7\u0001\u0000\u0000"+
		"\u0000@D\u0003\u0002\u0001\u0000AC\u0003\u0000\u0000\u0000BA\u0001\u0000"+
		"\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000E\u0001\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000GM\u0003\u001e\u000f\u0000HM\u0003\u0004\u0002\u0000IM\u0003\n\u0005"+
		"\u0000JM\u0003\u001a\r\u0000KM\u0003\u001c\u000e\u0000LG\u0001\u0000\u0000"+
		"\u0000LH\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000"+
		"Nm\u0005\u0001\u0000\u0000OP\u0005\u0002\u0000\u0000PQ\u0005\u0003\u0000"+
		"\u0000QR\u00038\u001c\u0000RS\u0005\u0004\u0000\u0000Sm\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0005\u0000\u0000UV\u0005\u0003\u0000\u0000VW\u00038\u001c"+
		"\u0000WX\u0005\u0004\u0000\u0000Xm\u0001\u0000\u0000\u0000YZ\u0005\u0006"+
		"\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u00038\u001c\u0000\\]\u0005"+
		"\u0004\u0000\u0000]m\u0001\u0000\u0000\u0000^_\u0005\u0007\u0000\u0000"+
		"_a\u0005\u0003\u0000\u0000`b\u0003\u0006\u0003\u0000a`\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cm\u0005\u0004"+
		"\u0000\u0000de\u0005\b\u0000\u0000ef\u0005\u0003\u0000\u0000fm\u0005\u0004"+
		"\u0000\u0000gh\u0005\t\u0000\u0000hi\u0005\u0003\u0000\u0000ij\u00038"+
		"\u001c\u0000jk\u0005\u0004\u0000\u0000km\u0001\u0000\u0000\u0000lN\u0001"+
		"\u0000\u0000\u0000lO\u0001\u0000\u0000\u0000lT\u0001\u0000\u0000\u0000"+
		"lY\u0001\u0000\u0000\u0000l^\u0001\u0000\u0000\u0000ld\u0001\u0000\u0000"+
		"\u0000lg\u0001\u0000\u0000\u0000m\u0005\u0001\u0000\u0000\u0000nr\u0003"+
		"8\u001c\u0000oq\u0003\b\u0004\u0000po\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"s\u0007\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\n\u0000"+
		"\u0000vw\u00038\u001c\u0000w\t\u0001\u0000\u0000\u0000xy\u0005\u000b\u0000"+
		"\u0000y{\u00038\u001c\u0000z|\u0003\u0002\u0001\u0000{z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0082\u0001\u0000\u0000\u0000\u007f\u0081\u0003\f\u0006"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0087\u0003\u000e\u0007\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\f\u0000\u0000\u0089\u00c3\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\r\u0000\u0000\u008b\u008c\u00038\u001c\u0000\u008c"+
		"\u008d\u0003\u0010\b\u0000\u008d\u008e\u0005\f\u0000\u0000\u008e\u00c3"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u0091"+
		"\u0005\u0003\u0000\u0000\u0091\u0092\u00055\u0000\u0000\u0092\u0093\u0003"+
		"(\u0014\u0000\u0093\u0094\u0005\u000f\u0000\u0000\u0094\u0095\u00038\u001c"+
		"\u0000\u0095\u0096\u0005\u000f\u0000\u0000\u0096\u0097\u0003\u0002\u0001"+
		"\u0000\u0097\u0099\u0005\u0004\u0000\u0000\u0098\u009a\u0003\u0002\u0001"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\f\u0000\u0000"+
		"\u009e\u00c3\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0010\u0000\u0000"+
		"\u00a0\u00a2\u00038\u001c\u0000\u00a1\u00a3\u0003\u0002\u0001\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\f\u0000\u0000\u00a7\u00c3"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0011\u0000\u0000\u00a9\u00aa"+
		"\u00055\u0000\u0000\u00aa\u00ab\u0005\u0012\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0013\u0000\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u00af\u0005"+
		"7\u0000\u0000\u00ae\u00b0\u0003\u0016\u000b\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b3\u0005\u0004\u0000\u0000\u00b2\u00b4\u0003\u0002"+
		"\u0001\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\f\u0000"+
		"\u0000\u00b8\u00c3\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005\u0014\u0000"+
		"\u0000\u00ba\u00bc\u0003\u0002\u0001\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0015\u0000\u0000\u00c0\u00c1\u00038\u001c\u0000"+
		"\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2x\u0001\u0000\u0000\u0000\u00c2"+
		"\u008a\u0001\u0000\u0000\u0000\u00c2\u008f\u0001\u0000\u0000\u0000\u00c2"+
		"\u009f\u0001\u0000\u0000\u0000\u00c2\u00a8\u0001\u0000\u0000\u0000\u00c2"+
		"\u00b9\u0001\u0000\u0000\u0000\u00c3\u000b\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005\u0016\u0000\u0000\u00c5\u00c7\u00038\u001c\u0000\u00c6\u00c8"+
		"\u0003\u0002\u0001\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\r\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005"+
		"\u0017\u0000\u0000\u00cc\u00ce\u0003\u0002\u0001\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u000f\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0005\u0018\u0000\u0000\u00d2\u00d3\u0003"+
		"\u0014\n\u0000\u00d3\u00d4\u0005\u0019\u0000\u0000\u00d4\u00d5\u0003\u0012"+
		"\t\u0000\u00d5\u00e5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u001a\u0000"+
		"\u0000\u00d7\u00d9\u0005\u0019\u0000\u0000\u00d8\u00da\u0003\u0002\u0001"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00e5\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u001b\u0000"+
		"\u0000\u00de\u00e0\u0005\u0019\u0000\u0000\u00df\u00e1\u0003\u0002\u0001"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00d1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00d6\u0001\u0000\u0000\u0000\u00e4\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e5\u0011\u0001\u0000\u0000\u0000\u00e6\u00e8\u0003\u0002\u0001"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00ed\u0003\u0010\b\u0000"+
		"\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f4\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0018\u0000\u0000"+
		"\u00ef\u00f0\u0003\u0014\n\u0000\u00f0\u00f1\u0005\u0019\u0000\u0000\u00f1"+
		"\u00f2\u0003\u0012\t\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00e7"+
		"\u0001\u0000\u0000\u0000\u00f3\u00ee\u0001\u0000\u0000\u0000\u00f4\u0013"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0007\u0000\u0000\u0000\u00f6\u0015"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\n\u0000\u0000\u00f8\u00fa\u0005"+
		"7\u0000\u0000\u00f9\u00fb\u0003\u0018\f\u0000\u00fa\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0017\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005\n\u0000\u0000\u00fd\u00fe\u00057\u0000"+
		"\u0000\u00fe\u0019\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0001\u0000"+
		"\u0000\u0100\u0101\u00055\u0000\u0000\u0101\u0102\u0005\u0003\u0000\u0000"+
		"\u0102\u0103\u0003&\u0013\u0000\u0103\u0105\u0005\u0004\u0000\u0000\u0104"+
		"\u0106\u0003\u0002\u0001\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005\f\u0000\u0000\u010a\u001b\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0007\u0002\u0000\u0000\u010c\u010d\u00038\u001c\u0000\u010d\u001d\u0001"+
		"\u0000\u0000\u0000\u010e\u0113\u00055\u0000\u0000\u010f\u0114\u0003(\u0014"+
		"\u0000\u0110\u0114\u0003\"\u0011\u0000\u0111\u0114\u0003$\u0012\u0000"+
		"\u0112\u0114\u0003 \u0010\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0113"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u001f\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005!\u0000\u0000\u0116\u011a\u00055\u0000\u0000\u0117\u0119\u0003"+
		">\u001f\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b!\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0007\u0003\u0000\u0000\u011e#\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0005\u0003\u0000\u0000\u0120\u0121\u0003&\u0013\u0000\u0121"+
		"\u0122\u0005\u0004\u0000\u0000\u0122%\u0001\u0000\u0000\u0000\u0123\u0128"+
		"\u00038\u001c\u0000\u0124\u0125\u0005\n\u0000\u0000\u0125\u0127\u0003"+
		"8\u001c\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000"+
		"\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000"+
		"\u0000\u0000\u012b\u0123\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000"+
		"\u0000\u0000\u012c\'\u0001\u0000\u0000\u0000\u012d\u012f\u0003,\u0016"+
		"\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u00053\u0000\u0000\u0134\u0138\u0003.\u0017\u0000\u0135"+
		"\u0137\u0003*\u0015\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u013a"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139)\u0001\u0000\u0000\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005\n\u0000\u0000\u013c\u013d\u0003."+
		"\u0017\u0000\u013d+\u0001\u0000\u0000\u0000\u013e\u013f\u0005$\u0000\u0000"+
		"\u013f\u0140\u00038\u001c\u0000\u0140\u0141\u0005%\u0000\u0000\u0141\u0147"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0005!\u0000\u0000\u0143\u0147\u0005"+
		"5\u0000\u0000\u0144\u0145\u0005\n\u0000\u0000\u0145\u0147\u00055\u0000"+
		"\u0000\u0146\u013e\u0001\u0000\u0000\u0000\u0146\u0142\u0001\u0000\u0000"+
		"\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147-\u0001\u0000\u0000\u0000"+
		"\u0148\u014d\u00038\u001c\u0000\u0149\u014a\u0005&\u0000\u0000\u014a\u014b"+
		"\u0005\u0003\u0000\u0000\u014b\u014d\u0005\u0004\u0000\u0000\u014c\u0148"+
		"\u0001\u0000\u0000\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014d/\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0005$\u0000\u0000\u014f\u0153\u00038\u001c"+
		"\u0000\u0150\u0152\u00032\u0019\u0000\u0151\u0150\u0001\u0000\u0000\u0000"+
		"\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0005%\u0000\u0000\u0157"+
		"1\u0001\u0000\u0000\u0000\u0158\u0159\u0005\n\u0000\u0000\u0159\u015c"+
		"\u00038\u001c\u0000\u015a\u015c\u0005\n\u0000\u0000\u015b\u0158\u0001"+
		"\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c3\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0005\'\u0000\u0000\u015e\u015f\u00038\u001c"+
		"\u0000\u015f\u0160\u0005\u0019\u0000\u0000\u0160\u0164\u00038\u001c\u0000"+
		"\u0161\u0163\u00036\u001b\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163"+
		"\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166"+
		"\u0164\u0001\u0000\u0000\u0000\u0167\u0168\u0005(\u0000\u0000\u01685\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0005\n\u0000\u0000\u016a\u016b\u00038"+
		"\u001c\u0000\u016b\u016c\u0005\u0019\u0000\u0000\u016c\u016d\u00038\u001c"+
		"\u0000\u016d7\u0001\u0000\u0000\u0000\u016e\u016f\u0006\u001c\uffff\uffff"+
		"\u0000\u016f\u0170\u0003:\u001d\u0000\u0170\u017c\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\n\u0004\u0000\u0000\u0172\u0173\u00054\u0000\u0000\u0173"+
		"\u017b\u00038\u001c\u0005\u0174\u0175\n\u0003\u0000\u0000\u0175\u0176"+
		"\u0005)\u0000\u0000\u0176\u017b\u00038\u001c\u0004\u0177\u0178\n\u0002"+
		"\u0000\u0000\u0178\u0179\u0005*\u0000\u0000\u0179\u017b\u00038\u001c\u0003"+
		"\u017a\u0171\u0001\u0000\u0000\u0000\u017a\u0174\u0001\u0000\u0000\u0000"+
		"\u017a\u0177\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000"+
		"\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017d9\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f"+
		"\u01a5\u00056\u0000\u0000\u0180\u0184\u00055\u0000\u0000\u0181\u0183\u0003"+
		">\u001f\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000"+
		"\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000"+
		"\u0000\u0000\u0185\u01a5\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0007\u0001\u0000\u0000\u0188\u0189\u0005\u0003"+
		"\u0000\u0000\u0189\u018a\u0003&\u0013\u0000\u018a\u018c\u0005\u0004\u0000"+
		"\u0000\u018b\u018d\u0003\u0002\u0001\u0000\u018c\u018b\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0005\f\u0000\u0000\u0191\u01a5\u0001\u0000\u0000\u0000"+
		"\u0192\u01a5\u00057\u0000\u0000\u0193\u0194\u0005*\u0000\u0000\u0194\u01a5"+
		"\u00057\u0000\u0000\u0195\u0196\u0005)\u0000\u0000\u0196\u01a5\u00057"+
		"\u0000\u0000\u0197\u01a5\u0005+\u0000\u0000\u0198\u01a5\u0005,\u0000\u0000"+
		"\u0199\u01a5\u0005-\u0000\u0000\u019a\u01a5\u0005.\u0000\u0000\u019b\u01a5"+
		"\u00030\u0018\u0000\u019c\u01a5\u00034\u001a\u0000\u019d\u01a5\u0003<"+
		"\u001e\u0000\u019e\u019f\u0005/\u0000\u0000\u019f\u01a5\u0003:\u001d\u0000"+
		"\u01a0\u01a1\u0005\u0003\u0000\u0000\u01a1\u01a2\u00038\u001c\u0000\u01a2"+
		"\u01a3\u0005\u0004\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4"+
		"\u017f\u0001\u0000\u0000\u0000\u01a4\u0180\u0001\u0000\u0000\u0000\u01a4"+
		"\u0187\u0001\u0000\u0000\u0000\u01a4\u0192\u0001\u0000\u0000\u0000\u01a4"+
		"\u0193\u0001\u0000\u0000\u0000\u01a4\u0195\u0001\u0000\u0000\u0000\u01a4"+
		"\u0197\u0001\u0000\u0000\u0000\u01a4\u0198\u0001\u0000\u0000\u0000\u01a4"+
		"\u0199\u0001\u0000\u0000\u0000\u01a4\u019a\u0001\u0000\u0000\u0000\u01a4"+
		"\u019b\u0001\u0000\u0000\u0000\u01a4\u019c\u0001\u0000\u0000\u0000\u01a4"+
		"\u019d\u0001\u0000\u0000\u0000\u01a4\u019e\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a5;\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0005\t\u0000\u0000\u01a7\u01a8\u0005\u0003\u0000\u0000\u01a8\u01a9\u0003"+
		"8\u001c\u0000\u01a9\u01aa\u0005\u0004\u0000\u0000\u01aa\u01bb\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u00050\u0000\u0000\u01ac\u01ad\u0005\u0003\u0000"+
		"\u0000\u01ad\u01ae\u00038\u001c\u0000\u01ae\u01af\u0005\u0004\u0000\u0000"+
		"\u01af\u01bb\u0001\u0000\u0000\u0000\u01b0\u01b1\u00051\u0000\u0000\u01b1"+
		"\u01b2\u0005\u0003\u0000\u0000\u01b2\u01b3\u00038\u001c\u0000\u01b3\u01b4"+
		"\u0005\u0004\u0000\u0000\u01b4\u01bb\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u00052\u0000\u0000\u01b6\u01b7\u0005\u0003\u0000\u0000\u01b7\u01b8\u0003"+
		"8\u001c\u0000\u01b8\u01b9\u0005\u0004\u0000\u0000\u01b9\u01bb\u0001\u0000"+
		"\u0000\u0000\u01ba\u01a6\u0001\u0000\u0000\u0000\u01ba\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b0\u0001\u0000\u0000\u0000\u01ba\u01b5\u0001\u0000"+
		"\u0000\u0000\u01bb=\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005$\u0000\u0000"+
		"\u01bd\u01be\u00038\u001c\u0000\u01be\u01bf\u0005%\u0000\u0000\u01bf\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c2\u0005\u0003\u0000\u0000\u01c1\u01c3"+
		"\u0003&\u0013\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c8\u0005"+
		"\u0004\u0000\u0000\u01c5\u01c6\u0005!\u0000\u0000\u01c6\u01c8\u00055\u0000"+
		"\u0000\u01c7\u01bc\u0001\u0000\u0000\u0000\u01c7\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8?\u0001\u0000\u0000\u0000"+
		"+DLalr}\u0082\u0086\u009b\u00a4\u00af\u00b5\u00bd\u00c2\u00c9\u00cf\u00db"+
		"\u00e2\u00e4\u00e9\u00ec\u00f3\u00fa\u0107\u0113\u011a\u0128\u012b\u0130"+
		"\u0138\u0146\u014c\u0153\u015b\u0164\u017a\u017c\u0184\u018e\u01a4\u01ba"+
		"\u01c2\u01c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}