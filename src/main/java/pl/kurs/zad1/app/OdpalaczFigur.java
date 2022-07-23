package pl.kurs.zad1.app;

import pl.kurs.zad1.exceptions.UjemneLiczbyWyjatek;
import pl.kurs.zad1.services.Figura;

public class OdpalaczFigur {
    public static void main(String[] args) throws UjemneLiczbyWyjatek {

        Figura[] figury = {Figura.stworzKwadrat(10), Figura.stworzKolo(20), Figura.stworzProstokat(10, 20), Figura.stworzKwadrat(15)};
        for (Figura f : figury) {
            System.out.println(f);
        }

        System.out.println();

        wyswietlFigureZNajObwodem(figury);
        wyswietlFigureZNajPolem(figury);
        System.out.println();

        for (Figura f : figury) {
            if (f.equals(Figura.stworzProstokat(10, 20))) {
                System.out.println("tu powinno wejsc");
            } else {
                System.out.println("Obiekt jest inny ");
            }
        }
        System.out.println("Podczas tworzenia obiektu wystepuje wyraz 'new' i to oznacza ze jest tworzonyn nowy obiekt");
        System.out.println("figury[3].hashCode() = " + figury[3].hashCode());
        System.out.println("Figura.stworzProstokat(10,20).hashCode() = " + Figura.stworzProstokat(10, 20).hashCode());
        System.out.println("Figura.stworzProstokat(10,20).hashCode() = " + Figura.stworzProstokat(10, 20).hashCode());

    }

    static void wyswietlFigureZNajObwodem(Figura[] figury) {
        if (figury == null) {
            System.out.println("Nie przekazano zadnej figury");
        } else {
            int i = 0;
            int j = 0;
            while (i < figury.length || j < figury.length) {

                if (i == figury.length || j == figury.length) {
                    break;
                } else {
                    if (figury[i].calculatePerimeter() >= figury[j].calculatePerimeter()) {
                        j++;
                    } else {
                        i++;
                    }
                }
            }
            System.out.println("Figura z najwiekszym obwodem to : " + figury[i].toString() + " i wynosi: " + figury[i].calculatePerimeter());
        }
    }

    static void wyswietlFigureZNajPolem(Figura[] figury) {
        if (figury == null) {
            System.out.println("Nie przekazano zadnej figury");
        } else {
            int i = 0;
            int j = 0;
            while (i < figury.length || j < figury.length) {

                if (i == figury.length || j == figury.length) {
                    break;
                } else {
                    if (figury[i].calculateArea() >= figury[j].calculateArea()) {
                        j++;
                    } else {
                        i++;
                    }
                }
            }
            System.out.println("Figura z najwiekszym polem to : " + figury[i].toString() + " i wynosi: " + figury[i].calculateArea());
        }
    }
}

