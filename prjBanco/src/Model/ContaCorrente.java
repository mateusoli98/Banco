package Model;

public class ContaCorrente extends Pessoa {

    private double saldo;

    public ContaCorrente(String nome, String sobrenome, int cpf) {
        super(nome, sobrenome, cpf);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String depositar(double valor) {
        String msg = "Erro na operção tente novamente!";
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            msg = "Deposito realizado com sucesso";
        } else {
            msg = "Somente valores acima de 0";
        }
        return msg;
    }

    public String sacar(double valor) {
        String msg = "Erro na operção tente novamente!";
        if (getSaldo() > valor) {
            setSaldo(getSaldo() - valor);
            msg = "Saque realizado com sucesso!";
        } else {
            msg = "Somente valores acima de 0";
        }

        return msg;
    }

    public String extrato(double valor) {
        return "";
    }

    public String transferir(double valor) {
        return "";
    }
}
