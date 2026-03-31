package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConteudoTest {

    @Test
    void deveRetornarValorConteudoComPlanoBasico() {
        Plano plano = new PlanoBasico();
        Conteudo conteudo = new Conteudo(50.0f);
        conteudo.setPlano(plano);
        conteudo.setQuantidade(2);
        assertEquals(100.0f, conteudo.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorConteudoComPlanoPadrao() {
        Plano plano = new PlanoPadrao();
        Conteudo conteudo = new Conteudo(50.0f);
        conteudo.setPlano(plano);
        conteudo.setQuantidade(2);
        assertEquals(110.0f, conteudo.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorConteudoComPlanoPremium() {
        Plano plano = new PlanoPremium();
        Conteudo conteudo = new Conteudo(50.0f);
        conteudo.setPlano(plano);
        conteudo.setQuantidade(2);
        assertEquals(120.0f, conteudo.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorConteudoComPlanoUltra() {
        Plano plano = new PlanoUltra();
        Conteudo conteudo = new Conteudo(50.0f);
        conteudo.setPlano(plano);
        conteudo.setQuantidade(2);
        assertEquals(130.0f, conteudo.calcularValor(), 0.01f);
    }

}
