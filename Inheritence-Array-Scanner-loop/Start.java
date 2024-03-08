import java.lang.*;
import java.util.*;
public class Start
{
	public static void main(String[] args){
	
	Scanner a1=new Scanner(System.in);
	System.out.println("Enter person count:");
	int size=a1.nextInt();
	System.out.println("Enter Student count:");
	int size1=a1.nextInt();
	
	Person arr[]=new Person [size];
	Student arr1[]=new Student[size1];
	
	for(int i=0;i<size;i++){
		System.out.println("Person "+(i+1)+" Details: \n");
		
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=a.nextLine();
		
		Scanner a2=new Scanner(System.in);
		System.out.println("Enter ID: ");
		String id=a2.nextLine();
		
		System.out.println("Enter Age: ");
		int age=a2.nextInt();
		
		if(arr[i]==null){
			arr[i]=new Person(name,id,age);
		}
	}
	for(int i=0;i<size1;i++){
		System.out.println("Student "+(i+1)+" Details: \n");
		
		Scanner a3=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=a3.nextLine();
		
		Scanner a4=new Scanner(System.in);
		System.out.println("Enter ID: ");
		String id=a4.nextLine();
		
		System.out.println("Enter Age: ");
		int age=a4.nextInt();
		
		System.out.println("Enter CGPA: ");
		float cgpa=a4.nextFloat();
		
		if(arr1[i]==null){
			arr1[i]=new Student(name,id,age,cgpa);
		}
	}
		
	
	System.out.println("All Person Details: ");
	for(int i=0;i<size;i++){
		System.out.println("Person "+(i+1)+" :");
		arr[i].details();
	}
	System.out.println("All Student Details: ");
	for(int i=0;i<size1;i++){
		System.out.println("Student "+(i+1)+" :");
		arr1[i].details();
	}
	}
}
		
	//Scanner a1=new Scanner(System.in);
	//System.out.println("How many Person?");
	//int size=a1.nextInt();
	
	//String size=a1.nextLine();
	//float size=a1.nextFloat();
	//douuble size=a1.nextDouble();
	//short size=a1.nextShort();
	//char size=a1.nextChar();
	

	//1s3t approch Person arr3[]=new int[3];
	//2nd approch Person arr4[]=new int[size];
	//3rd approch Person arr5[]=new int[]{3,2,1,4};