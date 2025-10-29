
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Cliente peter = new Cliente();
		peter.setNome("Peter");
		
		Conta cc = new ContaCorrente(venilton);
		Conta ccp = new ContaCorrente(peter);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		ccp.imprimirExtrato();
	}

}
