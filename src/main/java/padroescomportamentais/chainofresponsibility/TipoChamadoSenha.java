package padroescomportamentais.chainofresponsibility;

public class TipoChamadoSenha extends TipoChamado {
    private static TipoChamadoSenha instance = new TipoChamadoSenha();
    private TipoChamadoSenha() {}
    public static TipoChamadoSenha getInstance() { return instance; }
}
