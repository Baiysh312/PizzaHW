public class Biblioteka implements AddBookable{
    private Book[] hudBooks11= new Book[5];
    private Book[] uirBooks22= new Book[5];
    private Book[] texLitBooks33= new Book[5];

    public Book[] getHudBooks11() {
        return hudBooks11;
    }

    public void setHudBooks11(Book[] hudBooks11) {
        this.hudBooks11 = hudBooks11;
    }

    public Book[] getUirBooks22() {
        return uirBooks22;
    }

    public void setUirBooks22(Book[] uirBooks22) {
        this.uirBooks22 = uirBooks22;
    }

    public Book[] getTexLitBooks33() {
        return texLitBooks33;
    }

    public void setTexLitBooks33(Book[] texLitBooks33) {
        this.texLitBooks33 = texLitBooks33;
    }

    private int hudCount=0;
    private int uirCount=0;
    private int texCount=0;
    @Override
    public void addBook(Book book) {
        if (book.getKod()==11){
            hudBooks11[hudCount]=book;
            hudCount++;
        } else if (book.getKod()==22) {
            uirBooks22[uirCount]=book;
            uirCount++;
        } else if (book.getKod()==33) {
            texLitBooks33[texCount]=book;
            texCount++;
        }
    }
    public void kollBook(Book[]books){
        int koll=0;
        for (Book book:books) {
            if(book!=null){
                koll++;
            }
        }
        System.out.println(koll+" kolichestvo book v dannogo otdela");
    }
    public void authorBook(Author author){
        for (Book book: hudBooks11) {
            if (book!=null){
                if (book.getAuthor().getName()==author.getName()){
                    System.out.println(book.getName());
                }
            }
        }
        for (Book book: uirBooks22) {
            if (book!=null){
                if (book.getAuthor().getName()==author.getName()){
                    System.out.println(book.getName());
                }
            }
        }
        for (Book book: texLitBooks33) {
            if (book!=null){
                if (book.getAuthor().getName()==author.getName()){
                    System.out.println(book.getName());
                }
            }
        }
    }
}
