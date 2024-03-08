import java.lang.*;

public class Student extends Person
{
	
	private float cgpa;
	
	public Student()
	{
		System.out.println("Empty cons for sudent");
	}
	
	public Student(String name,String id,int age,float cgpa)
	{
		super(name,id,age);
		this.cgpa=cgpa;
		System.out.println("Pera cons for student");
		
	}
	
	public void setcgpa(float cgpa)
	{
		this.cgpa=cgpa;
	}
	
	public float getcgpa()
	{
		return cgpa;
	}
	
	public void details()
	{
		super.details();
		System.out.println("Cgpa: "+cgpa);
	}
	
}