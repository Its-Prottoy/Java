import java.lang.*;
public class Person{
	private String name;
	private int age;
	private String id;
	public Person (){}; 
	public Person (String nm,int age,String id){
		name=nm;
		this.id=id;
		this.age=age;
	}
	public void setnm(String nm){
		name=nm;
	}
	public void setid(String id){
		this.id=id;
	}
	public void setsly(int age){
		this.age=age;
	}
	public String getnm(){
		return name;
	}
	public String getid(){
		return id;
	}
	public int getage(){
		return age;
	}
	public void viewdetails(){
		System.out.println("Name: "+name+"\n"+"ID: "+id+"\n"+"Age: "+age);
	}
}