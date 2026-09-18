// Every Java program needs one class with a "main" method — that's the
// entry point where the JVM starts running your code.
public class Main {

    public static void main(String[] args) {
        // "new Book(...)" calls the constructor and gives us an object back.
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", "978-0547928227");
        Book book2 = new Book("Dune", "Frank Herbert", "978-0441172719");

        // println calls toString() on the object automatically.
        System.out.println(book1);
        System.out.println(book2);

        System.out.println("---");

        book1.borrow();          // borrow it once — should succeed
        book1.borrow();          // try again — should say already borrowed

        System.out.println(book1);

        System.out.println("---");

        book1.returnBook();
        System.out.println(book1);


        // members
        Member member1 = new Member("Varun","001");
        Member member2 = new Member("kas","002");

        System.out.println(member1);
        System.out.println(member2);
    }
}
