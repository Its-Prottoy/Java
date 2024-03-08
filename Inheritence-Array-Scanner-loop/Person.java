import java.lang.*;

public class Person
{
	private String name;
	private String id;
	private int age;
	
	public Person()
	{
		System.out.println("Empty Cons. for Person");
	}
	
	public Person(String name,String id,int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		
		System.out.println("Pera Cons. for Person");
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public void setid(String id)
	{
		this.id=id;
	}
	
	public void setage(int age)
	{
		this.age=age;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getid()
	{
		return id;
	}
	
	public int getage()
	{
		return age;
	}
	
	public void details()
	{
		System.out.println("Name: "+name+"\n"+"Id: "+id+"\n"+"Age: "+age);
	}
}