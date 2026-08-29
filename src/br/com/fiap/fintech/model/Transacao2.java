package br.com.fiap.fintech.model;

public class Transacao2 {
    private int idTransacao;
    private double valor;
    private String tipo; // Ex: "PIX", "TED", "Boleto"
    private String data;

    public Transacao2() {
    }

    public Transacao2(int idTransacao, double valor, String tipo, String data) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }

    // Getters e Setters
    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void registrarTransacao() {
        System.out.println("[Método registrarTransacao] Registrando transação de ID: " + idTransacao
                + " no valor de R$" + valor + " do tipo '" + tipo + "' em " + data);
    }

    public void estornarTransacao() {
        System.out.println("[Método estornarTransacao] Solicitando estorno para a transação de ID: " + idTransacao
                + " no valor de R$" + valor);
    }
}
