public class aggregation {

    public static void main(String[] args){

        Book book1 = new Book("the fellow of the ring", 423);
        Book book2 = new Book("the two towers", 352);
        Book book3 = new Book("the return of the king", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("Icardi Library", 1905, books);

        library.displayInfo();





    }
}
