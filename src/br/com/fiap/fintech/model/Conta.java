package br.com.fiap.fintech.model;

public class Conta {
    private int idConta;
    private String tipoConta;
    private double saldo;
    private int numeroAgencia;

    public Conta() {
    }

    public Conta(int idConta, String tipoConta, double saldo, int numeroAgencia) {
        this.idConta = idConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.numeroAgencia = numeroAgencia;
    }

    public int getIdConta() {
        return this.idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("[Método depositar] Executado na conta ID: " + this.idConta + ". Objetivo: Somar o valor de R$" + valor + " ao saldo. Novo Saldo: R$" + this.saldo);
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("[Método sacar] Executado na conta ID: " + this.idConta + ". Objetivo: Validar e debitar o valor de R$" + valor + " do saldo. Novo Saldo: R$" + this.saldo);
        } else {
            System.out.println("[Método sacar] Tentativa de saque de R$" + valor + " falhou na conta ID: " + this.idConta + " por saldo insuficiente (Saldo atual: R$" + this.saldo + ").");
        }

    }
}
