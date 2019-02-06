import java.awt.Color;

public class WindowRunner {

	public static void main (String[] args) {
		//TODO Auto-generated method stub
		
		for(int i = 0; i < 10; i++)
		{
			GameWindow w = new GameWindow(
				new Color((int)(Math.random()* 255), (int)(Math.random()* 255), (int)(Math.random()* 255)), 
				(int)(Math.random() * 200) + 100,  //width
				(int)(Math.random() * 200) + 100, // height
				(int)(Math.random() * 1000), //screen x
				(int)(Math.random() * 1000), //screen y
				i + 1);
			w.setVisibility(true);
		}
		
	}
	
}
