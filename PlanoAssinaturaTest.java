package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssinaturaTest {

    @Test
    void deveRetornarValorAssinaturaComPlanoBasico() {
        Plano plano = new PlanoBasico();
        Assinatura assinatura = new Assinatura(1000.0f);
        assinatura.setPlano(plano);
        assertEquals(1000.0f, assinatura.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorAssinaturaComPlanoPadrao() {
        Plano plano = new PlanoPadrao();
        Assinatura assinatura = new Assinatura(1000.0f);
        assinatura.setPlano(plano);
        assertEquals(1000.0f, assinatura.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorAssinaturaComPlanoPremium() {
        Plano plano = new PlanoPremium();
        Assinatura assinatura = new Assinatura(1000.0f);
        assinatura.setPlano(plano);
        assertEquals(1000.0f, assinatura.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorAssinaturaComPlanoUltra() {
        Plano plano = new PlanoUltra();
        Assinatura assinatura = new Assinatura(1000.0f);
        assinatura.setPlano(plano);
        assertEquals(1000.0f, assinatura.calcularValor(), 0.01f);
    }

}
