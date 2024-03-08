import java.lang.*;
import java.util.*;
public class Start{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		
		
		System.out.println("Enter your Name");
		String name=s1.nextLine();
		
		System.out.println("Enter your ID");
		int id=s1.nextInt();
		
		System.out.println("Enter your Salary");
		double salary=s1.nextDouble();
		
		System.out.println("------------------------");
		
		
		Scanner s2=new Scanner(System.in);
		
		
		System.out.println("Enter your Name");
		String name2=s2.nextLine();
		
		System.out.println("Enter your ID");
		int id2=s2.nextInt();
		
		System.out.println("Enter your Salary");
		double salary2=s2.nextDouble();
		
		System.out.println("------------------------");
		
		Person p1=new Person(name,id,salary);
		p1.viewdetails();
		System.out.println("------------------------");
		
		Person p2=new Person(name2,id2,salary2);
		p2.viewdetails();
		System.out.println("------------------------");
		
		Person p3=new Person();
		p3.viewdetails();
		System.out.println("------------------------");
		
	}
}
		