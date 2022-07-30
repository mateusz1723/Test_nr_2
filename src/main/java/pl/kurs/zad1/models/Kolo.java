package pl.kurs.zad1.models;

import pl.kurs.zad1.services.Figura;

public class Kolo extends Figura {

    private int r;
    private int licznik;

    public Kolo(int r , int licznikFigur) {
        this.r = r;
        licznik = licznikFigur;

    }

    @Override
    public String toString() {
        return "Figura nr " + licznik + ": Kolo o promieniu " + r + ".";
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

