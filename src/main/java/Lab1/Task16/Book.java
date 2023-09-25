package Lab1.Task16;

import Lab1.Task12;

import java.util.Comparator;

public class Book{
    private String title;
    private String author;
    private int price;
    private static int edition;
    public static Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);
    public static Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
    public static Comparator<Book> priceComparator = Comparator.comparing(Book::getPrice);
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }
    public Book(String title, int price, String author) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (title == null ? 0 : title.hashCode());
        result = 31 * result + (author == null ? 0 : author.hashCode());
        result = 31 * result + price;
        result = 31 * result + edition;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book book)){
            return false;
        }
        if (obj.hashCode() != hashCode()){
            return false;
        }
        return book.author.equals(author) && book.title.equals(title) && book.price == price;

    }

    @Override
    public String toString() {
        return "Title: "+title+"\nAuthor: "+author+"\nEdition: "+edition+" price: "+price + "\n";
    }
}
