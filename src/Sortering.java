import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {
    private ArrayList<String> list = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private int counter = 5;

    public static void main(String[] args) {
        new Sortering().run();
    }

    public void run() {
        while (counter>0) {
            System.out.println("Insert word:");
            list.add(input.nextLine());
            counter = counter - 1;
        }

        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }

}
