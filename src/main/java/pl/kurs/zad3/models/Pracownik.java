package pl.kurs.zad3.models;

import pl.kurs.zad3.models.Osoba;

public class Pracownik extends Osoba {

    private String stanowisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, String pesel, String miasto, String stanowisko, double pensja) {
        super(imie, nazwisko, pesel, miasto);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    @Override
    public double dochod() {
        return pensja;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", stanowisko='" + stanowisko + '\'' +
                ", pensja=" + pensja +
                '}';
    }
}
