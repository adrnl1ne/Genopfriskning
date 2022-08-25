import java.util.ArrayList;

public class Arraylist_ex {
    private ArrayList<String> list = new ArrayList<>();
    private String text = "string";
    public static void main(String[] args) {

        new Arraylist_ex().run();

    }

    public boolean doesArraylistContainString(ArrayList<String> list, String text) {
        if (!list.contains(text)) {
            list.add(text);
            System.out.println("String has not been found");
            return false;
        } else {
            System.out.println("String has been found");
            return true;
        }
    }

    public void run(){
        doesArraylistContainString(list, text);
        doesArraylistContainString(list, text);
    }
}
