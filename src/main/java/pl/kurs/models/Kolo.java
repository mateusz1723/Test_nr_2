package pl.kurs.models;

import pl.kurs.services.Figura;

public class Kolo extends Figura {

    private int r;

    public Kolo(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Kolo o promieniu " + r + ".";
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }
}

