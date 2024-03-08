import java.lang.*;
public class Person{
	private String name;
	private int id;
	private double salary;
	public Person (){}; 
	public Person (String nm,int id,double sly){
		name=nm;
		this.id=id;
		salary=sly;
	}
	public void setnm(String nm){
		name=nm;
	}
	public void setid(int id){
		this.id=id;
	}
	public void setsly(double sly){
		salary=sly;
	}
	public String getnm(){
		return name;
	}
	public int getid(){
		return id;
	}
	public double getsly(){
		return salary;
	}
	public void viewdetails(){
		System.out.println("Name: "+name+"\n"+"ID: "+id+"\n"+"Salary: "+salary);
	}
}