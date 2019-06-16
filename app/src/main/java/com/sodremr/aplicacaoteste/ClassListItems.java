package com.sodremr.aplicacaoteste;

public class ClassListItems
{

    public String cpf; //Image URL
    public String name; //Name

    public ClassListItems(String name, String cpf)
    {
        this.cpf = cpf;
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }
}
