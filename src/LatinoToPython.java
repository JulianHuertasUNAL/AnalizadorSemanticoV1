import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LatinoToPython extends GramaticaLatinoBaseListener{

    int numIdentation = 0;
    @Override
    public void enterS(GramaticaLatinoParser.SContext ctx) {
        //numIdentation++;
        //System.out.println("\t".repeat(numIdentation) + "entro a s");
    }

    @Override
    public void exitS(GramaticaLatinoParser.SContext ctx) {
        //numIdentation--;
        //System.out.println("\t".repeat(numIdentation) + "salgo de s");

    }

    @Override public void exitStatement(GramaticaLatinoParser.StatementContext ctx) {
        System.out.println("");
    }

    @Override
    public void enterIdrelated(GramaticaLatinoParser.IdrelatedContext ctx) {
        System.out.print(ctx.ID().getText());
        if(ctx.asig()!=null){
            //System.out.print(ctx.ID().getText());
        }
        if(ctx.incdec() != null){
            System.out.println(ctx.incdec().getText());
        }
    }
    @Override public void enterAsig(GramaticaLatinoParser.AsigContext ctx) {
        /*for(GramaticaLatinoParser.AuxidasigContext auxidasig : ctx.auxidasig()){
            System.out.print(auxidasig.getText());
        }*/
        //System.out.print(ctx.OPASIG().getText());
    }

    @Override public void enterAuxcual(GramaticaLatinoParser.AuxcualContext ctx) {
        System.out.print(",");
    }

    @Override public void enterExp(GramaticaLatinoParser.ExpContext ctx) {
        /*if(ctx.getChild(1)!=null){
            System.out.print(ctx.getChild(1).getText());
        }*/

        /*for(int i = 0 ; i<ctx.getChildCount(); i++){
            if(ctx.getChild(i).getText().equals("+")){
                System.out.print("+");
            }else if(ctx.getChild(i).getText().equals("-")){
                System.out.print("-");
            }
        }*/

    }



    @Override public void enterLista(GramaticaLatinoParser.ListaContext ctx) {
        System.out.print("[");
    }

    @Override public void exitLista(GramaticaLatinoParser.ListaContext ctx) {
        System.out.print("]");
    }

    @Override public void enterAuxlista(GramaticaLatinoParser.AuxlistaContext ctx) {
        System.out.print(",");
    }

    @Override public void enterCadenaCaracteres(GramaticaLatinoParser.CadenaCaracteresContext ctx) {
        System.out.print(ctx.getText());
    }


    @Override public void enterIdAuxId(GramaticaLatinoParser.IdAuxIdContext ctx) {
        System.out.print(ctx.ID().getText());
    }

    @Override public void enterIdContDeclFunciones(GramaticaLatinoParser.IdContDeclFuncionesContext ctx) {
        //System.out.print(ctx.ID().getText());
    }


    @Override public void enterFunAnonima(GramaticaLatinoParser.FunAnonimaContext ctx) {

    }

    @Override public void enterValorReal(GramaticaLatinoParser.ValorRealContext ctx) {
        System.out.print(ctx.getText());
    }

    @Override public void enterMinusValorReal(GramaticaLatinoParser.MinusValorRealContext ctx) {
        System.out.print(ctx.getText());
    }

    @Override public void enterPlusValorReal(GramaticaLatinoParser.PlusValorRealContext ctx) {
        System.out.print(ctx.getText());
    }

    @Override public void enterVerdadero(GramaticaLatinoParser.VerdaderoContext ctx) {
        System.out.print("True");
    }

    @Override public void enterCierto(GramaticaLatinoParser.CiertoContext ctx) {
        System.out.print("True");
    }

    @Override public void enterFalso(GramaticaLatinoParser.FalsoContext ctx) {
        System.out.print("False");
    }

    @Override public void enterNulo(GramaticaLatinoParser.NuloContext ctx) {
        System.out.print("None");
    }

    @Override public void enterExpLista(GramaticaLatinoParser.ExpListaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpLista(GramaticaLatinoParser.ExpListaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpDic(GramaticaLatinoParser.ExpDicContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpDic(GramaticaLatinoParser.ExpDicContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpBuiltIn(GramaticaLatinoParser.ExpBuiltInContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpBuiltIn(GramaticaLatinoParser.ExpBuiltInContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNotE(GramaticaLatinoParser.NotEContext ctx) {
        System.out.print("not ");
    }

    @Override public void enterParIExpParD(GramaticaLatinoParser.ParIExpParDContext ctx) {
        System.out.print("(");
    }

    @Override public void exitParIExpParD(GramaticaLatinoParser.ParIExpParDContext ctx) {
        System.out.print(")");
    }

    @Override public void visitTerminal(TerminalNode node) {//Cada vez que llega a un hoja del árbol sintáctico, mira cuál es su padre y agrega los símbolos terminales de los padres deseados, para poder manipular la traducción de otros casos
        RuleContext parent = (RuleContext) node.getParent();

        // Check if the parent is an instance of the specific context class
        if (parent instanceof GramaticaLatinoParser.ExpContext) {
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.DicContext){
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.AuxdicContext){
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.IdContDeclFuncionesContext){
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.ContdeclfuncionesContext){
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.AuxidContext){
            if(!node.getText().equals(".")){ // Los diccionarios se acceden diferente en python
                System.out.print(node.getText());
            }
        }else if(parent instanceof GramaticaLatinoParser.AsigContext){
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.AuxidasigContext){
            System.out.print(node.getText());
        }

    }
}
