import java.lang.*;
public class Start
{
	public static void main(String[] args)
	{
		System.out.println("_________________________");
		System.out.println("1st Player details");
		
		Game g1=new Game("Prottoy","23-53005-3",210.97);
		g1.details();
		
		System.out.println("_________________________");
		System.out.println(" 2nd Player details");
		
		Game g2=new Game("Siam","23-53004-3",350.89);
		g2.details();
		
		System.out.println("_________________________");
		System.out.println(" 3rd Player details");
		
		Football f1=new Football("Erona","23-53003-3",8,"Mirpur Stadium");
		f1.details();
		System.out.println("_________________________");
	}
}
	