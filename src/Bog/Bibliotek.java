package Bog;

import java.util.ArrayList;

public class Bibliotek {

    private ArrayList<Bog> bibliotek_list = new ArrayList<>();

    Bibliotek() {
        run();
    }

    public void run() {
        bibliotek_list.add(new Bog(1234, "IT", 1986));
        bibliotek_list.add(new Bog(0420, "Stalker", 2014));
        bibliotek_list.add(new Bog(6969, "IDK", 1969));

    }

    public void check(Bog bog) {
        for (Bog b: bibliotek_list) {
            if (b.getISBN() == bog.getISBN()) {
                System.out.println("Bogen er i systemet");
            } else {
                System.out.println("Bogen er ikke i systemet");
            }

        }
    }

}
