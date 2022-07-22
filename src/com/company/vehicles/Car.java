package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;


public class Car {

    protected String carClass;
    protected double weight;
    protected String brand;
    protected Engine engine;
    protected Driver driver;

    public String getCarClass(){
        return this.carClass;
    }

    public double getWeight(){
        return this.weight;
    }

    public String getBrand(){
        return this.brand;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Driver getDriver(){
        return this.driver;
    }

    public void setCarClass(String carClass){
        this.carClass = carClass;
    }

    public void setWeight(double weight){

        if (weight <= 0){
            System.out.println("Вы ввели некорректный вес автомобиля");
        }
        else {
            this.weight = weight;
        }

    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public void  setDriver(Driver driver){
        this.driver = driver;
    }

    public Car(String carClass, double weight, String brand, Engine engine, Driver driver){
        this.carClass = carClass;
        this.brand = brand;
        this.engine = engine;
        this.driver = driver;

        if (weight <= 0){
            System.out.println("Вы ввели некорректный вес автомобиля");
        }
        else {
            this.weight = weight;
        }

    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnLeft(){
        System.out.println("Поворачиваем налево");
    }

    public void turnRight(){
        System.out.println("Поворачиваем направо");
    }

    public String toString(){
        return String.format("Автомобиль класса %s такого брэнда, как %s с весом %f, с " + this.engine + ", с водителем " + this.driver, this.carClass, this.brand, this.weight);
    }

}
