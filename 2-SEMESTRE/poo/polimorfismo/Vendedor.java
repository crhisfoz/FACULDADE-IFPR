public class Vendedor {
    // Polimorfismo Overload

    // Comissão de 5% + R$ 20
    public float calcularComissao(float venda) {
        float comissao = (venda * 0.05f) + 20.0f;
        return comissao;
    }

    // % de comissão variável
    public float calcularComissao(float venda, float perc) {
        float comissao = venda * perc;
        return comissao;
    }
}