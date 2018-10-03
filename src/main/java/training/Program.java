package training;

public class Program {

    public static void main(String[] args) {
        TrytoPrint trytoPrint = new Journal("23523");
        trytoPrint.print();


        TrytoPrint trytoPrint1 = new Book("Java. Complete Referense.", "H. Shildt");
        trytoPrint1.print();
    }
}

class Book implements TrytoPrint {

    private String name;

    private String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf(name, author);
    }
}

class Journal implements TrytoPrint {
    private String name;

    Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}