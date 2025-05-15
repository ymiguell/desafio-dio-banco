public interface IConta {
     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor, Conta contaDestino);
     void imprimirExtrato();
     void pix(double valor, Conta contaDestino);
}
