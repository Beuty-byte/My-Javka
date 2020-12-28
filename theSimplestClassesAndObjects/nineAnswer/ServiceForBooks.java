package theSimplestClassesAndObjects.nineAnswer;

public class ServiceForBooks {
    private Book[] books;

    public ServiceForBooks(Book[] books) {
        this.books = books;
    }

    public void listAuthorBooks(String authorName){
        for (int i = 0; i < books.length; i++) {
            if(books[i].getAuthors().equals(authorName)){
                System.out.println(books[i].getBookName());
            }
        }
    }

    public void listPublishHouse(String publishHouse){
        for (int i = 0; i < books.length; i++) {
            if(books[i].getPublishingHouse().equals(publishHouse)){
                System.out.println(books[i].getBookName());
            }
        }
    }

    public void listBookAfterYearOfPublishing(int year){
        for (int i = 0; i < books.length; i++) {
            if(books[i].getYearOfPublishing() > year){
                System.out.println(books[i].getBookName());
            }
        }
    }

}
