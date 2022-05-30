import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class ProdutoTest {

    @Test
    void deveRetornarUmProduto()
    {
        Peca peca1 = new Peca("Placa mãe", "Qualquer descrição");
        Peca peca2 = new Peca("Memoria Ram", "Qualquer descrição");
        Peca peca3 = new Peca("HD", "Qualquer descrição");
        Peca peca4 = new Peca("HD2", "Qualquer descrição, Remover");
        Peca peca5 = new Peca("Fonte", "Qualquer descrição");
        Produto computador = new Produto("Desktop L5874");
        computador.adicionar(peca1);
        computador.adicionar(peca2);
        computador.adicionar(peca3);
        computador.adicionar(peca4);
        computador.adicionar(peca5);
        computador.remover(peca4);
        assertEquals("Placa mãe, Memoria Ram, HD, Fonte", computador.getProduto());
    }

}