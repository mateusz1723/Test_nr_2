package pl.kurs.zad1.models;

import pl.kurs.zad1.services.Figura;

public class Prostokat extends Figura {

    private int a;
    private int b;
    private int licznik;


    public Prostokat(int a, int b , int licznikFigur) {
        this.a = a;
        this.b = b;
        licznik = licznikFigur;
    }

    @Override
    public String toString() {
        return "Figura nr " + licznik + ": Prostokat o bokach " + a + "x" + b + ".";
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
