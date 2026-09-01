package br.com.fiap.fintech.model;

public enum TipoOperacao {
    ENTRADA {
        @Override
        public boolean processar(Conta conta, double valor) {
            conta.depositar(valor);
            return true;
        }
    },
    SAIDA {
        @Override
        public boolean processar(Conta conta, double valor) {
            return conta.sacar(valor);
        }
    };

    // Metodo abstrato que cada constante acima é obrigada a implementar
    public abstract boolean processar(Conta conta, double valor);
}
