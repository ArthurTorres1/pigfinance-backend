package br.com.fiap.fintech.model;

public class Caixinha {
    private int idCaixinha;
    private String nomeCaixinha;
    private double valorObjetivo;
    private double valorPoupado;

    public Caixinha() {
    }

    public Caixinha(int idCaixinha, String nomeCaixinha, double valorObjetivo, double valorPoupado) {
        this.idCaixinha = idCaixinha;
        this.nomeCaixinha = nomeCaixinha;
        this.valorObjetivo = valorObjetivo;
        this.valorPoupado = valorPoupado;
    }

    public int getIdCaixinha() {
        return this.idCaixinha;
    }

    public void setIdCaixinha(int idCaixinha) {
        this.idCaixinha = idCaixinha;
    }

    public String getNomeCaixinha() {
        return this.nomeCaixinha;
    }

    public void setNomeCaixinha(String nomeCaixinha) {
        this.nomeCaixinha = nomeCaixinha;
    }

    public double getValorObjetivo() {
        return this.valorObjetivo;
    }

    public void setValorObjetivo(double valorObjetivo) {
        this.valorObjetivo = valorObjetivo;
    }

    public double getValorPoupado() {
        return this.valorPoupado;
    }

    public void setValorPoupado(double valorPoupado) {
        this.valorPoupado = valorPoupado;
    }

    public void pouparNaCaixinha(Conta conta, double valor) {
        boolean sucesso = conta.sacar(valor);
        if(sucesso){
            System.out.println("[Método pouparNaCaixinha] Adicionando R$" + valor + " à caixinha '"
                    + this.nomeCaixinha + "'. Objetivo: Atingir o valor final de R$" + this.valorObjetivo);

            this.valorPoupado += valor;
        }
    }

    public void exibirProgresso() {
        double percentual = this.valorPoupado / this.valorObjetivo * (double)100.0F;
        String var10001 = this.nomeCaixinha;
        System.out.println("[Método exibirProgresso] Progresso da caixinha '" + var10001 + "': R$" + this.valorPoupado + " de R$" + this.valorObjetivo + " (" + String.format("%.2f", percentual) + "% concluído).");
    }
}
