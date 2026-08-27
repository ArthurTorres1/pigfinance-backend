package br.com.fiap.fintech.model;

public class Cliente {
    private int idCliente;
    private String nome;
    private String cpf;
    private String email;

    public Cliente() {
    }

    public Cliente(int idCliente, String nome, String cpf, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirPerfil() {
        System.out.println("[Método exibirPerfil] Exibindo informações cadastrais do cliente " + this.nome + " (CPF: " + this.cpf + ", Email: " + this.email + ").");
    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
        System.out.println("[Método atualizarEmail] Email do cliente ID: " + this.idCliente + " atualizado com sucesso para: " + novoEmail);
    }
}
