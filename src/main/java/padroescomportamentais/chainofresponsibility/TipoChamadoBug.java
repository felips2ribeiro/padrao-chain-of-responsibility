package padroescomportamentais.chainofresponsibility;

public class TipoChamadoBug extends TipoChamado {
    private static TipoChamadoBug instance = new TipoChamadoBug();
    private TipoChamadoBug() {}
    public static TipoChamadoBug getInstance() { return instance; }
}
