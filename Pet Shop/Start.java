import java.lang.*;

//import Classes.*;
import Frames.*;

public class Start {
	public static void main(String[]args) {
		Splash splash = new Splash();
		splash.setVisible(true);

		try{
			Thread.sleep(2500);
			splash.dispose();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		PetShop ps = new PetShop();
		ps.setVisible(true);
	}
}