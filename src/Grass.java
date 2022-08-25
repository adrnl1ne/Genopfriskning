import java.util.Scanner;

public class Grass {

    private double currentHeight;
    private double maxHeight;

    private double days;

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new Grass().run();
    }

    public void run() {
        System.out.println("Insert current heigh:");
        currentHeight = input.nextDouble();
        System.out.println("Insert max height:");
        maxHeight = input.nextDouble();
        System.out.println("Choose if you want your grass cut when max height is reached or before:");
        System.out.println("""
                1. Before
                2. After
                """);
        if (input.nextInt() != 2) {
            cutBeforeMax();
        } else {
            cutAfterMax();
        }

    }


    public void cutBeforeMax() {
        days = ((maxHeight - currentHeight) / 0.8);
        int daysButInt = (int) days;
        System.out.println("It will be " + (daysButInt-1) + "days, before the grass needs to be cut");
    }

public void cutAfterMax() {
    days = ((maxHeight - currentHeight) / 0.8);
    int daysButInt = (int) days;
    System.out.println("It will be " + daysButInt + "days, before the grass needs to be cut");
}

}
