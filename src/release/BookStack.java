package release;

 class BookStackADT
{
    private BookStack[] booksArray;
    private int top;
    public BookStackADT(int totalBooks)
    {
        booksArray=new BookStack[totalBooks];
        top=-1;
    }
    public void push(BookStack book)
    {
        if(top!=booksArray.length-1)
        {
            top++;
            booksArray[top]=book;
        }
    }
    public void display()
    {
        for(BookStack book:booksArray)
        {
            if(book !=null)
            {
                System.out.println(book.getBookName());
            }
        }
    }
    public static void main(String[] args) {
        BookStackADT stack = new BookStackADT(10);
        BookStack book = new BookStack();
    }
}
 class BookStack {
    private String bookName;
    private  String bookAuthor;
    private int bookEdition;
    private double bookPrice;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(int bookEdition) {
        this.bookEdition = bookEdition;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return ("(" + bookName + "," + bookAuthor + "," + "," + bookEdition + "," +bookPrice + ")");
    }
}

