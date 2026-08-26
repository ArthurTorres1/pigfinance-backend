public class Transacao {
    private String descricao;
    private double valor;
    private String tipo; // Pode ser "RECEITA" ou "DESPESA"
    private Categoria categoria;

    public Transacao(String descricao, double valor, String tipo, Categoria categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}