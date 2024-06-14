public class LatinoToPython extends GramaticaLatinoBaseListener{

    int numIdentation = 0;
    @Override
    public void enterS(GramaticaLatinoParser.SContext ctx) {
        numIdentation++;
        System.out.println("\t".repeat(numIdentation) + "entro a s");
    }

    @Override
    public void exitS(GramaticaLatinoParser.SContext ctx) {
        numIdentation--;
        System.out.println("\t".repeat(numIdentation) + "salgo de s");

    }

    @Override
    public void enterIdrelated(GramaticaLatinoParser.IdrelatedContext ctx) {
        System.out.print(ctx.ID().getText());
        if(ctx.asig()!=null){
            System.out.println(ctx.asig().getText());
        }
        if(ctx.incdec() != null){
            System.out.println(ctx.incdec().getText());
        }
    }
}
