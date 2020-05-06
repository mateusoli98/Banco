package model;

public class CurrentAccount extends Person {

    private double balance;

    public CurrentAccount(Person person) {
        super(person.getName(), person.getSurname(), person.getCpf());
        balance = 0;
    }

    public CurrentAccount() {
        super();
        balance = 0;
    }

    public double gateBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }
}
