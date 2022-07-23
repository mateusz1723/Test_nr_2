package pl.kurs.models;

import pl.kurs.services.Figura;

public class Prostokat extends Figura {

    private int a;
    private int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Prostokat o bokach " + a + "x" + b + ".";
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
