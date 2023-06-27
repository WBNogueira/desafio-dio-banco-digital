package org.banco;

public class Main {
    public static void main(String[] args) {

        Cliente wagner = new Cliente();
        wagner.setNome("Wagner");

        Conta cc = new ContaCorrente(wagner);
        Conta cp = new ContaPoupanca(wagner);

        cc.depositar(12547.36);
        cc.transferir(6000.00, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}