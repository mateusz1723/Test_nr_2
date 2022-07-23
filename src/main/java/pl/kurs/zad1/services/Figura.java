package pl.kurs.zad1.services;

import pl.kurs.zad1.exceptions.UjemneLiczbyWyjatek;
import pl.kurs.zad1.models.Kolo;
import pl.kurs.zad1.models.Kwadrat;
import pl.kurs.zad1.models.Prostokat;


public abstract class Figura extends LicznikFigur{


    public static Figura stworzKwadrat(int a) throws UjemneLiczbyWyjatek {
        if (a < 0) {
            throw new UjemneLiczbyWyjatek("Nie moze byc ujmena liczba");
        } else {
            return new Kwadrat(a);
        }
    }

    public static Figura stworzKolo(int r) throws UjemneLiczbyWyjatek {
        if (r < 0) {
            throw new UjemneLiczbyWyjatek("Nie moze byc ujemna liczba");
        } else {
            return new Kolo(r);
        }
    }

    public static Figura stworzProstokat(int a, int b) throws UjemneLiczbyWyjatek {
        if (a < 0 || b < 0) {
            throw new UjemneLiczbyWyjatek("Nie moze byc ujemna liczba");
        } else {
            return new Prostokat(a, b);
        }
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();


}
