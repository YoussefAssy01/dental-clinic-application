package com.example.dentalclinicspringboot.model;

public class Employee {
    private int id;
    private String name;
    private char type;

    public Employee(){
    }
    public Employee(int id,String name, char type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
