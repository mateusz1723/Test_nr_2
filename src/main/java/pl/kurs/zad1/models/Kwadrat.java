package pl.kurs.zad1.models;

import pl.kurs.zad1.services.Figura;


public class Kwadrat extends Figura {

    private int a;
    private int licznik;


    public Kwadrat(int a , int licznikFigur) {
        this.a = a;
        licznik = licznikFigur;
    }


    @Override
    public String toString() {
        return "Figura nr " + licznik +  ": Kwadrat o boku " + a + ".";
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
