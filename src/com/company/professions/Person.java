package com.company.professions;

public class Person {

    protected String inicials;
    protected int age;

    public String getInicials(){
        return this.inicials;
    }

    public int getAge(){
        return this.age;
    }

    public void setInicials(String inicials){
        this.inicials = inicials;
    }

    public void setAge(int age){
        if (age < 18){
            System.out.println("Вы ввели некорректный возраст");
        }
        else {
            this.age = age;
        }
    }

    public Person(String inicials, int age){

        this.inicials = inicials;

        if (age < 18){
            System.out.println("Вы ввели некорректный возраст");
        }
        else {
            this.age = age;
        }

    }

    public String toString(){
        return String.format("%s возрастом %d годов", this.inicials, this.age);
    }

}
