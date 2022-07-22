package com.company.details;

public class Engine {

    private String company;
    private int power;

    public String getCompany(){
        return this.company;
    }

    public int getPower(){
        return this.power;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void setPower(int power){
        if (power <= 0){
            System.out.println("Вы ввели некорректную мощность двигателя");
        }
        else {
            this.power = power;
        }
    }

    public Engine(String company, int power){

        this.company = company;

        if (power <= 0){
            System.out.println("Вы ввели некорректную мощность двигателя");
        }
        else {
            this.power = power;
        }

    }

    public String toString(){
        return String.format("двигателем комании : '%s', с мощьностью %d", this.company, this.power);
    }

}
