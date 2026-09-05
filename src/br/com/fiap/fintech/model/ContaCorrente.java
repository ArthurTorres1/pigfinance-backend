package br.com.fiap.fintech.model;

public class ContaCorrente extends Conta {
    private double taxaManutencao;

    // Construtor
    public ContaCorrente(int idConta, double saldo, int numeroAgencia, double taxaManutencao) {
        // Chama o construtor da classe Conta (superclasse)
        super(idConta, "Corrente", saldo, numeroAgencia);
        this.taxaManutencao = taxaManutencao;
    }

    //Polimorfismo: Sobrescrita do metodo sacar incluindo a taxa da conta corrente
    @Override
    public boolean sacar(double valor) {
        double valorTotal = valor + taxaManutencao;
        System.out.println("Processando saque em Conta Corrente (Taxa: R$ " + taxaManutencao + ")...");
        return super.sacar(valorTotal);
    }

    // Encapsulamento da taxa
    public double getTaxaManutencao() { return taxaManutencao; }
    public void setTaxaManutencao(double taxaManutencao) { this.taxaManutencao = taxaManutencao; }
}