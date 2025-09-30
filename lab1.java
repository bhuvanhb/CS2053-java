class Book
{
public String bname;
public String author;
public String series;
public int publisher;
public Book(String bname, String author, String series, int publisher)
{
this.bname=bname;
this.author=author;
this.series=series;
this.publisher=publisher;
}
public void display()
{
System.out.println("Book name is " + bname);
System.out.println("With AUTHOR "+author);
System.out.println("In Series "+series);
System.out.println("and Publisher "+ series);
}
}
public class Lab1
{
public static void main(String args[])
{
Book std=new Book("RemioJuliet", "william", "4",Bhuvan);
std.display();
}
}