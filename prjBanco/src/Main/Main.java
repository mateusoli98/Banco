package Main;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String args[]) {

        ContaCorrente cc1 = new ContaCorrente("Mateus", "Oliveira", 123),
                      cc2 = new ContaCorrente("João", "de Souza", 456);
        
        //DEPOSITO NAS CONTAS 1 E 2
        System.out.println(cc1.depositar(10000));
        System.out.println(cc2.depositar(5000));
        
        //SAQUE NAS CONTAS 1 E 2
        System.out.println(cc1.sacar(500));
        System.out.println(cc2.sacar(1000));

        //TRANSFERENCIA DA CONTA 1 PARA 2
        System.out.println(cc1.transferir(200,cc2));
        
        //TRANSFERENCIA DA CONTA 2 PARA 1
        System.out.println(cc2.transferir(20,cc1));
        
        //EXTRATO DAS CONTAS 1 E 2
        System.out.println(cc1.extrato());
        System.out.println(cc2.extrato());
        
        //EXCESSOES
        // 1 - DEPOSITAR UM VALOR INVALIDO
        System.out.println(cc1.depositar(0));
        System.out.println(cc2.depositar(-10));
        
        // 2 - SACAR QUANDO NAO HOUVER SALDO SUFICIENTE
        System.out.println(cc1.sacar(11000));
        System.out.println(cc2.sacar(6000));
        
        // 3 - TRANSFERENCIA DE UMA QUANTIA MAIOR DO QUE TEM
        System.out.println(cc1.transferir(12500,cc2));
        System.out.println(cc2.transferir(7000,cc1));
        
        
        
    }
}
