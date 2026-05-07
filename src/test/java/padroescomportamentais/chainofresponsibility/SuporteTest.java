package padroescomportamentais.chainofresponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SuporteTest {

    FuncionarioSuporte nivel1;
    FuncionarioSuporte nivel2;
    FuncionarioSuporte nivel3;

    @BeforeEach
    void setUp() {
        nivel3 = new SuporteNivel3(null);
        nivel2 = new SuporteNivel2(nivel3);
        nivel1 = new SuporteNivel1(nivel2);
    }

    @Test
    void deveResolverChamadoSenhaNivel1() {
        assertEquals("Nível 1", nivel1.resolverChamado(new Chamado(TipoChamadoSenha.getInstance())));
    }

    @Test
    void deveResolverChamadoSoftwareNivel2() {
        assertEquals("Nível 2", nivel1.resolverChamado(new Chamado(TipoChamadoSoftware.getInstance())));
    }

    @Test
    void deveResolverChamadoBugNivel3() {
        assertEquals("Nível 3", nivel1.resolverChamado(new Chamado(TipoChamadoBug.getInstance())));
    }

    @Test
    void naoDeveResolverChamadoSemSolucao() {
        TipoChamado tipoDesconhecido = new TipoChamado() {}; // Tipo anônimo para teste
        assertEquals("Sem solução", nivel1.resolverChamado(new Chamado(tipoDesconhecido)));
    }
}
