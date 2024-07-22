public class Main {
    public static void main(String[] args) {

        Author author= new Author("A.S",1876);
        Author author1= new Author("B.S",1887);
        Book book = new Book(11,"syngan kylych",author,1879);
        Book book1 = new Book(22,"asdd",author1,1789);
        Book book2 = new Book(33,"erte kelgen turnalar",author,1976);
        Book book3 = new Book(11,"akbaranyn koz jashy",author1,1912);

        Biblioteka biblioteka = new Biblioteka();

        biblioteka.addBook(book);
        biblioteka.addBook(book1);
        biblioteka.addBook(book2);
        biblioteka.addBook(book3);

        biblioteka.authorBook(author);

        biblioteka.kollBook(biblioteka.getHudBooks11());
    }
}
