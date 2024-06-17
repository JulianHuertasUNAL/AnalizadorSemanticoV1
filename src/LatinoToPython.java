import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LatinoToPython extends GramaticaLatinoBaseListener{

    int numIdentation = 0;
    boolean flagConcatenar = false;
    String nomVarElegir;
    boolean flagDesde = false; //Se activa cuando se entre a un desde para que no se imprimiman los termnales de las expresiones
    boolean flagRepetir = false;


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
        if(!flagDesde && !flagRepetir) {
            System.out.print("\t".repeat(numIdentation) + ctx.ID().getText());
        }
        if(ctx.asig()!=null){
            //System.out.print(ctx.ID().getText());
        }
        if(ctx.incdec() != null){
            if(!flagDesde && !flagRepetir) {
                if(ctx.incdec().getText().equals("++")) {
                    System.out.print("+=1");
                }else if(ctx.incdec().getText().equals("--")) {
                    System.out.print("-=1");
                }

            }
        }
    }

    @Override public void enterCual(GramaticaLatinoParser.CualContext ctx) {
        if(ctx.exp()==null){
            System.out.print("input()");
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
        RuleContext parent = (RuleContext) ctx.getParent();
        if(parent instanceof GramaticaLatinoParser.MientrasContext){
            System.out.println(":");
            numIdentation++;
        }
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
        if(!flagDesde && !flagRepetir) {
            RuleContext grandparent = (RuleContext) ctx.getParent().getParent();// Va a mirar si el operador relacional es un .. para encerrarse en un str()
            if((grandparent instanceof GramaticaLatinoParser.ExpContext) && ctx.getParent().getParent().getChild(1).getText().equals("..") ) {
                System.out.print("str(");
            }
        }
    }

    @Override public void exitIdAuxId(GramaticaLatinoParser.IdAuxIdContext ctx) {
        if(!flagDesde && !flagRepetir) {
            RuleContext grandparent = (RuleContext) ctx.getParent().getParent();// Va a mirar si el operador relacional es un .. para encerrarse en un str()
            if((grandparent instanceof GramaticaLatinoParser.ExpContext) && ctx.getParent().getParent().getChild(1).getText().equals("..") ) {
                System.out.print(")");
            }
        }
    }


    @Override public void enterFunAnonima(GramaticaLatinoParser.FunAnonimaContext ctx) {
        //System.out.print("lambda ");
    }

    @Override public void enterValorReal(GramaticaLatinoParser.ValorRealContext ctx) {
        if(!flagDesde && !flagRepetir) {
            RuleContext grandparent = (RuleContext) ctx.getParent().getParent();// Va a mirar si el operador relacional es un .. para encerrarse en un str()
            if((grandparent instanceof GramaticaLatinoParser.ExpContext) && ctx.getParent().getParent().getChild(1).getText().equals("..") ) {
                System.out.print("str("+ctx.getText()+")");
            }else{
                System.out.print(ctx.getText());
            }
        }
    }

    @Override public void enterMinusValorReal(GramaticaLatinoParser.MinusValorRealContext ctx) {
        if(!flagDesde && !flagRepetir) {
            RuleContext grandparent = (RuleContext) ctx.getParent().getParent();// Va a mirar si el operador relacional es un .. para encerrarse en un str()
            if((grandparent instanceof GramaticaLatinoParser.ExpContext) && ctx.getParent().getParent().getChild(1).getText().equals("..") ) {
                System.out.print("str("+ctx.getText()+")");
            }else{
                System.out.print(ctx.getText());
            }
        }
    }

    @Override public void enterPlusValorReal(GramaticaLatinoParser.PlusValorRealContext ctx) {
        if(!flagDesde && !flagRepetir) {
            RuleContext grandparent = (RuleContext) ctx.getParent().getParent();// Va a mirar si el operador relacional es un .. para encerrarse en un str()
            if((grandparent instanceof GramaticaLatinoParser.ExpContext) && ctx.getParent().getParent().getChild(1).getText().equals("..") ) {
                System.out.print("str("+ctx.getText()+")");
            }else{
                System.out.print(ctx.getText());
            }
        }
    }

    @Override public void enterVerdadero(GramaticaLatinoParser.VerdaderoContext ctx) {
        if(!flagDesde && !flagRepetir) {
            RuleContext grandparent = (RuleContext) ctx.getParent().getParent();// Va a mirar si el operador relacional es un .. para encerrarse en un str()
            if((grandparent instanceof GramaticaLatinoParser.ExpContext) && ctx.getParent().getParent().getChild(1).getText().equals("..") ) {
                System.out.print("str(True)");
            }else{
                System.out.print("True");
            }
        }
    }

    @Override public void enterCierto(GramaticaLatinoParser.CiertoContext ctx) {
        if(!flagDesde && !flagRepetir) {
            RuleContext grandparent = (RuleContext) ctx.getParent().getParent();// Va a mirar si el operador relacional es un .. para encerrarse en un str()
            if((grandparent instanceof GramaticaLatinoParser.ExpContext) && ctx.getParent().getParent().getChild(1).getText().equals("..") ) {
                System.out.print("str(True)");
            }else{
                System.out.print("True");
            }
        }
    }

    @Override public void enterFalso(GramaticaLatinoParser.FalsoContext ctx) {
        if(!flagDesde && !flagRepetir) {
            RuleContext grandparent = (RuleContext) ctx.getParent().getParent();// Va a mirar si el operador relacional es un .. para encerrarse en un str()
            if((grandparent instanceof GramaticaLatinoParser.ExpContext) && ctx.getParent().getParent().getChild(1).getText().equals("..") ) {
                System.out.print("str(False)");
            }else{
                System.out.print("False");
            }
        }
    }

    @Override public void enterNulo(GramaticaLatinoParser.NuloContext ctx) {
        if(!flagDesde && !flagRepetir) {
            RuleContext grandparent = (RuleContext) ctx.getParent().getParent();// Va a mirar si el operador relacional es un .. para encerrarse en un str()
            if((grandparent instanceof GramaticaLatinoParser.ExpContext) && ctx.getParent().getParent().getChild(1).getText().equals("..") ) {
                System.out.print("str(None)");
            }else{
                System.out.print("None");
            }
        }
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
        //RuleContext grandparent = (RuleContext) ctx.getParent().getParent(); // Va a mirar que su abuelo no sea de un condicional elegir, para no colocar los paréntesis
        //if(!(grandparent instanceof GramaticaLatinoParser.ElegirContext)) {
        if(!flagDesde && !flagRepetir) {
            RuleContext grandparent = (RuleContext) ctx.getParent().getParent();// Va a mirar si el operador relacional es un .. para encerrarse en un str()
            if((grandparent instanceof GramaticaLatinoParser.ExpContext) && ctx.getParent().getParent().getChild(1).getText().equals("..") ) {
                System.out.print("str((");
            }else{
                System.out.print("(");
            }
        }
        //}
    }

    @Override public void exitParIExpParD(GramaticaLatinoParser.ParIExpParDContext ctx) {
        //RuleContext grandparent = (RuleContext) ctx.getParent().getParent(); // Va a mirar que su abuelo no sea de un condicional elegir, para no colocar los paréntesis
        //if(!(grandparent instanceof GramaticaLatinoParser.ElegirContext)) {
        if(!flagDesde && !flagRepetir) {
            RuleContext grandparent = (RuleContext) ctx.getParent().getParent();// Va a mirar si el operador relacional es un .. para encerrarse en un str()
            if((grandparent instanceof GramaticaLatinoParser.ExpContext) && ctx.getParent().getParent().getChild(1).getText().equals("..") ) {
                System.out.print("))");
            }else{
                System.out.print(")");
            }
        }
        //}else{
        //    System.out.print(" == ");
        //}
    }

    @Override public void enterElegir(GramaticaLatinoParser.ElegirContext ctx) {
        nomVarElegir = ctx.exp().getText();
    }

    @Override public void enterDesde(GramaticaLatinoParser.DesdeContext ctx) {
        flagDesde = true;
        String valorInicial = ctx.asig().cual().getText();
        String valorFinal;
        String paso = "";
        //Dado que en la función in range de python no se incluye el valor que se indica como final, se tiene que tener en cuenta si el operador relacional es >= o <=
        if(ctx.exp().OPREL().getText().equals("<=")){
            valorFinal = ctx.exp().exp(1).getText()+"+1";
        }else if(ctx.exp().OPREL().getText().equals(">=")){
            valorFinal = ctx.exp().exp(1).getText()+"-1";
        }else{
            valorFinal = ctx.exp().exp(1).getText();
        }
        //Para el paso se contemplan tres posibilidades: Que sea de la manera i++ o i+=INT o i = i+INT
        if(ctx.statement(0).idrelated().incdec() != null){//i++
            if(ctx.statement(0).idrelated().incdec().getText().equals("++")){
                paso = "1";
            }else{
                paso = "-1";
            }
        }else if(ctx.statement(0).idrelated().asig() != null){//i+=INT o i-=INT o i = i+INT
            if(ctx.statement(0).idrelated().asig().OPASIG().getText().equals("+=")){//i+=INT
                paso = ctx.statement(0).idrelated().asig().cual().getText();
            }else if(ctx.statement(0).idrelated().asig().OPASIG().getText().equals("-=")){//i-=INT
                paso = "-"+ctx.statement(0).idrelated().asig().cual().getText();
            }else if(ctx.statement(0).idrelated().asig().OPASIG().getText().equals("=")){//i = i + INT
                String signo = ctx.statement(0).idrelated().asig().cual().exp().getChild(1).getText();
                paso = signo+ctx.statement(0).idrelated().asig().cual().exp().exp(1).getText();
            }
        }
        System.out.print("\t".repeat(numIdentation) + "for "+ctx.ID().getText() + " in range("+valorInicial+","+valorFinal+","+paso+"):");

    }

    @Override public void exitDesde(GramaticaLatinoParser.DesdeContext ctx) {
        flagDesde = false;
    }

    @Override public void enterMientras(GramaticaLatinoParser.MientrasContext ctx) {
        System.out.print("\t".repeat(numIdentation) + "while ");
    }

    @Override public void enterContelegir(GramaticaLatinoParser.ContelegirContext ctx) {
        RuleContext parent = (RuleContext) ctx.getParent();
        if(!(parent instanceof GramaticaLatinoParser.ElegirContext) && ctx.getChild(0).getText().equals("caso")){
            numIdentation--;
            System.out.print("\t".repeat(numIdentation) + "elif "+nomVarElegir+" == ");
        }else if(!(parent instanceof GramaticaLatinoParser.ElegirContext) && (ctx.getChild(0).getText().equals("otro") || ctx.getChild(0).getText().equals("defecto"))) {
            numIdentation--;
            System.out.println("\t".repeat(numIdentation) + "else: ");
            numIdentation++;
        }else if(parent instanceof GramaticaLatinoParser.ElegirContext){
            System.out.print(" == ");
        }
        if(ctx.casoexp() != null){
            System.out.print(ctx.casoexp().getText());
        }
    }

    @Override public void enterElegirOr(GramaticaLatinoParser.ElegirOrContext ctx){
        System.out.print(" or "+nomVarElegir+" == " +ctx.casoexp().getText());
    }

    @Override public void enterElegirStatement(GramaticaLatinoParser.ElegirStatementContext ctx) {
        System.out.println(":");
        numIdentation++;
    }

    @Override public void exitElegir(GramaticaLatinoParser.ElegirContext ctx) {
        numIdentation--;
    }

    @Override public void enterRepetir(GramaticaLatinoParser.RepetirContext ctx) {

        String condicionRepetir = "";
        if(ctx.exp().OPREL().getText().equals("==")){//Se tiene que poner el inverso del operador relacional y sumar 1 para que se conserve la misma lógica
            condicionRepetir = ctx.exp().exp(0).getText() + " != "+ ctx.exp().exp(1).getText()+"+1";
        }else if(ctx.exp().OPREL().getText().equals(">=")){
            condicionRepetir = ctx.exp().exp(0).getText() + " < "+ ctx.exp().exp(1).getText()+"+1";
        }else if(ctx.exp().OPREL().getText().equals("<=")){
            condicionRepetir = ctx.exp().exp(0).getText() + " > "+ ctx.exp().exp(1).getText()+"+1";
        }else if(ctx.exp().OPREL().getText().equals("<")){
            condicionRepetir = ctx.exp().exp(0).getText() + " >= "+ ctx.exp().exp(1).getText()+"+1";
        }else if(ctx.exp().OPREL().getText().equals(">")){
            condicionRepetir = ctx.exp().exp(0).getText() + " <= "+ ctx.exp().exp(1).getText()+"+1";
        }
        System.out.println("\t".repeat(numIdentation) + "while "+ condicionRepetir +":");
        numIdentation++;
    }

    @Override public void exitRepetir(GramaticaLatinoParser.RepetirContext ctx) {
        numIdentation--;
        flagRepetir = false;
    }

    @Override public void enterPara(GramaticaLatinoParser.ParaContext ctx) {
        String dosParaArgument = "";
        String tresParaArgument = "";
        if(ctx.dospara() != null){
            dosParaArgument = ","+ctx.dospara().VALOR_REAL().getText();
            if(ctx.dospara().trespara() != null){
                tresParaArgument = ","+ctx.dospara().trespara().VALOR_REAL().getText();
            }
        }
        System.out.println("\t".repeat(numIdentation) + "for "+ ctx.ID().getText()+" in range("+ctx.VALOR_REAL().getText()+dosParaArgument+tresParaArgument+"):");
        numIdentation++;
    }

    @Override public void exitPara(GramaticaLatinoParser.ParaContext ctx) {
        numIdentation--;
    }

    @Override public void visitTerminal(TerminalNode node) {//Cada vez que llega a un hoja del árbol sintáctico, mira cuál es su padre y agrega los símbolos terminales de los padres deseados, para poder manipular la traducción de otros casos
        RuleContext parent = (RuleContext) node.getParent();

        // Check if the parent is an instance of the specific context class
        if (parent instanceof GramaticaLatinoParser.ExpContext) {
            if(!flagDesde && !flagRepetir) {
                if(node.getText().equals("..")){
                    System.out.print("+");
                    //flagConcatenar = true;
                }else if(node.getText().equals("^")){
                    System.out.print("**");
                }else if(node.getText().equals("&&")){
                    System.out.print(" and ");
                }else if(node.getText().equals("||")){
                    System.out.print(" or ");
                }else{
                    System.out.print(node.getText());
                }
            }
        }else if(parent instanceof GramaticaLatinoParser.DicContext){
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.AuxdicContext){
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.IdAuxIdContext){
            if(!flagDesde && !flagRepetir) {
                System.out.print(node.getText());
            }
        }else if(parent instanceof GramaticaLatinoParser.ContdeclfuncionesContext){
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.AuxidContext){
            if(!node.getText().equals(".") && parent.getChild(0)!=null){ // Los diccionarios se acceden diferente en python
                if(parent.getChild(0).getText().equals(".")){
                    System.out.print("\""+node.getText()+"\"]");
                }else {
                    System.out.print(node.getText());
                }
            }else if(node.getText().equals(".")){
                System.out.print("[");
            }
        }else if(parent instanceof GramaticaLatinoParser.AsigContext){
            if(!flagDesde) {
                System.out.print(node.getText());
            }
        }else if(parent instanceof GramaticaLatinoParser.AuxidasigContext){
            if(node.getText().equals(".")){
                System.out.print("[");
            }else if(parent.getChild(0)!=null){
                if(parent.getChild(0).getText().equals(".")){
                    System.out.print("\""+node.getText()+"\"]");
                }else {
                    System.out.print(node.getText());
                }
            }

        }else if(parent instanceof GramaticaLatinoParser.FunAnonimaContext){
            String terminal = node.getText();
            if(terminal.equals("fun") || terminal.equals("funcion")){
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
        }else if(parent instanceof GramaticaLatinoParser.FuncContext){
            System.out.print(node.getText());
        }else if(parent instanceof GramaticaLatinoParser.ElegirContext){ //Switch CASE
            if(node.getText().equals("elegir")){
                System.out.print("\t".repeat(numIdentation)+ "if ");
            }
        }else if(parent instanceof GramaticaLatinoParser.DesdeContext){
            if(node.getText().equals(")")){
                flagDesde = false;
                numIdentation++;
            }else if(node.getText().equals("fin")){
                numIdentation--;
            }
        }else if(parent instanceof GramaticaLatinoParser.RepetirContext){
            if(node.getText().equals("hasta")){
                flagRepetir = true;
            }
        }else if(parent instanceof GramaticaLatinoParser.MientrasContext){
            if(node.getText().equals("fin")){
                numIdentation--;
            }
        }else if(parent instanceof GramaticaLatinoParser.DiccContext){
            if(node.getText().equals(".")){
                System.out.print("[");
            }else{
                System.out.print("\""+node.getText()+"\"]");
            }
        }

    }
}
