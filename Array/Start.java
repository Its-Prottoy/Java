import java.lang.*;
import java.util.*;
public class Start{
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		String nm,id;
		int size,age;
		System.out.println("Enter person count: ");
		size=s1.nextInt();
		
		Person per[]=new person[size];
		
		for(int i=0;i<size;i++){
			System.out.println("person"+(i+1)+"Imformation Setting");
			
		}
		
		
		Person p1=new Person(name,id,salary);
		p1.viewdetails();
		Person p2=new Person(name2,id2,salary2);
		p2.viewdetails();
		Person p3=new Person();
		p3.viewdetails();
	}
}
		