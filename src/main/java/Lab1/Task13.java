package Lab1;

public class Task13 extends Task12{
    private String language;
    private int level;

    public Task13(String title, String author, int price,String language,int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode() {
        return (super.hashCode()*31 + (language == null ? 0 : language.hashCode())) * 31 + level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) return false;
        if (!super.equals(obj)) return false;
        Task13 pbook = (Task13)obj;
        return pbook.language.equals(language) && pbook.level == level;

    }

    @Override
    public String toString() {
        return "Programming boook \n" + super.toString() + "\nLanguage: " + language + " level: " + level;
    }
}
