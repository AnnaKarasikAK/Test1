public class Book {
    // describe a book, create all the variables we need
    // name, author, id, price in USD, availability
    // using conversion rate, calculate EUR price of book
    // print all the books details including prices

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J.K.Rowling", 1, 10.5, false);
        book1.createNewBook("Anna Karenina", "L. Tolstoy", 2, 20, true);
    }
    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable){
        double rate = 1.1;

        double priceInEuro = priceInUSD * rate;

        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Author name is: " + bookName);
        System.out.println("Book price is: " + priceInUSD + " USD / " + priceInEuro + " EUR");
        System.out.println("Book is available: " + isAvailable);
    }



}
