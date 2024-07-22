public class Book {
    private int kod;
    private String name;
    private Author author;
    private int year;

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(int kod, String name, Author author, int year) {
        this.kod = kod;
        this.name = name;
        this.author = author;
        this.year = year;
    }
}
