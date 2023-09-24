public class ContaInvestimento extends Conta {
    
    public ContaInvestimento(int numConta, String nomeTitular) {
        super(numConta, nomeTitular);

    }   

    public void sacar(double valor) {
		if (valor < 0) {
			throw new Error("Valor deve ser positivo");
		}
		if (super.saldo < saldo) {
			throw new Error("Saldo insuficiente");
		}

		super.saldo = super.saldo - (valor + 2);
	}
}
