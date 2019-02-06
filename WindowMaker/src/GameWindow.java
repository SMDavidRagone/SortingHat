import java.awt.Color;
import javax.swing.JFrame;

public class GameWindow
{
	//Data Fields
	JFrame myFrame;
	Color myColor;
	int width, height;
	int xLoc, yLoc;
	int wNumber;
	DrawingPanel myPanel;
	//Constructor
	public GameWindow(Color c, int w, int h, int x, int y, int n)
	{
		wNumber = n;
		myFrame = new JFrame("Window " + wNumber);
		myColor = c;
		myFrame.getContentPane().setBackground(myColor);
		width = w;
		height = h;
		myFrame.setSize(width, height);
		xLoc = x;
		yLoc = y;
		myFrame.setLocation(xLoc, yLoc);
		
		myFrame.setVisible(true);
		
		// make a drawing panel
		myPanel = new DrawingPanel(myColor, width, height - 20, myFrame);
		myFrame.add(myPanel);
		
		
	}
	//Class Behavior -- set up with Methods.....
	public void setVisibility(boolean v) 
	{
		myFrame.setVisible(v);
	}

}
