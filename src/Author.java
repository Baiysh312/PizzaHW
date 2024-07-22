public class Author implements AddBookable{
    private String name;
    private int year;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    Book [] books= new Book[10];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author(String name, int year) {
        this.name = name;
        this.year = year;
    }
private int count=0;
    @Override
    public void addBook(Book book) {
        books[count]=book;
        count++;
    }

}
