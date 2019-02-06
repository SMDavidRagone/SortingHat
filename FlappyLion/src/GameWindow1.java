import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameWindow1 extends JPanel implements ActionListener, KeyListener {
	//data
	public static final int SPACE_KEY = 32;
	public static final int L_GRAVITY = 4; //in pixels per frame
	public static final int POINT_REWARD = 5;
	public static final int MAX_LIVES = 3;
	
	public static final long serialVersionUID = 1;
	
	private int windowW, windowH;
	private Color bColor = new Color(107, 255, 247);
	private Color b2Color = new Color(10, 128, 0);
	private JFrame myFrame = null;
//	private ScreenObj test1;
	//private Cloud c1Test; //make place for object
	private Timer t;
	private Cloud[ ] cList;
	private Lion alexLion;
	private Vach Vachris;
	private Eggs Egg;
	private DrWarren Dw;
	
	//New Fields for 2019
	private int score = 0; //initially zero
	private int lives = 3; //initially three
	private boolean lionHit = false;
	
	private ControlPanel myScorePanel;
	
	private JLabel gameOverLabel;
	private Font gameOverFont = new Font("Arial", Font.BOLD, 100);
	
	
	
	//constructor(s)
	public GameWindow1(int w, int h) 
	{
		windowW = w;
		windowH = h;
		
		this.setSize(windowW, windowH);
		this.setBackground(bColor);
		
	}
	public GameWindow1(int w, int h, JFrame f) 
	{
		this(w, h);
		myFrame = f;
		
		//test1 = new ScreenObj( (int)(windowW/2), (int)(windowH/2), 200, 200);
		//initialize Cloud...
	
	
	//set up timer
	makeAllClouds((int)(Math.random()*5 +5));
	makeObstacles();
	//let's activate the keyListenner
	addKeyListener(this);
	setFocusable(true);
	//set up for game over
	gameOverLabel = new JLabel("GAME OVER");
	//gameOverLabel.setLocation(27, 32);
	gameOverLabel.setFont(gameOverFont);
	gameOverLabel.setForeground(Color.RED);
	gameOverLabel.setVisible(false);
	this.add(gameOverLabel);
	
	
	t = new Timer(40, this);
	t.start();
	}
	
	
	
	public void makeAllClouds (int howMany)
	{
		//allocate memory...
		int topDown = 150;  //how far down from the top of screen
		cList = new Cloud[howMany];
		//makeClouds
		for(int i = 0; i < howMany; i++)
		{
			cList[i] = new Cloud (
					windowW + (int)(Math.random() * 200), //CloudX
					topDown + (int)(Math.random() * 100) - 50, //CloudY
					"cloud",
					".png",
					(int)(Math.random() * 150) + 70, 
					this,
					1);
		}
	}
	
	public void makeAlexLion()
	{
		int theMaxW = (int)(windowW * 0.2);
		int frameNum = 16;
		alexLion = new Lion(
				(int)(windowW/2), //okay
				windowH - (int)(theMaxW/2), 
				"LionPics/frame_", 
				".png", 
				theMaxW, 
				this, 
				frameNum);
		//alexLion.ShowGameBB(true);
		alexLion.setGameBBXExtra((int)(alexLion.getBW() * 0.35));
		alexLion.setGameBBYExtra((int)(alexLion.getBH() * 0.20));
		alexLion.setGameBBW((int)(alexLion.getBW() * 0.45)); 
		alexLion.setGameBBH((int)(alexLion.getBH() * 0.60));
		
		
	}
	
	
	public void makeObstacles()
	{
		makeAlexLion();
		int theMaxW = (int)(windowW * 0.1);
		int frameNum = 3;
		int vacX = (int)(windowW); //- (int)(theMaxW * 0.05);
		int vacY = windowH - (int)(theMaxW * 1.5);
		Vachris = new Vach(
				vacX, //okay
				vacY, 
				"VachrisPics/Vach_", 
				".png", 
				theMaxW, 
				this, 
				frameNum);
		Vachris.MoveSpeed(25);
		//Vachris.ShowGameBB(true);
		Vachris.setGameBBXExtra((int)(Vachris.getBW() * 0.50));
		Vachris.setGameBBYExtra((int)(Vachris.getBH() * 0.05));
		Vachris.setGameBBW((int)(Vachris.getBW() * 0.20)); 
		Vachris.setGameBBH((int)(Vachris.getBH() * 0.95));
		
		
		Egg = new Eggs(
				(int)(windowW) - theMaxW, //okay
				windowH - (int)(theMaxW * 4), 
				"Eggs", 
				".png", 
				theMaxW, 
				this, 
				1);
		Egg.MoveSpeed(7);
		Egg.ShowGameBB(true);
		Egg.setGameBBXExtra((int)(Egg.getBW() * 0.22));
		Egg.setGameBBYExtra((int)(Egg.getBH() * 0.18));
		Egg.setGameBBW((int)(Egg.getBW() * 0.60)); 
		Egg.setGameBBH((int)(Egg.getBH() * 0.55));
		
		Dw = new DrWarren(
				(int)(windowW) - theMaxW, //okay
				windowH - (int)(theMaxW * 2), 
				"DrWarrenPics/DW_", 
				".png", 
				theMaxW, 
				this, 
				frameNum);
		Dw.MoveSpeed(25);
		Dw.ShowGameBB(true);
		Dw.setGameBBXExtra((int)(Dw.getBW() * 0.50));
		Dw.setGameBBYExtra((int)(Dw.getBH() * 0.05));
		Dw.setGameBBW((int)(Dw.getBW() * 0.20)); 
		Dw.setGameBBH((int)(Dw.getBH() * 0.95));
		
		
		
		}
	
	
//Behavior Methods
	public void paintComponent(Graphics g)
		{
			windowW = myFrame.getWidth();
			windowH = myFrame.getHeight();
			g.setColor(bColor);
			g.fillRect(0, 0, windowW, windowH);
			g.setColor(b2Color);
			g.fillRect(0, 550, windowW, windowH);
			
		//g.drawImage(quad, 0, 0, myFrame);
			
			alexLion.drawMe(g);
			drawClouds(g);
			Vachris.drawMe(g);
			Egg.drawMe(g);
			Dw.drawMe(g);
		
		}
	
	public void drawClouds(Graphics g)
	{
		for(int i = 0; i < cList.length; i++)
		{
			cList[i].drawMe(g);
		}
	}
	
	public void checkCollisions()
	{
		if(!Vachris.getObHit() && Vachris.collision(alexLion) == true)
		{
			System.out.println("Hey there is a collision with Vachris");
			Vachris.setObHit(true);
			lives--;
			myScorePanel.repaint();
		}
		
		if(!Egg.getObHit() && Egg.collision(alexLion) == true)
		{
			System.out.println("Hey there is a collision with the Eggs");
			Egg.setObHit(true);
			lives--;
			myScorePanel.repaint();
		}
		
		if(!Dw.getObHit() && Dw.collision(alexLion) == true)
		{
			System.out.println("Hey there is a collision with the Eggs");
			Dw.setObHit(true);
			lives--;
			myScorePanel.repaint();
		}
	} 
	
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(lives > 0)
		{
		alexLion.animate();
		moveClouds();
		moveAllObstacles();
		checkCollisions();
		repaint();
		}
		else
		{ //do game over
			gameOverLabel.setVisible(true);
			repaint();
			
		}
	}
	
	public void moveAllObstacles()
	{
		boolean didReset = false;
		didReset = Vachris.moveObstacle();
		Vachris.animate();
		if(didReset)
		{
			if(Vachris.getObHit()==false)
			{
				score += GameWindow1.POINT_REWARD;
				myScorePanel.repaint();
			}
			else
			{
				Vachris.setObHit(false);
			}
		}
		
		didReset = Egg.moveObstacle();
		Egg.animate();
		if(didReset)
		{
			if(Egg.getObHit()==false)
			{
				score += GameWindow1.POINT_REWARD;
				myScorePanel.repaint();
			}
			else
			{
				Egg.setObHit(false);
			}
		}
		
		didReset = Dw.moveObstacle();
		Dw.animate();
		if(didReset)
		{
			if(Dw.getObHit()==false)
			{
				score += GameWindow1.POINT_REWARD;
				myScorePanel.repaint();
			}
			else
			{
				Dw.setObHit(false);
			}
		}
	}
	
	
	public void moveClouds()
	{
		for(int i = 0; i < cList.length; i++)
		{
			cList[i].moveCloud();
			
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Hey you typed a key");
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		/*System.out.println("Hey you pressed a key");
		System.out.println("Key has a keyCode of " + e.getKeyCode());
		System.out.println("Key has a character of " + e.getKeyChar());
		System.out.println();
		*/
		if(e.getKeyCode() == SPACE_KEY)
		{
			alexLion.jump();
			repaint();
			
		}
		//repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Hey you released a key");
	}
	
	public String getScoreStr()
	{
		return Integer.toString(score);
	}
	
	public String getLivesStr()
	{
		return Integer.toString(lives);
	}
	
	public void setControlPanel(ControlPanel p)
	{
		myScorePanel = p;
		System.out.println("My score panel has been set");
	}
	
	public void doReset()
	{
		lives = this.MAX_LIVES;
		score = 0;
		Vachris.resetPosition();
		Dw.resetPosition();
		Egg.resetPosition();
		alexLion.resetLion();
		gameOverLabel.setVisible(false);
		repaint();
		this.myScorePanel.repaint();
		this.requestFocusInWindow();
	}
	
	
}



