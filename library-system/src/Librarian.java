import java.util.ArrayList;

public class Librarian extends Person{
    private String librarianId;

    public Librarian(String name, String librarianId){
        super(name,librarianId);
    }

    public String getName(){
        return name;
    }

    public String getLibrarianId(){
        return librarianId;
    }

    public String getRole(){
        return "Librarian";
    }

    public String addBookToCatalog(Book book,ArrayList<Book> catalog){
        catalog.add(book);
        return "Book successfully added to catalog";
    }
}