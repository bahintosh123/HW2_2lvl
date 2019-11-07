package com.company;

public class Burger extends Food implements Printable {
    private String size;


    public Burger(String size) {
        this.size = size;
        setName( "Бургер" );

    }

    public String getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println(getName()+size);

    }
}
