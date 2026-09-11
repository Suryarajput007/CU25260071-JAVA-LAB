class Library {
    int booksAvailable;

    static String libraryName = "City Library";

    Library(int booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    void issueBook() {
        int available = booksAvailable;

        if (available > 0) {
            available--;
            booksAvailable = available;

            System.out.println("Book issued successfully.");
            System.out.println("Books available: "
                    + booksAvailable);
        } else {
            System.out.println("No books available.");
        }
    }

    void returnBook() {
        int available = booksAvailable;

        available++;
        booksAvailable = available;

        System.out.println("Book returned successfully.");
        System.out.println("Books available: "
                + booksAvailable);
    }

    public static void main(String[] args) {

        Library library = new Library(5);

        System.out.println("Library: " + libraryName);
        System.out.println("Initial books: "
                + library.booksAvailable);

        library.issueBook();
        library.issueBook();
        library.returnBook();
    }
}