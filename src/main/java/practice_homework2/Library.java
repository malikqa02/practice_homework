package practice_homework2;

public class Library {
    private String bookTitle = "название";
    protected String author = "автор";
    int year = 2010;
    public String category = "учеба";
    //getters
    String getBookTitle(){
        return bookTitle;
    }
    String getAuthor(){
        return author;
    }
    int getYear(){
        return year;
    }
    String getCategory(){
        return category;
    }
    //setters
    void setBookTitle(String newBookTitle){
        this.bookTitle = newBookTitle;
    }
    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    void setYear(int newYear){
        this.year = newYear;
    }
    void setCategory(String newCategory){
        this.category = newCategory;
    }

}
