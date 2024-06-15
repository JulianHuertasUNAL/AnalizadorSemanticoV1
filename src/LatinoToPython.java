import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LatinoToPython extends GramaticaLatinoBaseListener{

    int numIdentation = 0;
    boolean flagConcatenar = false;
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
        RuleContext parent = (RuleContext) ctx.getParent();
        if(!(parent instanceof GramaticaLatinoParser.FunAnonimaContext)) {
            System.out.println("");
        }
    }

    @Override
    public void enterIdrelated(GramaticaLatinoParser.IdrelatedContext ctx) {
        System.out.print("\t".repeat(numIdentation) + ctx.ID().getText());
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
        /*RuleContext parent = (RuleContext) ctx.getParent();
        if(ctx.getChild(1) != null) {//Si encuentra una concatenación, levanta la bandera para hacer la conversión a string de todos los elementos que encuentra para evitar fallos de impresión
            if(ctx.getChild(1).getText().equals("..")){
                flagConcatenar = true;
            }
        }
        if(ctx.e()!=null) {

            if (flagConcatenar && (!(parent instanceof GramaticaLatinoParser.AuxidContext)&&!(parent instanceof GramaticaLatinoParser.ParIExpParDContext)&&!(parent instanceof GramaticaLatinoParser.ContdeclfuncionesContext))) { //si el padre no es auxid y el hijo es e no es nulo
                System.out.print("str(");
            }
        }
        if(flagConcatenar && ((parent instanceof GramaticaLatinoParser.AuxidContext)||(parent instanceof GramaticaLatinoParser.ParIExpParDContext)||(parent instanceof GramaticaLatinoParser.ContdeclfuncionesContext))){
            flagConcatenar = false;
        }*/
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

    @Override public void exitExp(GramaticaLatinoParser.ExpContext ctx) {
        /*if(ctx.getParent().getChild(1)!=null && ctx.e()!=null) {
            String brother = ctx.getParent().getChild(1).getText();
            //if (brother.equals("..") /*&& !ctx.getChild(1).getText().equals("..")) { //si el padre no es auxid y el hijo es e no es nulo
                System.out.print(")");
                flagConcatenar = true;
            }
        }
        //Va a mirar si uno de sus hijos es una concatenación, si así lo es, mira si su padre es una expresión, en caso de no serlo, quiere decir que fue la expresión que originó las concatenacipnes y que necesitaban el (str) para imprimir bien
        RuleContext parent = (RuleContext) ctx.getParent();
        if(ctx.getChild(1) != null){
            if(ctx.getChild(1).getText().equals("..") && !(parent instanceof GramaticaLatinoParser.ExpContext)){
                flagConcatenar = false;
            }
        }
        if(ctx.getChild(1) != null) {//Si encuentra una concatenación, levanta la bandera para hacer la conversión a string de todos los elementos que encuentra para evitar fallos de impresión
            if(ctx.getChild(1).getText().equals("..")){
                flagConcatenar = true;
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
        //System.out.print(ctx.ID().getText());
    }


    @Override public void enterFunAnonima(GramaticaLatinoParser.FunAnonimaContext ctx) {
        //System.out.print("lambda ");
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
            if(node.getText().equals("..")){
                System.out.print("+");
                //flagConcatenar = true;
            }else{
                System.out.print(node.getText());
            }
        }else if(parent instanceof GramaticaLatinoParser.DicContext){
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.AuxdicContext){
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.IdAuxIdContext){
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
        }else if(parent instanceof GramaticaLatinoParser.FunAnonimaContext){
            String terminal = node.getText();
            if(terminal.equals("fun")){
                System.out.print("lambda ");
            }else if(terminal.equals(")")){
                System.out.print(":");
            }
        }else if(parent instanceof GramaticaLatinoParser.DeclfuncionesContext){
            String terminal = node.getText();
            if(terminal.equals("fun") || terminal.equals("funcion")){
                System.out.print("\t".repeat(numIdentation) + "def ");
            }else if(terminal.equals(")")){
                System.out.println(terminal+":");
                numIdentation++;
            }else if(terminal.equals("fin")){
                numIdentation--;
            }else{
                System.out.print(terminal);
            }
        }else if(parent instanceof GramaticaLatinoParser.ReturnstatContext){
            RuleContext contexto = (RuleContext) parent.getParent().getParent(); // Va a mirar en qué contexto está, si está adentro de una lista, en una función anónima, no aplica la identación, de lo contrario, la aplica
            if(!(contexto instanceof GramaticaLatinoParser.FunAnonimaContext)){
                System.out.print("\t".repeat(numIdentation) + "return ");
            }
        }else if(parent instanceof GramaticaLatinoParser.BuiltinContext){
            String funStatBuiltIn = node.getText();
            if(funStatBuiltIn.equals("imprimir") || funStatBuiltIn.equals("poner") || funStatBuiltIn.equals("escribir")){
                System.out.print("\t".repeat(numIdentation)+ "print");
            }else{ ///Aquí con más else if se agregan el resto de built in que sean de los statements, los built in terminales van en otro lado
                System.out.print(funStatBuiltIn);
            }
        }

    }
}
