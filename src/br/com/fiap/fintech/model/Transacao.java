package br.com.fiap.fintech.model;

import java.time.LocalDateTime;

public class Transacao {
    private int idTransacao;
    private double valor;
    private TipoOperacao tipoOperacao;
    private String meioPagamento; // Ex: "PIX", "TED", "Boleto"
    private LocalDateTime data;
    private Conta contaTransacao;
    private Categoria categoria;

    public Transacao() {
    }

    public Transacao(int idTransacao, double valor, TipoOperacao tipoOperacao, String meioPagamento, Conta contaTransacao, Categoria categoria) {
        if (contaTransacao == null) {
            throw new IllegalArgumentException("Conta não pode ser nula.");
        }

        boolean sucesso = tipoOperacao.processar(contaTransacao, valor);

        if (!sucesso) {
            throw new IllegalStateException("Transação recusada: Saldo insuficiente.");
        }

        this.idTransacao = idTransacao;
        this.valor = valor;
        this.tipoOperacao = tipoOperacao;
        this.meioPagamento = meioPagamento;
        this.contaTransacao = contaTransacao;
        this.data = LocalDateTime.now();
        this.categoria = categoria;
    }

    public void exibirComprovante() {
        System.out.println("=== COMPROVANTE DE TRANSAÇÃO ===");
        System.out.println("ID: " + idTransacao + " | Valor: R$ " + valor + " | Operação: " + tipoOperacao);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public String getMeioPagamento() {
        return meioPagamento;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Conta getContaTransacao() {
        return contaTransacao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setMeioPagamento(String meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setContaTransacao(Conta contaTransacao) {
        this.contaTransacao = contaTransacao;
    }

    public void estornarTransacao(Conta conta) {
        System.out.println("[Método estornarTransacao] Solicitando estorno para a transação de ID: " + idTransacao
                + " no valor de R$" + valor);

        conta.setSaldo(valor);
    }
}
