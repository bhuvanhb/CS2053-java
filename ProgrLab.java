class Book
{
public String bname;
public String author;
public String series;
public String publisher;
public Book(String bname, String author, String series, String publisher)
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
System.out.println("and Publisher "+publisher);
}
}
public class ProgrLab
{
public static void main(String args[])
{
Book std=new Book("RemioJuliet", "william", "A","Bhuvan");
std.display();
}
}