//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente miguel = new Cliente();
        miguel.setNome("Miguell");

        Conta cc = new ContaCorrente(miguel);
        Conta poupanca = new ContaPoupanca(miguel);


        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}