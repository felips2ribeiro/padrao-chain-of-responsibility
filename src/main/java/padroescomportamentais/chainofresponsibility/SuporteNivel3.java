package padroescomportamentais.chainofresponsibility;

public class SuporteNivel3 extends FuncionarioSuporte {
    public SuporteNivel3(FuncionarioSuporte superior) {
        listaChamados.add(TipoChamadoBug.getInstance());
        setSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Nível 3";
    }
}
