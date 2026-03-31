package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConteudoAvancadoTest {

    @Test
    void deveRetornarValorConteudoAvancadoComPlanoBasico() {
        Plano plano = new PlanoBasico();
        ConteudoAvancado conteudo = new ConteudoAvancado(2000.0f);
        conteudo.setPlano(plano);
        assertEquals(2000.0f, conteudo.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorConteudoAvancadoComPlanoPadrao() {
        Plano plano = new PlanoPadrao();
        ConteudoAvancado conteudo = new ConteudoAvancado(2000.0f);
        conteudo.setPlano(plano);
        assertEquals(2200.0f, conteudo.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorConteudoAvancadoComPlanoPremium() {
        Plano plano = new PlanoPremium();
        ConteudoAvancado conteudo = new ConteudoAvancado(2000.0f);
        conteudo.setPlano(plano);
        assertEquals(2400.0f, conteudo.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorConteudoAvancadoComPlanoUltra() {
        Plano plano = new PlanoUltra();
        ConteudoAvancado conteudo = new ConteudoAvancado(2000.0f);
        conteudo.setPlano(plano);
        assertEquals(2600.0f, conteudo.calcularValor(), 0.01f);
    }

}
