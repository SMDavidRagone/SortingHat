import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
public class DrawingPanel extends JPanel implements ActionListener
{
	Color myColor;
	int width, height;
	int xLoc, yLoc;
	Color drawColor;
	Color drawColor1;
	Color drawColor2;
	JFrame myFrame;
	Timer t;
	
	int eyeH = 0; //this is our moving variable eye height
	int eyeH2 = 0;
	int maxEye = 0;
	int mouth = 0;
	boolean  opening = true; //this shows if we are opening or closing...
	
	public DrawingPanel(Color mc, int w, int h, JFrame f)
	{
		myColor = mc;
		width = w;
		height = h;
		myFrame = f;
		
		this.setSize(width, height);
		this.setBackground(myColor);
		
		int rValue = 255 - myColor.getRed();
		int gValue = 255 - myColor.getGreen();
		int bValue = 255 - myColor.getBlue();
		int rValue1 = 0 + myColor.getRed();
		int gValue1 = 255 - myColor.getGreen();
		int bValue1 = 0 + myColor.getBlue();
		int rValue2 = 255 - myColor.getRed();
		int gValue2 = 0 + myColor.getGreen();
		int bValue2 = 255 - myColor.getBlue();
		drawColor = new Color(rValue, gValue, bValue);
		drawColor1 = new Color(rValue1, gValue1, bValue1);
		drawColor2 = new Color(rValue2, gValue2, bValue2);
		//timer set up
		t = new Timer(60, this);
		t.start();
				
		
	}
	
	//behaviors methods
	
	//override parents paint
	public void paintComponent(Graphics g) 
	{
		Color yellowColor = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
		Color drawColor3 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
		g.setColor(drawColor3);
		g.fillRect(0, 0, width, height);
		g.setColor(yellowColor);
		g.fillOval(0, 0, width, height);
		g.setColor(Color.BLACK);
		g.drawArc(0, 0, width, height, 0, 360);
		
		drawSmiley(g);
		

	

	}
	
	public void drawSmiley(Graphics g)
	{
		maxEye = 30;
		g.setColor(drawColor2);
		g.fillArc(width*3/11, height*2/3 - 10, width/2, mouth, 0, -180);
		g.setColor(drawColor);
		g.fillOval(width/6, height/3, 30, eyeH);
		g.setColor(drawColor1);
		g.fillOval(width*3/4, height/3, 30, eyeH2);
		
		int strokeW = (int)(width * 0.08);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(strokeW));
		g2.setColor(Color.BLACK);
		g2.drawArc(0, 0, width, height, 0, 360);
		
		
		
		
	/*	int smallD = 0;
		if(width < height)
		{
			smallD = width;
		} else {
			smallD = height;
		}
		
		smallD = Math.min(width, height);
		*/
	}
	private int count = 0;
	private int count2 = 0;
	int rc = (int)(Math.random() * 20 + 30);
	int rc2 = (int)(Math.random() * 20 + 30);
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		if (count2 < rc2)
		{
			eyeH2++;
			mouth++;
		}
		else if (count2 < rc2*2)
		{
			eyeH2--;
			mouth--;
		} else {
			count2 = 0;
		}
		count2++;
		
		if (count < rc)
		{
			eyeH++;
		} else if (count < rc*2)
		{ 
			eyeH--;
		}else {
			count = 0;
		}
		count++;
		repaint();
		
	}
}
