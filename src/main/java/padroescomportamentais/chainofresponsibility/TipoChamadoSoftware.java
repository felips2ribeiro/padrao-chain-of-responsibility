package padroescomportamentais.chainofresponsibility;

public class TipoChamadoSoftware extends TipoChamado {
    private static TipoChamadoSoftware instance = new TipoChamadoSoftware();
    private TipoChamadoSoftware() {}
    public static TipoChamadoSoftware getInstance() { return instance; }
}
