package Model;
import javax.swing.JOptionPane;

public class Movimentacao extends Pessoa {

    public Movimentacao(String nome, String sobrenome, double saldoConta) {
        super(nome, sobrenome, saldoConta);
    }

    public void sacar(double valor) {
        if (erroValor(valor)) 
            setSaldoConta(getSaldoConta() - valor);
    }

    public void depositar(double valor) {
        if (erroValor(valor)) 
            setSaldoConta(getSaldoConta() + valor);
    }
    public boolean erroValor(double valor){
        if (valor < 1) 
            JOptionPane.showMessageDialog(null, "Somentes valores positivos");
        else return true;
        return false;
    }
}