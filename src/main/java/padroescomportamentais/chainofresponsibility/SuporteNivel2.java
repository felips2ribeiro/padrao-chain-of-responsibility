package padroescomportamentais.chainofresponsibility;

public class SuporteNivel2 extends FuncionarioSuporte {
    public SuporteNivel2(FuncionarioSuporte superior) {
        listaChamados.add(TipoChamadoSoftware.getInstance());
        setSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Nível 2";
    }
}
