package padroescomportamentais.chainofresponsibility;

import java.util.ArrayList;

public abstract class FuncionarioSuporte {
    protected ArrayList<TipoChamado> listaChamados = new ArrayList<>();
    private FuncionarioSuporte superior;

    public FuncionarioSuporte getSuperior() { return superior; }
    public void setSuperior(FuncionarioSuporte superior) { this.superior = superior; }

    public abstract String getDescricaoNivel();

    public String resolverChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoNivel();
        } else {
            if (superior != null) {
                return superior.resolverChamado(chamado);
            } else {
                return "Sem solução";
            }
        }
    }
}
