import java.lang.*;
public class Football extends Game{
	private String stadium;
	
	public Football(){
		System.out.println("Empty Constractor");
	}
	public Football(String name,String id,double score,String stadium){
		super(name,id,score);
		this.stadium=stadium;
		System.out.println("Pera cons for Students");
	}
	public void setstadium(String stadium){
		this.stadium=stadium;
	}
	public String getstadium(){
		return stadium;
	}
	public void details(){
		super.details();
		System.out.println("Stadium Name: "+stadium);
	}
}
	