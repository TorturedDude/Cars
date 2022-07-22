package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{

    private int carrying;

    public double getCarrying(){
        return this.carrying;
    }

    public void setCarrying(int carrying){
        if (carrying <= 0){
            System.out.println("Вы ввели некорректную грузоподъёмность");
        }
        else {
            this.carrying = carrying;
        }
    }

    public Lorry(String carClass, double weight, String brand, Engine engine, Driver driver, int carrying) {
        super(carClass, weight, brand, engine, driver);

        if (carrying <= 0){
            System.out.println("Вы ввели некорректную грузоподъёмность");
        }
        else {
            this.carrying = carrying;
        }

    }

    @Override
    public String toString(){
        return String.format("Автомобиль класса %s такого брэнда, как %s с весом %f, c грузоподъёмностью %d ,с " + this.engine + ", с водителем " + this.driver, this.carClass, this.brand, this.weight, this.carrying);
    }
}
