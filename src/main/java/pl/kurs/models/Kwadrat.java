package pl.kurs.models;

import pl.kurs.services.Figura;

public class Kwadrat extends Figura {

    private int a;


    public Kwadrat(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Kwadrat o boku " + a + ".";
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }
}
