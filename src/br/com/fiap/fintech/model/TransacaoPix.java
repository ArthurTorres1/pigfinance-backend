package br.com.fiap.fintech.model;

public class TransacaoPix extends Transacao{
    private String chavePix;

    // Construtor
    public TransacaoPix(int idTransacao, double valor, TipoOperacao tipoOperacao, Conta contaTransacao, Categoria categoria, String chavePix) {
        // Chama o construtor da superclasse (Transacao)
        super(idTransacao, valor, tipoOperacao, "PIX", contaTransacao, categoria);
        this.chavePix = chavePix;
    }

    // Polimorfismo
    @Override
    public void exibirComprovante() {
        super.exibirComprovante();
        System.out.println("Meio de Pagamento: PIX | Chave: " + chavePix);
        System.out.println("----------------------------------------");
    }

    // Encapsulamento
    public String getChavePix() { return chavePix; }
    public void setChavePix(String chavePix) { this.chavePix = chavePix; }
}

