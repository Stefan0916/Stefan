package 上机练习;

public class Book {
private String name;
private int pages;
public String Getname()
{
return name;	
}
public void Setname(String name) {
	this.name=name;
}
public int Getpages()
{
return pages;	
}
public void Setpages(int pages) {
	this.pages=pages;
}
public void display()
{
System.out.println("书名："+name+ 
		"页数："+pages);	
}
}
