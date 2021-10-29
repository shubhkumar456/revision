package revision;

public class Book_by_Constructor {

    String name;
    String writer;
    int pages;
    double price;

    public Book_by_Constructor(String name, String writer, int pages, double price) {
        this.name = name;
        this.writer = writer;
        this.pages = pages;
        this.price = price;
    }

    public static void main(String[] args) {
        Book_by_Constructor obj = new Book_by_Constructor("2States", "Chetan Bhagat", 3000, 359.0);

        System.out.println(obj.name);
        System.out.println(obj.writer);
        System.out.println(obj.pages);
        System.out.println(obj.price);


        Book_by_Constructor obj1 = new Book_by_Constructor("Arithmetic", "Rakesh Yadav", 1500, 350.0);

        System.out.println(obj1.name);
        System.out.println(obj1.writer);
        System.out.println(obj1.pages);
        System.out.println(obj1.price);

        Book_by_Constructor obj2 = new Book_by_Constructor("Advance Maths","Rakesh Yadav",1000,250.0);

        System.out.println(obj2.name);
        System.out.println(obj2.writer);
        System.out.println(obj2.pages);
        System.out.println(obj2.price);
    }
}