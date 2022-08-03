
public class Main {

	public static void main(String[] args) {
		Cliente jefferson = new Cliente();
		jefferson.setNome("jefferson");
		
		Conta cc = new ContaCorrente(jefferson);
		Conta poupanca = new ContaPoupanca(jefferson);

		cc.depositar(1000);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
