package model;

public class Person {

    private String name;
    private String surname;
    private int cpf;

    public Person(String name, String surname, int cpf) {
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
