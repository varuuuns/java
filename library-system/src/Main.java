// Every Java program needs one class with a "main" method — that's the
// entry point where the JVM starts running your code.

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // "new Book(...)" calls the constructor and gives us an object back.
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", "978-0547928227");
        Book book2 = new Book("Dune", "Frank Herbert", "978-0441172719");

        // println calls toString() on the object automatically.
        // System.out.println(book1);
        // System.out.println(book2);

        // System.out.println("---");

        book1.borrow();          // borrow it once — should succeed
        book1.borrow();          // try again — should say already borrowed

        // System.out.println(book1);

        // System.out.println("---");

        book1.returnBook();
        // System.out.println(book1);


        // members
        Member member1 = new Member("Varun","001");
        Member member2 = new Member("kas","002");

        // System.out.println(member1);
        // System.out.println(member2);

        List<Book> books= new ArrayList<>();
        List<Member> members = new ArrayList<>();

        books.add(book1);
        books.add(book2);

        members.add(member1);
        members.add(member2);

        // System.out.println("printing books using for each loop");
        // for (Book b : books) {
        //     System.out.println(b);
        //     System.out.println("type is "+ b.getClass().getName());
        //     System.out.println("_______________");
        // }
        
        // System.out.println("printing members using for each loop");
        // for (Member m: members){
        //     System.out.println(m);
        //     System.out.println("type is "+m.getClass().getName());
        //     System.out.println("_______________");
        // }

        // System.out.println("searching for Dune...");
        // Book found = findBookByTitle(books, "Dune");
        // System.out.println(found);

        // System.out.println("searching for a book that doesn't exist...");
        // Book notFound = findBookByTitle(books, "Nonexistent Book");
        // System.out.println(notFound);

        List<Librarian> librarians= new ArrayList<>();
        Librarian librarian1 = new Librarian("petta","23");
        Librarian librarian2 = new Librarian("vinay","26");

        List<Person> people = new ArrayList<>();
        people.add(member1);
        people.add(member2);
        people.add(librarian1);
        people.add(librarian2);

        for(Person p:people){
            System.out.println("person's role is: "+p.getRole());
        }
    }

    // Sibling method to main() — must be "static" because main() is static
    // and calls it without creating a Main object first.
    public static Book findBookByTitle(List<Book> books, String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }

        return null;
    }

    
}
