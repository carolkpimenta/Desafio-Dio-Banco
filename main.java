
public class main {

	public static void main(String[] args) {
		Cliente Caroline = new Cliente();
		Caroline.setNome("Caroline");
		
		Conta cc = new ContaCorrente(Caroline);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(Caroline);
		
		cc.transferir(100, poupanca);
				
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
