package it.develhope.constructor;

public class House {

    private String address;
    private int numberOfFloors;

    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("A new house has been created!");
        System.out.println("address: " + address + " - " + "Floors number: " + numberOfFloors);
    }
}
