package padroesestruturais.bridge;

public class Conteudo extends Plano {

    private int quantidade;

    public Conteudo(float valorBase) {
        super(valorBase);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float calcularValor() {
        return this.valorBase * this.quantidade * (1 + this.qualidade.percentualAumento());
    }
}
