import java.util.Scanner;

public class Kvadrat {

    private int parameter;
    private String text = " ";
    private Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
     new Kvadrat().run();
    }


    public void run() {
        System.out.println("Select size:");
        parameter = input.nextInt();
        System.out.println("Press enter to continue");
        input.nextLine();
        System.out.println("Select output:");
        text += input.nextLine();
        for (int i = 0; i < parameter; i++) {
            System.out.println(text.repeat(parameter) );
        }
    }
}
