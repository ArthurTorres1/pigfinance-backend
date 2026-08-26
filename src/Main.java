//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Categoria catAlimentacao = new Categoria("Alimentação", "#FFA500");
        Categoria catMoradia = new Categoria("Moradia", "#008000");

        Transacao t1 = new Transacao("Mercado Extra", 1240.00, "DESPESA", catAlimentacao);
        Transacao t2 = new Transacao("Aluguel", 1050.00, "DESPESA", catMoradia);

        System.out.println("Gasto com: " + t1.getCategoria().getNome());
        }
}