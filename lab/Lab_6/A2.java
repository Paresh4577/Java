import java.util.*;

class Book{
	private String author_name;

	 public Book(String author_name) {
        this.author_name = author_name;
    }

    public String displayPublication() {
        System.out.println("Publication by " + author_name);
        return author_name;
    }

    public String GetName(){
        return this.author_name;
    }

}

class Book_pubication extends Book{
  private String title;

   public Book_pubication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }
    public String GetTitle(){
        return this.title;
    }

    public String displayPublication() {
        System.out.println("Publication by " + GetName() + " And The Title Of The Book Is " + GetTitle());
        return title;
    }


}

class Paper_publication extends Book{
  private String title;
   public Paper_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }
    public String GetTitle(){
        return this.title;
    }   

    public String displayPublication() {
        System.out.println("Publication by " + GetName() + " And The Title Of The Book Is " + GetTitle());
        return title;
    }
}

class Main{
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	

    Book b = new Book_pubication("Rohit","Java");
    Book b1 = new Paper_publication("Paresh","Python");

  	Book_pubication bp = new Book_pubication("Paresh","hello");
  	

  	Paper_publication pp = new Paper_publication("Raj","hiii");
  	
  	
    System.out.println(b.displayPublication()+b1.displayPublication());

  }
}
