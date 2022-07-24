package pl.kurs.zad3.app;

import pl.kurs.zad3.models.Osoba;
import pl.kurs.zad3.models.Pracownik;
import pl.kurs.zad3.models.Student;

import java.util.Arrays;

public class OdpalaczOsob {
    public static void main(String[] args) {

        Osoba pawel = new Student("Pawel", "Nowak", "98041505139", "Krakow", "EiT", 1700);
        Osoba ewa = new Student("Ewa", "Dab", "98052314167", "Krakow", "EiT", 1400);
        Osoba adam = new Student("Adam", "Brzoza", "98092014157", "Krakow", "EiT", 1900);
        Osoba piotr = new Student("Piotr", "Waga", "98051319255", "Krakow", "EiT", 2000);
        Osoba bartek = new Student("Bartek", "Kowalski", "98124529474", "Krakow", "EiT", 1300);
        Osoba szymon = new Student("Szymon", "Kowal", "98083013679", "Krakow", "EiT", 1500);

        Osoba marta = new Pracownik("Marta", "Brama", "94041553188", "Lodz", "Sekretatka", 3900);
        Osoba ania = new Pracownik("Ania", "Kowalczyk", "93053585126", "Krakow", "Sekretarka", 4200);
        Osoba edyta = new Pracownik("Adyta", "Nowakowska", "85012132188", "Krakow", "Sprzataczka", 3200);
        Osoba sebastian = new Pracownik("Sebastian", "Dryga", "88051332139", "Krakow", "Konserwator", 4500);
        Osoba monika = new Pracownik("Monika", "Dryga", "98031309148", "Krakow", "Konserwator", 4500);


        Osoba[] osoby = {pawel, ewa, adam, pawel, piotr, bartek, sebastian, szymon, marta, ania, edyta, monika};

        wyswietlOsobeZNajDochodem(osoby);
        System.out.println();
        wyswietlLiczbeKobietWTablicy(osoby);



    }

    static void wyswietlOsobeZNajDochodem(Osoba[] osoby) {
        if (osoby == null) {
            System.out.println("Nie przekazano zadnej osoby");
        } else {
            int i = 0;
            int j = 0;
            while (i < osoby.length || j < osoby.length) {

                if (i == osoby.length || j == osoby.length) {
                    break;
                } else {
                    if (osoby[i].dochod() >= osoby[j].dochod()) {
                        j++;
                    } else {
                        i++;
                    }
                }
            }
            System.out.println("Osoba z najwiekszym dochodem to " + osoby[i]);
        }
    }

    static void wyswietlLiczbeKobietWTablicy(Osoba[] osoby) {
        if (osoby == null) {
            System.out.println("Nie przekazano osoby");
        } else {
            int licznik = 0;
            for (Osoba osoba : osoby) {
                if (osoba.getPlec() == 1) {
                    licznik++;
                }
            }
            System.out.println("W tablicy sa: " + licznik + " kobiety");
        }
    }

}
