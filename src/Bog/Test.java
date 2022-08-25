package Bog;

import Bog.Bog;

public class Test {

    public static void main(String[] args) {
        Bibliotek bibliotek_test = new Bibliotek();
        bibliotek_test.check(new Bog(1234, "IT", 1986));
    }
}
