package Main;

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
            msg = "Deposito realizado com sucesso. Novo saldo: " + getSaldo();
        } else {
            msg = "Somente valores acima de 0";
        }
        return msg;
    }

    public String sacar(double valor) {
        String msg = "Erro na operção tente novamente!";
        if (getSaldo() > valor) {
            setSaldo(getSaldo() - valor);
            msg = "Saque realizado com sucesso! Novo saldo: " + getSaldo();
        } else {
            msg = "Você não possui saldo o suficiente para realizar a operacao. Saldo: " + getSaldo();
        }

        return msg;
    }

    public String extrato() {
        return "\n\nNome completo: " + getNome() + " " + getSobrenome()
                + "\nCPF: " + getCpf()
                + "\nSaldo disponível: " + getSaldo();
    }

    public String transferir(double valor, ContaCorrente c) {
        String msg = "Erro na operção tente novamente!";
        if (getSaldo() > valor) {
            c.setSaldo(c.getSaldo() + valor);
            setSaldo(getSaldo() - valor);
            msg = "Transferencia realizada com sucesso! Novo saldo: " + getSaldo();
        } else {
            msg = "Não possui saldo suficiente para realizar a operação. Saldo atual: " + getSaldo();
        }
        return msg;
    }
}
