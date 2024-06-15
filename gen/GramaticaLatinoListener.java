// Generated from F:/Julian/Universidad/2024-1/Lenguajes de programación/Analizador Semántico/AnalizadorSemanticoV1/grammar/GramaticaLatino.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaLatinoParser}.
 */
public interface GramaticaLatinoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(GramaticaLatinoParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(GramaticaLatinoParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GramaticaLatinoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GramaticaLatinoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#builtin}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin(GramaticaLatinoParser.BuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#builtin}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin(GramaticaLatinoParser.BuiltinContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#contimprimirf}.
	 * @param ctx the parse tree
	 */
	void enterContimprimirf(GramaticaLatinoParser.ContimprimirfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#contimprimirf}.
	 * @param ctx the parse tree
	 */
	void exitContimprimirf(GramaticaLatinoParser.ContimprimirfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#auxcontimprimirf}.
	 * @param ctx the parse tree
	 */
	void enterAuxcontimprimirf(GramaticaLatinoParser.AuxcontimprimirfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#auxcontimprimirf}.
	 * @param ctx the parse tree
	 */
	void exitAuxcontimprimirf(GramaticaLatinoParser.AuxcontimprimirfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Si}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterSi(GramaticaLatinoParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Si}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitSi(GramaticaLatinoParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Elegir}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterElegir(GramaticaLatinoParser.ElegirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Elegir}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitElegir(GramaticaLatinoParser.ElegirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Desde}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterDesde(GramaticaLatinoParser.DesdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Desde}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitDesde(GramaticaLatinoParser.DesdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mientras}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterMientras(GramaticaLatinoParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mientras}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitMientras(GramaticaLatinoParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Para}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterPara(GramaticaLatinoParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Para}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitPara(GramaticaLatinoParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Repetir}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(GramaticaLatinoParser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Repetir}
	 * labeled alternative in {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(GramaticaLatinoParser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#osi}.
	 * @param ctx the parse tree
	 */
	void enterOsi(GramaticaLatinoParser.OsiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#osi}.
	 * @param ctx the parse tree
	 */
	void exitOsi(GramaticaLatinoParser.OsiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(GramaticaLatinoParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(GramaticaLatinoParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#contelegir}.
	 * @param ctx the parse tree
	 */
	void enterContelegir(GramaticaLatinoParser.ContelegirContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#contelegir}.
	 * @param ctx the parse tree
	 */
	void exitContelegir(GramaticaLatinoParser.ContelegirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElegirStatement}
	 * labeled alternative in {@link GramaticaLatinoParser#eleccioncaso}.
	 * @param ctx the parse tree
	 */
	void enterElegirStatement(GramaticaLatinoParser.ElegirStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElegirStatement}
	 * labeled alternative in {@link GramaticaLatinoParser#eleccioncaso}.
	 * @param ctx the parse tree
	 */
	void exitElegirStatement(GramaticaLatinoParser.ElegirStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElegirOr}
	 * labeled alternative in {@link GramaticaLatinoParser#eleccioncaso}.
	 * @param ctx the parse tree
	 */
	void enterElegirOr(GramaticaLatinoParser.ElegirOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElegirOr}
	 * labeled alternative in {@link GramaticaLatinoParser#eleccioncaso}.
	 * @param ctx the parse tree
	 */
	void exitElegirOr(GramaticaLatinoParser.ElegirOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#casoexp}.
	 * @param ctx the parse tree
	 */
	void enterCasoexp(GramaticaLatinoParser.CasoexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#casoexp}.
	 * @param ctx the parse tree
	 */
	void exitCasoexp(GramaticaLatinoParser.CasoexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#dospara}.
	 * @param ctx the parse tree
	 */
	void enterDospara(GramaticaLatinoParser.DosparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#dospara}.
	 * @param ctx the parse tree
	 */
	void exitDospara(GramaticaLatinoParser.DosparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#trespara}.
	 * @param ctx the parse tree
	 */
	void enterTrespara(GramaticaLatinoParser.TresparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#trespara}.
	 * @param ctx the parse tree
	 */
	void exitTrespara(GramaticaLatinoParser.TresparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#declfunciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclfunciones(GramaticaLatinoParser.DeclfuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#declfunciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclfunciones(GramaticaLatinoParser.DeclfuncionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void enterReturnstat(GramaticaLatinoParser.ReturnstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void exitReturnstat(GramaticaLatinoParser.ReturnstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#idrelated}.
	 * @param ctx the parse tree
	 */
	void enterIdrelated(GramaticaLatinoParser.IdrelatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#idrelated}.
	 * @param ctx the parse tree
	 */
	void exitIdrelated(GramaticaLatinoParser.IdrelatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#dicc}.
	 * @param ctx the parse tree
	 */
	void enterDicc(GramaticaLatinoParser.DiccContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#dicc}.
	 * @param ctx the parse tree
	 */
	void exitDicc(GramaticaLatinoParser.DiccContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#incdec}.
	 * @param ctx the parse tree
	 */
	void enterIncdec(GramaticaLatinoParser.IncdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#incdec}.
	 * @param ctx the parse tree
	 */
	void exitIncdec(GramaticaLatinoParser.IncdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(GramaticaLatinoParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(GramaticaLatinoParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#contdeclfunciones}.
	 * @param ctx the parse tree
	 */
	void enterContdeclfunciones(GramaticaLatinoParser.ContdeclfuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#contdeclfunciones}.
	 * @param ctx the parse tree
	 */
	void exitContdeclfunciones(GramaticaLatinoParser.ContdeclfuncionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(GramaticaLatinoParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(GramaticaLatinoParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#auxcual}.
	 * @param ctx the parse tree
	 */
	void enterAuxcual(GramaticaLatinoParser.AuxcualContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#auxcual}.
	 * @param ctx the parse tree
	 */
	void exitAuxcual(GramaticaLatinoParser.AuxcualContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#auxidasig}.
	 * @param ctx the parse tree
	 */
	void enterAuxidasig(GramaticaLatinoParser.AuxidasigContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#auxidasig}.
	 * @param ctx the parse tree
	 */
	void exitAuxidasig(GramaticaLatinoParser.AuxidasigContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#cual}.
	 * @param ctx the parse tree
	 */
	void enterCual(GramaticaLatinoParser.CualContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#cual}.
	 * @param ctx the parse tree
	 */
	void exitCual(GramaticaLatinoParser.CualContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(GramaticaLatinoParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(GramaticaLatinoParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#auxlista}.
	 * @param ctx the parse tree
	 */
	void enterAuxlista(GramaticaLatinoParser.AuxlistaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#auxlista}.
	 * @param ctx the parse tree
	 */
	void exitAuxlista(GramaticaLatinoParser.AuxlistaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#dic}.
	 * @param ctx the parse tree
	 */
	void enterDic(GramaticaLatinoParser.DicContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#dic}.
	 * @param ctx the parse tree
	 */
	void exitDic(GramaticaLatinoParser.DicContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#auxdic}.
	 * @param ctx the parse tree
	 */
	void enterAuxdic(GramaticaLatinoParser.AuxdicContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#auxdic}.
	 * @param ctx the parse tree
	 */
	void exitAuxdic(GramaticaLatinoParser.AuxdicContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(GramaticaLatinoParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(GramaticaLatinoParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cadenaCaracteres}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterCadenaCaracteres(GramaticaLatinoParser.CadenaCaracteresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cadenaCaracteres}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitCadenaCaracteres(GramaticaLatinoParser.CadenaCaracteresContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAuxId}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterIdAuxId(GramaticaLatinoParser.IdAuxIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAuxId}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitIdAuxId(GramaticaLatinoParser.IdAuxIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funAnonima}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterFunAnonima(GramaticaLatinoParser.FunAnonimaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funAnonima}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitFunAnonima(GramaticaLatinoParser.FunAnonimaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valorReal}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterValorReal(GramaticaLatinoParser.ValorRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valorReal}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitValorReal(GramaticaLatinoParser.ValorRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusValorReal}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMinusValorReal(GramaticaLatinoParser.MinusValorRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusValorReal}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMinusValorReal(GramaticaLatinoParser.MinusValorRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusValorReal}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterPlusValorReal(GramaticaLatinoParser.PlusValorRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusValorReal}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitPlusValorReal(GramaticaLatinoParser.PlusValorRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verdadero}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterVerdadero(GramaticaLatinoParser.VerdaderoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verdadero}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitVerdadero(GramaticaLatinoParser.VerdaderoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cierto}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterCierto(GramaticaLatinoParser.CiertoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cierto}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitCierto(GramaticaLatinoParser.CiertoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falso}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterFalso(GramaticaLatinoParser.FalsoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falso}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitFalso(GramaticaLatinoParser.FalsoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nulo}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterNulo(GramaticaLatinoParser.NuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nulo}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitNulo(GramaticaLatinoParser.NuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expLista}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterExpLista(GramaticaLatinoParser.ExpListaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expLista}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitExpLista(GramaticaLatinoParser.ExpListaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expDic}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterExpDic(GramaticaLatinoParser.ExpDicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expDic}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitExpDic(GramaticaLatinoParser.ExpDicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expBuiltIn}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterExpBuiltIn(GramaticaLatinoParser.ExpBuiltInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expBuiltIn}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitExpBuiltIn(GramaticaLatinoParser.ExpBuiltInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notE}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterNotE(GramaticaLatinoParser.NotEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notE}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitNotE(GramaticaLatinoParser.NotEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parIExpParD}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterParIExpParD(GramaticaLatinoParser.ParIExpParDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parIExpParD}
	 * labeled alternative in {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitParIExpParD(GramaticaLatinoParser.ParIExpParDContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#builtinexp}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinexp(GramaticaLatinoParser.BuiltinexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#builtinexp}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinexp(GramaticaLatinoParser.BuiltinexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#auxid}.
	 * @param ctx the parse tree
	 */
	void enterAuxid(GramaticaLatinoParser.AuxidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#auxid}.
	 * @param ctx the parse tree
	 */
	void exitAuxid(GramaticaLatinoParser.AuxidContext ctx);
}