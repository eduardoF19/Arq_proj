package padroesestruturais.bridge;

public class Assinatura extends PlanoBase {

    public Assinatura(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase;
    }
}
