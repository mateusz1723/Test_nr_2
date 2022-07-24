package pl.kurs.zad2;

public class Odpalacz {
    public static void main(String[] args) {


        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
            sb.append(" ");
        }
        String numbers1 = sb.toString();
        long stop1 = System.nanoTime();
        System.out.println(numbers1);



        long start2 = System.nanoTime();
        String numbers2 = "";
        for (int i = 0; i < 1000; i++) {
            numbers2 = numbers2 + i + " ";
        }
        long stop2 = System.nanoTime();

        System.out.println(numbers2);


        long r1 = stop1 - start1;
        long r2 = stop2 - start2;

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("ratio: " + ((double) r2 / r1));
        System.out.println("Jak widać stringBuilder jest szybszy ");
        System.out.println("String jest nie modyfikowalny i to znaczy ze za kazdym razem jest tworzony nowy obiekt przy konkatenacji");
        System.out.println("I potrzebuje wiecej pamieci niz StringBuilder ktory jest modyfikowalny");
    }
}
