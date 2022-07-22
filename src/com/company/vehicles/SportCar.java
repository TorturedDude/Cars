package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{

    private double maxSpeed;

    public double getMaxSpeed(){
        return this.maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed){
        if (maxSpeed <= 0){
            System.out.println("Вы ввели некорректную предельную скорость");
        }
        else {
            this.maxSpeed = maxSpeed;
        }
    }

    public SportCar(String carClass, double weight, String brand, Engine engine, Driver driver, double maxSpeed) {
        super(carClass, weight, brand, engine, driver);

        if (maxSpeed <= 0){
            System.out.println("Вы ввели некорректную предельную скорость");
        }
        else {
            this.maxSpeed = maxSpeed;
        }

    }

    public String toString(){
        return String.format("Автомобиль класса %s такого брэнда, как %s с весом %f, c предельной скоростью %f ,с " + this.engine + ", с водителем " + this.driver, this.carClass, this.brand, this.weight, this.maxSpeed);
    }

}
