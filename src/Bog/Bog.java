package Bog;

public class Bog {
    private int ISBN;
    private String title;
    private int publishYear;

    Bog(int ISBN, String title, int publishYear) {
    this.ISBN = ISBN;
    this.title = title;
    this.publishYear = publishYear;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
