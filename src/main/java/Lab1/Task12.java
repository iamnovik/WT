package Lab1;

public class Task12 {
    private String title;
    private String author;
    private int price;
    private static int edition;

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
        if (!(obj instanceof Task12 book)){
            return false;
        }
        if (obj.hashCode() != hashCode()){
            return false;
        }
        return book.author.equals(author) && book.title.equals(title) && book.price == price;

    }
    public Task12(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
        edition = 5;

    }
    @Override
    public String toString() {
        return "Title: "+title+"\nAuthor: "+author+"\nEdition: "+edition+" price: "+price;
    }
}
