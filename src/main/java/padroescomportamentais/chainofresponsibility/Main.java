package padroescomportamentais.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        // Criar a corrente
        FuncionarioSuporte nivel3 = new SuporteNivel3(null);
        FuncionarioSuporte nivel2 = new SuporteNivel2(nivel3);
        FuncionarioSuporte nivel1 = new SuporteNivel1(nivel2);

        System.out.println("--- Testando Sistema de Suporte ---");
        
        System.out.println("Chamado de Senha: " + nivel1.resolverChamado(new Chamado(TipoChamadoSenha.getInstance())));
        System.out.println("Chamado de Software: " + nivel1.resolverChamado(new Chamado(TipoChamadoSoftware.getInstance())));
        System.out.println("Chamado de Bug: " + nivel1.resolverChamado(new Chamado(TipoChamadoBug.getInstance())));
    }
}
