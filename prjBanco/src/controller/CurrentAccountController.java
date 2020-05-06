package controller;

import model.CurrentAccount;
import model.Person;

public class CurrentAccountController {

    private CurrentAccount currentAccount;

    public CurrentAccountController(Person person) {
        this.currentAccount = new CurrentAccount(person);
    }

    public CurrentAccount getCurrentAccount() {
        return this.currentAccount;
    }

    public String deposit(double value) {
        String statusMessage = "Erro na operção tente novamente!";
        if (value > 0) {
            currentAccount.setBalance(value);
            statusMessage = "Deposito realizado com sucesso. Novo saldo: " + currentAccount.gateBalance();
        } else {
            statusMessage = "Somente valores acima de 0";
        }
        return statusMessage;
    }

    public String withdrawMoney(double value) {
        String statusMessage = "Erro na operção tente novamente!";
        if (currentAccount.gateBalance() > value) {
            currentAccount.setBalance(-value);
            statusMessage = "Saque realizado com sucesso! Novo saldo: " + currentAccount.gateBalance();
        } else {
            statusMessage = "Você não possui saldo o suficiente para realizar a operacao. Saldo: " + currentAccount.gateBalance();
        }

        return statusMessage;
    }

    public String extract() {
        return "\n\nNome completo: " + currentAccount.getName() + " " + currentAccount.getSurname()
                + "\nCPF: " + currentAccount.getCpf()
                + "\nSaldo disponível: " + currentAccount.gateBalance();
    }

    public String transfer(double value, CurrentAccount currentAccountRecipient) {
        String statusMessage = "Erro na operção tente novamente!";
        if (currentAccount.gateBalance() > value) {
            currentAccountRecipient.setBalance(value);
            currentAccount.setBalance(-value);
            statusMessage = "Transferencia realizada com sucesso! Novo saldo: " + currentAccount.gateBalance();
        } else {
            statusMessage = "Não possui saldo suficiente para realizar a operação. Saldo atual: " + currentAccount.gateBalance();
        }
        return statusMessage;
    }
}
