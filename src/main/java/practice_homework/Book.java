package practice_homework;

public class Book {
    String title;
    String author;
    public Book(String someTitle, String someAuthor){
        this.title = someTitle;
        this.author = someAuthor;
    }
    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }
    void setTitle(String newTitle){
        this.title = newTitle;
    }
    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    void printInfo(){
        System.out.println("Книга - " + getTitle() + ", Автор - " + getAuthor());
    }

}
