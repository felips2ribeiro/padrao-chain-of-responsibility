package padroescomportamentais.chainofresponsibility;

public class Chamado {
    private TipoChamado tipoChamado;

    public Chamado(TipoChamado tipoChamado) {
        this.tipoChamado = tipoChamado;
    }

    public TipoChamado getTipoChamado() {
        return tipoChamado;
    }
}
