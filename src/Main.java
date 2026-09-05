import br.com.fiap.fintech.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(1, "Corrente", 1500.00, 123);
        Categoria categoria = new Categoria("Alimentação", "#FF3000");

        Transacao t1 = new Transacao(1, 500.00, TipoOperacao.SAIDA, "PIX", conta, categoria);
        Caixinha cx = new Caixinha(1, "Carro", 30000.00, 10000.00);
        cx.pouparNaCaixinha(conta, 500000);

        // Polimorfismo no Saque
        System.out.println("--- Testando Saque em Conta Corrente ---");
        conta.sacar(100.00);

        // Instanciando TransacaoPix (Herança de Transacao)
        TransacaoPix pix = new TransacaoPix(101, 102.50, TipoOperacao.SAIDA, conta, categoria, "usuario@email.com");

        System.out.println("\n--- Testando Polimorfismo no Comprovante ---");
        // Invoca o metodo sobrescrito da TransacaoPix
        pix.exibirComprovante();

        System.out.println("Transação de: " + t1.getValor() + " na Categoria de: " + t1.getCategoria().getNome());
    }
}