package com.company;

public class Steak extends Food implements Printable {
    public Steak(double weight) {
        this.weight = weight;
        setName( "PepperSteak" );
    }

    public double getWeight() {
        return weight;
    }

    private double weight;

    @Override
    public void print() {
        System.out.println(getName()+weight);

    }
}
