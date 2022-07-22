package com.company.professions;

public class Driver extends Person{

    private double experience;

    public double getExperience(){
        return this.experience;
    }

    public void setExperience(double experience){
        if (experience < 0){
            System.out.println("Вы ввели некорректный стаж вождения");
        }
        else {
            this.experience = experience;
        }
    }

    public Driver(String inicials, int age, double experience) {
        super(inicials, age);

        if (experience < 0){
            System.out.println("Вы ввели некорректный стаж вождения");
        }
        else {
            this.experience = experience;
        }

    }

    @Override
    public String toString(){
        return String.format("%s возрастом %d годов имеет стаж %f", this.inicials, this.age, this.experience);
    }

}
