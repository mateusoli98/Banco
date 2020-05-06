package model;

public class Person {

    private String name;
    private String surname;
    private String cpf;

    public Person(String name, String surname, String cpf) {
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
    }

    public Person() {
        this.name = "";
        this.surname = "";
        this.cpf = "";
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
