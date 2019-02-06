import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ControlPanel extends JPanel implements MouseListener
{
	
	int cpWidth, cpHeight;	
	Color bc = new Color(0, 100, 180);
	GameWindow1 gw;
	JLabel scoreNum, livesNum;
	
	//*****For a new button
	JButton reset = new JButton("Reset");
	
	Font myFont = new Font("Times New Roman", Font.PLAIN, 24);
	
	//Constructor(s)
	public ControlPanel(int w, int h, GameWindow1 barney) {
		
		cpWidth = w;
		cpHeight = h;
		gw = barney;
		Color bColor = new Color(255, 70, 0);
		
		this.setSize(cpWidth, cpHeight);
		this.setPreferredSize(new Dimension(cpWidth, cpHeight));
		this.setMinimumSize(new Dimension(cpWidth, cpHeight));
		
		//set color
		this.setBackground(bc);
		
		//border set up
		this.setLayout(new BorderLayout());
		Border b = BorderFactory.createLineBorder(bColor, 10);
		this.setBorder(b);
		
		//This gets the score to show up
		JPanel scoreP = new JPanel();
		scoreP.setPreferredSize(new Dimension (cpWidth/2, cpHeight));
		scoreP.setLayout(new GridLayout(1, 1, 10, 1));
		scoreP.setBackground(new Color (0, 80, 255));
		scoreP.setBorder(BorderFactory.createEmptyBorder (
				5, (int)(cpWidth * 0.05), 5, 5));
		
		JLabel scoreLabel = new JLabel("Score: ");
		scoreLabel.setFont(myFont);
		scoreLabel.setForeground(Color.WHITE);
		scoreP.add(scoreLabel);
		
		scoreNum = new JLabel("    " + gw.getScoreStr());
		scoreNum.setFont(myFont);
		scoreNum.setForeground(Color.WHITE);
		scoreP.add(scoreNum);
		
		this.add(scoreP, BorderLayout.WEST);
		scoreP.setVisible(true);
		
		//This gets the lives to show up
		JPanel livesP = new JPanel();
		livesP.setPreferredSize(new Dimension (cpWidth/2, cpHeight));
		livesP.setLayout(new GridLayout(1, 1, 10, 1));
		livesP.setBackground(new Color (20, 220, 20));
		livesP.setBorder(BorderFactory.createEmptyBorder (
				5, (int)(cpWidth * 0.05), 5, 5));
		
		JLabel livesLabel = new JLabel("Lives: ");
		livesLabel.setFont(myFont);
		livesLabel.setForeground(Color.WHITE);
		livesP.add(livesLabel);
		
		livesNum = new JLabel("    " + gw.getLivesStr());
		livesNum.setFont(myFont);
		livesNum.setForeground(Color.WHITE);
		livesP.add(livesNum);
		
		this.add(livesP, BorderLayout.EAST);
		livesP.setVisible(true);
		
		
		livesP.add(reset);
		reset.addMouseListener(this);
		reset.setFont(myFont);
		reset.setForeground(Color.WHITE);
		reset.setLayout(new GridLayout(1, 1, 10, 1));
		reset.setBackground(new Color (100, 50, 200));
		reset.setOpaque(true);
		reset.setBorderPainted(false);
		
		
		
		this.setVisible(true);
	}
	//This will be triggered by GameWindow1
	public void paintComponent(Graphics g)
	{
		scoreNum.setText("    " + gw.getScoreStr());
		livesNum.setText("    " + gw.getLivesStr());
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("The mouse was clicked");
		System.out.println("The button is " + e.getButton());
		gw.doReset();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}