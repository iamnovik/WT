package Lab1.Task14;


public class Book implements Cloneable{
    private String title;
    private String author;
    private int price;
    private static int edition;
    public Book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
        edition = 5;
    }
    public Book(){

    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Book book = new Book();/*(Book)super.clone();*/
        book.author = this.author;
        book.price = this.price;
        book.title = this.title;
        return book;
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
        if (!(obj instanceof Lab1.Task14.Book book)){
            return false;
        }
        if (obj.hashCode() != hashCode()){
            return false;
        }
        return book.author.equals(author) && book.title.equals(title) && book.price == price;

    }

    @Override
    public String toString() {
        return "Title: "+title+"\nAuthor: "+author+"\nEdition: "+edition+" price: "+price;
    }
    
}

