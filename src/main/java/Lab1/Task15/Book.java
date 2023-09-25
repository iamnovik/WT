package Lab1.Task15;


public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String title, int isbn,String author,int price) {
        this.title = title;
        this.isbn = isbn;
        edition = 2;
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
        return "Title: "+title+"\nAuthor: "+author+"\nEdition: "+edition+" price: "+price +" isbn: "+isbn +"\n";
    }

    @Override
    public int compareTo(Book o) {
        return this.isbn - o.isbn;
    }
}
