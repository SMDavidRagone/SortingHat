import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Flappy Lion");
		
		
		
		int fw = 1000;
		int fh = 700;
		f.setSize(fw,fh);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//LOTS OF CODE HERE
		GameWindow1 myGame = new GameWindow1(fw, (int)(fh * 0.90)-20, f);
		ControlPanel myCP = new ControlPanel(fw, (int)(fh * 0.10), myGame);
		myGame.setControlPanel(myCP);
		
		f.add(myGame, BorderLayout.CENTER);
		f.add(myCP, BorderLayout.SOUTH);
		
		f.setVisible(true);
	}

}
