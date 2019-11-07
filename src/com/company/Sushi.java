package com.company;

public class Sushi extends Food implements Printable {
    private int amount;

    public Sushi(int amount) {
        this.amount = amount;
        setName( "FreshBox" );
    }

    public int getAmount() {
        return amount;

    }

    @Override
    public void print() {
        System.out.println(getName()+amount);

    }
}
