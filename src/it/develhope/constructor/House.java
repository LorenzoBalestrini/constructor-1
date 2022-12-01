package it.develhope.constructor;

public class House {

    public String address;
    public int numberOfFloors;

    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("A new house has been created!");
    }
}
