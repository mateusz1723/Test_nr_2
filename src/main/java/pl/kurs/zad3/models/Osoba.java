package pl.kurs.zad3.models;

import java.util.Scanner;

public abstract class Osoba {

    private String imie;
    private String nazwisko;
    private String pesel;
    private String miasto;

    public Osoba(String imie, String nazwisko, String pesel, String miasto) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.miasto = miasto;
    }


    public int getPlec() {
        String sb1 = pesel;
        String sb2 = sb1.substring(9, 10);
        int sb3 = Integer.parseInt(sb2);
        if(sb3 % 2 == 0) {
            return 1;
        } else {
            return 2;
        }
    }


    public abstract double dochod();

    @Override
    public String toString() {
        return getClass().getSimpleName() + '{' +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
