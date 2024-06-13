// Generated from f:/Julian/Universidad/2024-1/Lenguajes de programación/Analizador Semántico/AnalizadorSemanticoV1/grammar/GramaticaLatino.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterCondicionales(GramaticaLatinoParser.CondicionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitCondicionales(GramaticaLatinoParser.CondicionalesContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#eleccioncaso}.
	 * @param ctx the parse tree
	 */
	void enterEleccioncaso(GramaticaLatinoParser.EleccioncasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#eleccioncaso}.
	 * @param ctx the parse tree
	 */
	void exitEleccioncaso(GramaticaLatinoParser.EleccioncasoContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(GramaticaLatinoParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaLatinoParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(GramaticaLatinoParser.EContext ctx);
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