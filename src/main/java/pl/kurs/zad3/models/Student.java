package pl.kurs.zad3.models;

import pl.kurs.zad3.models.Osoba;

public class Student extends Osoba {

    private String grupa;
    private double stypendium;

    public Student(String imie, String nazwisko, String pesel, String miasto, String grupa, double stypendium) {
        super(imie, nazwisko, pesel, miasto);
        this.grupa = grupa;
        this.stypendium = stypendium;
    }


    @Override
    public double dochod() {
        return stypendium;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", grupa='" + grupa + '\'' +
                ", stypendium=" + stypendium +
                '}';
    }
}
