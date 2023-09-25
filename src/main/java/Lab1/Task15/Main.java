package Lab1.Task15;

import java.util.Arrays;

public class Main {
    public static void sort(Book[] books){
        int n = books.length;
        for(int j = 1; j < n; j++){
            Book key = books[j];
            int i = j - 1;
            while ((i >= 0) && (books[i].compareTo(key) > 0)){
                books[i + 1] = books[i];
                i--;
            };
            books[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        //Book[] books = {new Book("A",5),new Book("B",4),new Book("C",5),new Book("D",6),new Book("E",2)};
        //sort(books);
        //System.out.println(Arrays.toString(books));
    }
}
