package padroescomportamentais.chainofresponsibility;

public class SuporteNivel1 extends FuncionarioSuporte {
    public SuporteNivel1(FuncionarioSuporte superior) {
        listaChamados.add(TipoChamadoSenha.getInstance());
        setSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Nível 1";
    }
}
