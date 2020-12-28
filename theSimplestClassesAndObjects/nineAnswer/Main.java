package theSimplestClassesAndObjects.nineAnswer;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Great book","Pushkin","Moskou Hous",1576,766,34.98,"soft");
        Book book2 = new Book(2,"War and world","Tolstoy","Piter Hous",1676,866,25.18,"solid");
        Book book3 = new Book(3,"Kolobok","Duma","Moskou Hous",1776,966,54.12,"soft");
        Book book4 = new Book(4,"Narodnye Skazki","Pushkin","Piter Hous",1876,1766,34.34,"solid");
        Book book5 = new Book(5,"Nenarodnye Skazki","Ne Pushkin","Moskou Hous",1452,1666,14.98,"soft");
        Book book6 = new Book(6,"Mu Mu","Pushkin","Piter Hous",1811,1566,34.34,"solid");
        Book book7 = new Book(7,"1814","Pushkin","Moskou Hous",1879,1466,34.31,"soft");
        Book book8 = new Book(8,"Master and Margarita","Bulgakov","Piter Hous",1876,1366,54.32,"solid");
        Book book9 = new Book(9,"Dead soul","Gogol","Moskou Hous",1996,996,43.12,"soft");
        Book book10 = new Book(10,"Dog heart","Bulgakov","Moskou Hous",1146,888,43.43,"solid");
        Book book11 = new Book(11,"Idiot","Dostoevskiy","Piter Hous",1686,761,11.98,"soft");

        Book[] books = {book1,book2,book3,book4,book5,book6,book7,book8,book9,book10,book11};

        ServiceForBooks serviceForBooks = new ServiceForBooks(books);

        serviceForBooks.listAuthorBooks("Pushkin");
        System.out.println();

        serviceForBooks.listPublishHouse("Piter Hous");
        System.out.println();

        serviceForBooks.listBookAfterYearOfPublishing(1800);
    }
}
