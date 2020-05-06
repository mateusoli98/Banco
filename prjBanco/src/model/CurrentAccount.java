package model;

public class CurrentAccount extends Person {

    private double balance;

    public CurrentAccount(String name, String surname, int cpf) {
        super(name, surname, cpf);
    }

    public double gateBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String deposit(double value) {
        String statusMessage = "Erro na operção tente novamente!";
        if (value > 0) {
            setBalance(gateBalance() + value);
            statusMessage = "Deposito realizado com sucesso. Novo saldo: " + gateBalance();
        } else {
            statusMessage = "Somente valores acima de 0";
        }
        return statusMessage;
    }

    public String withdrawMoney(double value) {
        String statusMessage = "Erro na operção tente novamente!";
        if (gateBalance() > value) {
            setBalance(gateBalance() - value);
            statusMessage = "Saque realizado com sucesso! Novo saldo: " + gateBalance();
        } else {
            statusMessage = "Você não possui saldo o suficiente para realizar a operacao. Saldo: " + gateBalance();
        }

        return statusMessage;
    }

    public String extract() {
        return "\n\nNome completo: " + getName() + " " + getSurname()
                + "\nCPF: " + getCpf()
                + "\nSaldo disponível: " + gateBalance();
    }

    public String transfer(double valor, CurrentAccount c) {
        String statusMessage = "Erro na operção tente novamente!";
        if (gateBalance() > valor) {
            c.setBalance(c.gateBalance() + valor);
            setBalance(gateBalance() - valor);
            statusMessage = "Transferencia realizada com sucesso! Novo saldo: " + gateBalance();
        } else {
            statusMessage = "Não possui saldo suficiente para realizar a operação. Saldo atual: " + gateBalance();
        }
        return statusMessage;
    }
}
